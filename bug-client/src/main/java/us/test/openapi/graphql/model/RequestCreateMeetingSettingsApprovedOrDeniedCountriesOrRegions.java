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
 * The list of approved or blocked users from specific countries or regions who can join the
 * meeting.
 */
@Schema(description = "The list of approved or blocked users from specific countries or regions who can join the meeting.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
public class RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions {
  @JsonProperty("enable")
  private Boolean enable = null;

  /**
   * Whether to allow or block users from specific countries or regions: * &#x60;approve&#x60; — Allow
   * users from specific countries or regions to join the meeting. If you select this setting, you
   * must include the approved countries or regions in the &#x60;approved_list&#x60; field. *
   * &#x60;deny&#x60; — Block users from specific countries or regions from joining the meeting. If
   * you select this setting, you must include the blocked countries or regions in the
   * &#x60;denied_list&#x60; field.
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

  public RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Whether to enable the [**Approve or block entry for users from specific
   * countries/regions**](https://support.zoom.us/hc/en-us/articles/360060086231-Approve-or-block-entry-for-users-from-specific-countries-regions)
   * setting.
   * 
   * @return enable
   **/
  @Schema(description = "Whether to enable the [**Approve or block entry for users from specific countries/regions**](https://support.zoom.us/hc/en-us/articles/360060086231-Approve-or-block-entry-for-users-from-specific-countries-regions) setting.")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions method(MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * Whether to allow or block users from specific countries or regions: * &#x60;approve&#x60; — Allow
   * users from specific countries or regions to join the meeting. If you select this setting, you
   * must include the approved countries or regions in the &#x60;approved_list&#x60; field. *
   * &#x60;deny&#x60; — Block users from specific countries or regions from joining the meeting. If
   * you select this setting, you must include the blocked countries or regions in the
   * &#x60;denied_list&#x60; field.
   * 
   * @return method
   **/
  @Schema(description = "Whether to allow or block users from specific countries or regions: * `approve` — Allow users from specific countries or regions to join the meeting. If you select this setting, you must include the approved countries or regions in the `approved_list` field. * `deny` — Block users from specific countries or regions from joining the meeting. If you select this setting, you must include the blocked countries or regions in the `denied_list` field.")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions approvedList(List<String> approvedList) {
    this.approvedList = approvedList;
    return this;
  }

  public RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions addApprovedListItem(String approvedListItem) {
    if (this.approvedList == null) {
      this.approvedList = new ArrayList<String>();
    }
    this.approvedList.add(approvedListItem);
    return this;
  }

  /**
   * The list of approved countries or regions.
   * 
   * @return approvedList
   **/
  @Schema(description = "The list of approved countries or regions.")
  public List<String> getApprovedList() {
    return approvedList;
  }

  public void setApprovedList(List<String> approvedList) {
    this.approvedList = approvedList;
  }

  public RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions deniedList(List<String> deniedList) {
    this.deniedList = deniedList;
    return this;
  }

  public RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions addDeniedListItem(String deniedListItem) {
    if (this.deniedList == null) {
      this.deniedList = new ArrayList<String>();
    }
    this.deniedList.add(deniedListItem);
    return this;
  }

  /**
   * The list of blocked countries or regions.
   * 
   * @return deniedList
   **/
  @Schema(description = "The list of blocked countries or regions.")
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
    RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions requestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions = (RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions) o;
    return Objects.equals(this.enable, requestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions.enable) &&
        Objects.equals(this.method, requestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions.method) &&
        Objects.equals(this.approvedList, requestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions.approvedList) &&
        Objects.equals(this.deniedList, requestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions.deniedList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, method, approvedList, deniedList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions {\n");

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
