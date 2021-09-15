/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import us.test.openapi.graphql.ApiClient;
import us.test.openapi.graphql.model.RequestCreateMeeting;
import us.test.openapi.graphql.model.ResponseCreateMeeting;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
@Component("us.test.openapi.graphql.client.CreateMeetingApi")
public class CreateMeetingApi {
  private ApiClient apiClient;

  public CreateMeetingApi() {
    this(new ApiClient());
  }

  @Autowired
  public CreateMeetingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * MeetingTimeFrame Create Meeting
   * <p>
   * <b>200</b> - successful operation
   * 
   * @param userId Id of an existing user.
   * @param body The body parameter
   * @return ResponseCreateMeeting
   * @throws RestClientException if an error occurs while attempting to invoke the API
   */
  public ResponseCreateMeeting createMeeting(String userId, RequestCreateMeeting body) throws RestClientException {
    Object postBody = body;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling createMeeting");
    }
    // create path and map variables
    final Map<String, Object> uriVariables = new HashMap<String, Object>();
    uriVariables.put("userId", userId);
    String path = UriComponentsBuilder.fromPath("/v2/users/{userId}/meetings").buildAndExpand(uriVariables).toUriString();

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] accepts = {
        "application/json"
    };
    final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
    final String[] contentTypes = {
        "application/json"
    };
    final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"bearerAuth"};

    ParameterizedTypeReference<ResponseCreateMeeting> returnType = new ParameterizedTypeReference<ResponseCreateMeeting>() {};
    return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
  }
}
