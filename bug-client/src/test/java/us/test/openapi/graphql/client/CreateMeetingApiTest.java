/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.client;


import org.apache.logging.log4j.util.Strings;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import us.test.openapi.graphql.api.MockRestTemplateServerTest;
import us.test.openapi.graphql.model.RequestCreateMeeting;
import us.test.openapi.graphql.model.ResponseCreateMeeting;
import us.test.openapi.graphql.util.FileReader;
import us.test.openapi.graphql.util.JsonHelper;

/**
 * API tests for CreateMeetingApi
 */
public class CreateMeetingApiTest extends MockRestTemplateServerTest {


  private final String expectedResponse;


  public CreateMeetingApiTest() {
    // This file should be retrieved by the response from curl so it is easy to spot any missing field
    // in the deserialization
    expectedResponse = FileReader.readFile("create-meeting/create-meeting-response.json");
  }

  @Override
  protected String getExpectedResponse() {
    return expectedResponse;
  }

  /**
   * Create Meeting
   */
  @Test
  public void shouldCreateMeetingTest() {
    CreateMeetingApi api = new CreateMeetingApi(getApiClient());
    String userId = "me";
    RequestCreateMeeting body = new RequestCreateMeeting();
    body.setTopic("ciao");
    ResponseCreateMeeting response = api.createMeeting(userId, body);
    Assert.assertEquals(expectedResponse, JsonHelper.toJson(response).orElse(Strings.EMPTY));
  }


}
