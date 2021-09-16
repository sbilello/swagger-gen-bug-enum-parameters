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
 * ResponseCreateMeetingSettingsLanguageInterpretation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-16T11:47:54.938371-07:00[America/Los_Angeles]")
public class ResponseCreateMeetingSettingsLanguageInterpretation {
  @JsonProperty("enable")
  private Boolean enable = null;

  @JsonProperty("interpreters")
  private List<ResponseCreateMeetingSettingsLanguageInterpretationInterpreters> interpreters = null;

  public ResponseCreateMeetingSettingsLanguageInterpretation enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Get enable
   * 
   * @return enable
   **/
  @Schema(description = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public ResponseCreateMeetingSettingsLanguageInterpretation interpreters(List<ResponseCreateMeetingSettingsLanguageInterpretationInterpreters> interpreters) {
    this.interpreters = interpreters;
    return this;
  }

  public ResponseCreateMeetingSettingsLanguageInterpretation addInterpretersItem(ResponseCreateMeetingSettingsLanguageInterpretationInterpreters interpretersItem) {
    if (this.interpreters == null) {
      this.interpreters = new ArrayList<ResponseCreateMeetingSettingsLanguageInterpretationInterpreters>();
    }
    this.interpreters.add(interpretersItem);
    return this;
  }

  /**
   * Information associated with the interpreter.
   * 
   * @return interpreters
   **/
  @Schema(description = "Information associated with the interpreter.")
  public List<ResponseCreateMeetingSettingsLanguageInterpretationInterpreters> getInterpreters() {
    return interpreters;
  }

  public void setInterpreters(List<ResponseCreateMeetingSettingsLanguageInterpretationInterpreters> interpreters) {
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
    ResponseCreateMeetingSettingsLanguageInterpretation responseCreateMeetingSettingsLanguageInterpretation = (ResponseCreateMeetingSettingsLanguageInterpretation) o;
    return Objects.equals(this.enable, responseCreateMeetingSettingsLanguageInterpretation.enable) &&
        Objects.equals(this.interpreters, responseCreateMeetingSettingsLanguageInterpretation.interpreters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, interpreters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCreateMeetingSettingsLanguageInterpretation {\n");

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
