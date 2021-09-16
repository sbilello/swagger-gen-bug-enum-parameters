/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ResponseCreateMeetingSettingsLanguageInterpretationInterpreters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-16T11:47:54.938371-07:00[America/Los_Angeles]")
public class ResponseCreateMeetingSettingsLanguageInterpretationInterpreters {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("languages")
  private String languages = null;

  public ResponseCreateMeetingSettingsLanguageInterpretationInterpreters email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address of the interpreter.
   * 
   * @return email
   **/
  @Schema(description = "Email address of the interpreter.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ResponseCreateMeetingSettingsLanguageInterpretationInterpreters languages(String languages) {
    this.languages = languages;
    return this;
  }

  /**
   * Languages for interpretation. The string must contain two [country
   * Ids](https://marketplace.zoom.us/docs/api-reference/other-references/abbreviation-lists#countries)
   * separated by a comma. For example, if the language is to be interpreted from English to Chinese,
   * the value of this field should be \&quot;US,CN\&quot;.
   * 
   * @return languages
   **/
  @Schema(description = "Languages for interpretation. The string must contain two [country Ids](https://marketplace.zoom.us/docs/api-reference/other-references/abbreviation-lists#countries) separated by a comma.   For example, if the language is to be interpreted from English to Chinese, the value of this field should be \"US,CN\".")
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
    ResponseCreateMeetingSettingsLanguageInterpretationInterpreters responseCreateMeetingSettingsLanguageInterpretationInterpreters = (ResponseCreateMeetingSettingsLanguageInterpretationInterpreters) o;
    return Objects.equals(this.email, responseCreateMeetingSettingsLanguageInterpretationInterpreters.email) &&
        Objects.equals(this.languages, responseCreateMeetingSettingsLanguageInterpretationInterpreters.languages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, languages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCreateMeetingSettingsLanguageInterpretationInterpreters {\n");

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
