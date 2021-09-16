/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RequestCreateMeetingTrackingFields
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-16T11:47:54.938371-07:00[America/Los_Angeles]")
public class RequestCreateMeetingTrackingFields {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("value")
  private String value = null;

  public RequestCreateMeetingTrackingFields field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The tracking field&#x27;s label.
   * 
   * @return field
   **/
  @Schema(required = true, description = "The tracking field's label.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public RequestCreateMeetingTrackingFields value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The tracking field&#x27;s value.
   * 
   * @return value
   **/
  @Schema(description = "The tracking field's value.")
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
    RequestCreateMeetingTrackingFields requestCreateMeetingTrackingFields = (RequestCreateMeetingTrackingFields) o;
    return Objects.equals(this.field, requestCreateMeetingTrackingFields.field) &&
        Objects.equals(this.value, requestCreateMeetingTrackingFields.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCreateMeetingTrackingFields {\n");

    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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
