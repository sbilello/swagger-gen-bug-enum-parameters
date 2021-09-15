/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The meeting&#x27;s [language interpretation
 * settings](https://support.zoom.us/hc/en-us/articles/360034919791-Language-interpretation-in-meetings-and-webinars).
 * This feature is only available for certain Webinar add-on, Education, Business and higher plans.
 * If this feature is **not** enabled on the host&#x27;s account, this setting will **not** be
 * applied to the meeting.
 */
@Schema(description = "The meeting's [language interpretation settings](https://support.zoom.us/hc/en-us/articles/360034919791-Language-interpretation-in-meetings-and-webinars).  This feature is only available for certain Webinar add-on, Education, Business and higher plans. If this feature is **not** enabled on the host's account, this setting will **not** be applied to the meeting.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
public class RequestCreateMeetingSettingsLanguageInterpretation {
  @JsonProperty("enable")
  private Boolean enable = null;

  @JsonProperty("interpreters")
  private List<RequestCreateMeetingSettingsLanguageInterpretationInterpreters> interpreters = null;

  public RequestCreateMeetingSettingsLanguageInterpretation enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Whether to enable [language
   * interpretation](https://support.zoom.us/hc/en-us/articles/360034919791-Language-interpretation-in-meetings-and-webinars)
   * for the meeting.
   * 
   * @return enable
   **/
  @Schema(description = "Whether to enable [language interpretation](https://support.zoom.us/hc/en-us/articles/360034919791-Language-interpretation-in-meetings-and-webinars) for the meeting.")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public RequestCreateMeetingSettingsLanguageInterpretation interpreters(List<RequestCreateMeetingSettingsLanguageInterpretationInterpreters> interpreters) {
    this.interpreters = interpreters;
    return this;
  }

  public RequestCreateMeetingSettingsLanguageInterpretation addInterpretersItem(RequestCreateMeetingSettingsLanguageInterpretationInterpreters interpretersItem) {
    if (this.interpreters == null) {
      this.interpreters = new ArrayList<RequestCreateMeetingSettingsLanguageInterpretationInterpreters>();
    }
    this.interpreters.add(interpretersItem);
    return this;
  }

  /**
   * Information about the meeting&#x27;s interpreter.
   * 
   * @return interpreters
   **/
  @Schema(description = "Information about the meeting's interpreter.")
  public List<RequestCreateMeetingSettingsLanguageInterpretationInterpreters> getInterpreters() {
    return interpreters;
  }

  public void setInterpreters(List<RequestCreateMeetingSettingsLanguageInterpretationInterpreters> interpreters) {
    this.interpreters = interpreters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCreateMeetingSettingsLanguageInterpretation requestCreateMeetingSettingsLanguageInterpretation = (RequestCreateMeetingSettingsLanguageInterpretation) o;
    return Objects.equals(this.enable, requestCreateMeetingSettingsLanguageInterpretation.enable) &&
        Objects.equals(this.interpreters, requestCreateMeetingSettingsLanguageInterpretation.interpreters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, interpreters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCreateMeetingSettingsLanguageInterpretation {\n");

    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    interpreters: ").append(toIndentedString(interpreters)).append("\n");
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
