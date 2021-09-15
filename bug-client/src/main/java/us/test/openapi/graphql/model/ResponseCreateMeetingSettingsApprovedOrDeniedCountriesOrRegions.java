/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Approve or block users from specific regions/countries from joining this meeting.
 */
@Schema(description = "Approve or block users from specific regions/countries from joining this meeting. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
public class ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions {
  @JsonProperty("enable")
  private Boolean enable = null;

  /**
   * Specify whether to allow users from specific regions to join this meeting; or block users from
   * specific regions from joining this meeting. &lt;br&gt;&lt;br&gt; &#x60;approve&#x60;: Allow users
   * from specific regions/countries to join this meeting. If this setting is selected, the approved
   * regions/countries must be included in the &#x60;approved_list&#x60;.&lt;br&gt;&lt;br&gt;
   * &#x60;deny&#x60;: Block users from specific regions/countries from joining this meeting. If this
   * setting is selected, the approved regions/countries must be included in the
   * &#x60;denied_list&#x60;
   */
  public enum MethodEnum {
    APPROVE("approve"), DENY("deny");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("method")
  private MethodEnum method = null;

  @JsonProperty("approved_list")
  private List<String> approvedList = null;

  @JsonProperty("denied_list")
  private List<String> deniedList = null;

  public ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * &#x60;true&#x60;: Setting enabled to either allow users or block users from specific regions to
   * join your meetings. &lt;br&gt; &#x60;false&#x60;: Setting disabled.
   * 
   * @return enable
   **/
  @Schema(description = "`true`: Setting enabled to either allow users or block users from specific regions to join your meetings. <br>  `false`: Setting disabled.")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions method(MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * Specify whether to allow users from specific regions to join this meeting; or block users from
   * specific regions from joining this meeting. &lt;br&gt;&lt;br&gt; &#x60;approve&#x60;: Allow users
   * from specific regions/countries to join this meeting. If this setting is selected, the approved
   * regions/countries must be included in the &#x60;approved_list&#x60;.&lt;br&gt;&lt;br&gt;
   * &#x60;deny&#x60;: Block users from specific regions/countries from joining this meeting. If this
   * setting is selected, the approved regions/countries must be included in the
   * &#x60;denied_list&#x60;
   * 
   * @return method
   **/
  @Schema(description = "Specify whether to allow users from specific regions to join this meeting; or block users from specific regions from joining this meeting. <br><br> `approve`: Allow users from specific regions/countries to join this meeting. If this setting is selected, the approved regions/countries must be included in the `approved_list`.<br><br> `deny`: Block users from specific regions/countries from joining this meeting. If this setting is selected, the approved regions/countries must be included in the `denied_list`")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions approvedList(List<String> approvedList) {
    this.approvedList = approvedList;
    return this;
  }

  public ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions addApprovedListItem(String approvedListItem) {
    if (this.approvedList == null) {
      this.approvedList = new ArrayList<String>();
    }
    this.approvedList.add(approvedListItem);
    return this;
  }

  /**
   * List of countries/regions from where participants can join this meeting.
   * 
   * @return approvedList
   **/
  @Schema(description = "List of countries/regions from where participants can join this meeting. ")
  public List<String> getApprovedList() {
    return approvedList;
  }

  public void setApprovedList(List<String> approvedList) {
    this.approvedList = approvedList;
  }

  public ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions deniedList(List<String> deniedList) {
    this.deniedList = deniedList;
    return this;
  }

  public ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions addDeniedListItem(String deniedListItem) {
    if (this.deniedList == null) {
      this.deniedList = new ArrayList<String>();
    }
    this.deniedList.add(deniedListItem);
    return this;
  }

  /**
   * List of countries/regions from where participants can not join this meeting.
   * 
   * @return deniedList
   **/
  @Schema(description = "List of countries/regions from where participants can not join this meeting. ")
  public List<String> getDeniedList() {
    return deniedList;
  }

  public void setDeniedList(List<String> deniedList) {
    this.deniedList = deniedList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions responseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions = (ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions) o;
    return Objects.equals(this.enable, responseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions.enable) &&
        Objects.equals(this.method, responseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions.method) &&
        Objects.equals(this.approvedList, responseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions.approvedList) &&
        Objects.equals(this.deniedList, responseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions.deniedList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, method, approvedList, deniedList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions {\n");

    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    approvedList: ").append(toIndentedString(approvedList)).append("\n");
    sb.append("    deniedList: ").append(toIndentedString(deniedList)).append("\n");
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
