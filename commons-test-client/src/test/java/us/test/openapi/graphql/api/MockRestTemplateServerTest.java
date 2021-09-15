/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.api;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;

import lombok.extern.slf4j.Slf4j;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.mock.http.client.MockClientHttpRequest;
import org.springframework.mock.http.client.MockClientHttpResponse;
import org.springframework.web.client.RestTemplate;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZonedDateTime;

import us.test.openapi.graphql.ApiClient;
import us.test.openapi.graphql.CustomInstantDeserializer;
import us.test.openapi.graphql.GenericMockResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.threetenbp.ThreeTenModule;

/**
 * API tests for Mocking Any Server Response for a RestTemplate API Call
 */
@RunWith(MockitoJUnitRunner.class)
@Slf4j
public abstract class MockRestTemplateServerTest {

  private ApiClient apiClient;

  protected abstract String getExpectedResponse();

  protected ApiClient getApiClient() {
    return apiClient;
  }

  @Before
  public void setUp() throws IOException {
    ClientHttpRequestFactory requestFactory = mock(ClientHttpRequestFactory.class);
    ClientHttpRequest clientHttpRequest = mock(ClientHttpRequest.class);
    RestTemplate restTemplate = new RestTemplate(requestFactory);
    for (HttpMessageConverter converter : restTemplate.getMessageConverters()) {
      if (converter instanceof AbstractJackson2HttpMessageConverter) {
        ObjectMapper mapper = ((AbstractJackson2HttpMessageConverter) converter).getObjectMapper();
        ThreeTenModule module = new ThreeTenModule();
        module.addDeserializer(Instant.class, CustomInstantDeserializer.INSTANT);
        module.addDeserializer(OffsetDateTime.class, CustomInstantDeserializer.OFFSET_DATE_TIME);
        module.addDeserializer(ZonedDateTime.class, CustomInstantDeserializer.ZONED_DATE_TIME);
        mapper.registerModule(module);
      }
    }
    restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(restTemplate.getRequestFactory()));
    MockClientHttpRequest mockClientHttpRequest = new MockClientHttpRequest();
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON.toString());
    MockClientHttpResponse clientHttpResponse = new GenericMockResponse(getExpectedResponse().getBytes(), HttpStatus.OK, httpHeaders);
    mockClientHttpRequest.setResponse(clientHttpResponse);
    when(requestFactory.createRequest(Mockito.anyObject(), Mockito.anyObject())).thenReturn(mockClientHttpRequest);
    when(clientHttpRequest.execute()).thenReturn(clientHttpResponse);
    apiClient = new ApiClient(restTemplate);
  }


}
