/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.auth;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
public class OAuth implements Authentication {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public void applyToParams(MultiValueMap<String, String> queryParams, HttpHeaders headerParams) {
    if (accessToken != null) {
      headerParams.add(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
    }
  }
}
