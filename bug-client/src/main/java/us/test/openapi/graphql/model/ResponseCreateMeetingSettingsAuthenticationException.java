/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ResponseCreateMeetingSettingsAuthenticationException
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
public class ResponseCreateMeetingSettingsAuthenticationException {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("email")
  private String email = null;

  public ResponseCreateMeetingSettingsAuthenticationException name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the participant.
   * 
   * @return name
   **/
  @Schema(description = "Name of the participant.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResponseCreateMeetingSettingsAuthenticationException email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address of the participant.
   * 
   * @return email
   **/
  @Schema(description = "Email address of the participant.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCreateMeetingSettingsAuthenticationException responseCreateMeetingSettingsAuthenticationException = (ResponseCreateMeetingSettingsAuthenticationException) o;
    return Objects.equals(this.name, responseCreateMeetingSettingsAuthenticationException.name) &&
        Objects.equals(this.email, responseCreateMeetingSettingsAuthenticationException.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCreateMeetingSettingsAuthenticationException {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
