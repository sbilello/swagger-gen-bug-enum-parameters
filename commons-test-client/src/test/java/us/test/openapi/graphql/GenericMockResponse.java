/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.mock.http.client.MockClientHttpResponse;

public class GenericMockResponse extends MockClientHttpResponse {

  private final HttpHeaders httpHeaders;

  public GenericMockResponse(byte[] body, HttpStatus statusCode, HttpHeaders httpHeaders) {
    super(body, statusCode);
    this.httpHeaders = httpHeaders;
  }

  @Override
  public HttpHeaders getHeaders() {
    return httpHeaders;
  }

}
