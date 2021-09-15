/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RequestCreateMeetingSettingsLanguageInterpretationInterpreters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
public class RequestCreateMeetingSettingsLanguageInterpretationInterpreters {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("languages")
  private String languages = null;

  public RequestCreateMeetingSettingsLanguageInterpretationInterpreters email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The interpreter&#x27;s email address.
   * 
   * @return email
   **/
  @Schema(description = "The interpreter's email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public RequestCreateMeetingSettingsLanguageInterpretationInterpreters languages(String languages) {
    this.languages = languages;
    return this;
  }

  /**
   * The available interpretation languages. This string **must** contain at least two comma-separated
   * [country
   * IDs](https://marketplace.zoom.us/docs/api-reference/other-references/abbreviation-lists#countries).
   * For example, if the interpretation is English to Chinese, use the &#x60;\&quot;US,CN\&quot;&#x60;
   * value.
   * 
   * @return languages
   **/
  @Schema(description = "The available interpretation languages. This string **must** contain at least two comma-separated [country IDs](https://marketplace.zoom.us/docs/api-reference/other-references/abbreviation-lists#countries). For example, if the interpretation is English to Chinese, use the `\"US,CN\"` value.")
  public String getLanguages() {
    return languages;
  }

  public void setLanguages(String languages) {
    this.languages = languages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCreateMeetingSettingsLanguageInterpretationInterpreters requestCreateMeetingSettingsLanguageInterpretationInterpreters = (RequestCreateMeetingSettingsLanguageInterpretationInterpreters) o;
    return Objects.equals(this.email, requestCreateMeetingSettingsLanguageInterpretationInterpreters.email) &&
        Objects.equals(this.languages, requestCreateMeetingSettingsLanguageInterpretationInterpreters.languages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, languages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCreateMeetingSettingsLanguageInterpretationInterpreters {\n");

    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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
