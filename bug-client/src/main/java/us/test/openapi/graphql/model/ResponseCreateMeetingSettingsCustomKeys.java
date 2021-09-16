/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ResponseCreateMeetingSettingsCustomKeys
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-16T11:47:54.938371-07:00[America/Los_Angeles]")
public class ResponseCreateMeetingSettingsCustomKeys {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  public ResponseCreateMeetingSettingsCustomKeys key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Custom key associated with the user.
   * 
   * @return key
   **/
  @Schema(description = "Custom key associated with the user.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ResponseCreateMeetingSettingsCustomKeys value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the custom key associated with the user.
   * 
   * @return value
   **/
  @Schema(description = "Value of the custom key associated with the user.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCreateMeetingSettingsCustomKeys responseCreateMeetingSettingsCustomKeys = (ResponseCreateMeetingSettingsCustomKeys) o;
    return Objects.equals(this.key, responseCreateMeetingSettingsCustomKeys.key) &&
        Objects.equals(this.value, responseCreateMeetingSettingsCustomKeys.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCreateMeetingSettingsCustomKeys {\n");

    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
