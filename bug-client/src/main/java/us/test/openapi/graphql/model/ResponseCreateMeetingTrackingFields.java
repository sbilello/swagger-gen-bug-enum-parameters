/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ResponseCreateMeetingTrackingFields
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
public class ResponseCreateMeetingTrackingFields {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("visible")
  private Boolean visible = null;

  public ResponseCreateMeetingTrackingFields field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Label of the tracking field.
   * 
   * @return field
   **/
  @Schema(description = "Label of the tracking field.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ResponseCreateMeetingTrackingFields value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value for the field.
   * 
   * @return value
   **/
  @Schema(description = "Value for the field.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ResponseCreateMeetingTrackingFields visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

  /**
   * Indicates whether the [tracking
   * field](https://support.zoom.us/hc/en-us/articles/115000293426-Scheduling-Tracking-Fields) is
   * visible in the meeting scheduling options in the Zoom Web Portal or not. &#x60;true&#x60;:
   * Tracking field is visible. &lt;br&gt; &#x60;false&#x60;: Tracking field is not visible to the
   * users in the meeting options in the Zoom Web Portal but the field was used while scheduling this
   * meeting via API. An invisible tracking field can be used by users while scheduling meetings via
   * API only.
   * 
   * @return visible
   **/
  @Schema(description = "Indicates whether the [tracking field](https://support.zoom.us/hc/en-us/articles/115000293426-Scheduling-Tracking-Fields) is visible in the meeting scheduling options in the Zoom Web Portal or not.  `true`: Tracking field is visible. <br>  `false`: Tracking field is not visible to the users in the meeting options in the Zoom Web Portal but the field was used while scheduling this meeting via API. An invisible tracking field can be used by users while scheduling meetings via API only.")
  public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCreateMeetingTrackingFields responseCreateMeetingTrackingFields = (ResponseCreateMeetingTrackingFields) o;
    return Objects.equals(this.field, responseCreateMeetingTrackingFields.field) &&
        Objects.equals(this.value, responseCreateMeetingTrackingFields.value) &&
        Objects.equals(this.visible, responseCreateMeetingTrackingFields.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, value, visible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCreateMeetingTrackingFields {\n");

    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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
