/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The base meeting object.
 */
@Schema(description = "The base meeting object.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-16T11:47:54.938371-07:00[America/Los_Angeles]")
public class RequestCreateMeeting {
  @JsonProperty("topic")
  private String topic = null;

  /**
   * The type of meeting: * &#x60;1&#x60; — An instant meeting. * &#x60;2&#x60; — A scheduled meeting.
   * * &#x60;3&#x60; — A recurring meeting with no fixed time. * &#x60;8&#x60; — A recurring meeting
   * with fixed time.
   */
  public enum TypeEnum {
    NUMBER_1(1), NUMBER_2(2), NUMBER_3(3), NUMBER_8(8);

    private Integer value;

    TypeEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("type")
  private TypeEnum type = TypeEnum.NUMBER_2;

  @JsonProperty("pre_schedule")
  private Boolean preSchedule = false;

  @JsonProperty("start_time")
  private OffsetDateTime startTime = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("schedule_for")
  private String scheduleFor = null;

  @JsonProperty("timezone")
  private String timezone = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("agenda")
  private String agenda = null;

  @JsonProperty("tracking_fields")
  private List<RequestCreateMeetingTrackingFields> trackingFields = null;

  @JsonProperty("recurrence")
  private RequestCreateMeetingRecurrence recurrence = null;

  @JsonProperty("settings")
  private RequestCreateMeetingSettings settings = null;

  @JsonProperty("template_id")
  private String templateId = null;

  public RequestCreateMeeting topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * The meeting&#x27;s topic.
   * 
   * @return topic
   **/
  @Schema(description = "The meeting's topic.")
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public RequestCreateMeeting type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of meeting: * &#x60;1&#x60; — An instant meeting. * &#x60;2&#x60; — A scheduled meeting.
   * * &#x60;3&#x60; — A recurring meeting with no fixed time. * &#x60;8&#x60; — A recurring meeting
   * with fixed time.
   * 
   * @return type
   **/
  @Schema(description = "The type of meeting: * `1` — An instant meeting. * `2` — A scheduled meeting. * `3` — A recurring meeting with no fixed time. * `8` — A recurring meeting with fixed time.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RequestCreateMeeting preSchedule(Boolean preSchedule) {
    this.preSchedule = preSchedule;
    return this;
  }

  /**
   * Whether to create a prescheduled meeting. This field only supports schedule meetings
   * (&#x60;2&#x60;): * &#x60;true&#x60; — Create a prescheduled meeting. * &#x60;false&#x60; — Create
   * a regular meeting.
   * 
   * @return preSchedule
   **/
  @Schema(description = "Whether to create a prescheduled meeting. This field only supports schedule meetings (`2`): * `true` — Create a prescheduled meeting. * `false` — Create a regular meeting.")
  public Boolean isPreSchedule() {
    return preSchedule;
  }

  public void setPreSchedule(Boolean preSchedule) {
    this.preSchedule = preSchedule;
  }

  public RequestCreateMeeting startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The meeting&#x27;s start time. This field is only used for scheduled and/or recurring meetings
   * with a fixed time. This supports local time and GMT formats. * To set a meeting&#x27;s start time
   * in GMT, use the &#x60;yyyy-MM-ddTHH:mm:ssZ&#x60; date-time format. For example,
   * &#x60;2020-03-31T12:02:00Z&#x60;. * To set a meeting&#x27;s start time using a specific timezone,
   * use the &#x60;yyyy-MM-ddTHH:mm:ss&#x60; date-time format and specify the [timezone
   * ID](https://marketplace.zoom.us/docs/api-reference/other-references/abbreviation-lists#timezones)
   * in the &#x60;timezone&#x60; field. If you do not specify a timezone, the &#x60;timezone&#x60;
   * value defaults to your Zoom account&#x27;s timezone. You can also use &#x60;UTC&#x60; for the
   * &#x60;timezone&#x60; value.
   * 
   * @return startTime
   **/
  @Schema(description = "The meeting's start time. This field is only used for scheduled and/or recurring meetings with a fixed time. This supports local time and GMT formats. * To set a meeting's start time in GMT, use the `yyyy-MM-ddTHH:mm:ssZ` date-time format. For example, `2020-03-31T12:02:00Z`. * To set a meeting's start time using a specific timezone, use the `yyyy-MM-ddTHH:mm:ss` date-time format and specify the [timezone ID](https://marketplace.zoom.us/docs/api-reference/other-references/abbreviation-lists#timezones) in the `timezone` field. If you do not specify a timezone, the `timezone` value defaults to your Zoom account's timezone. You can also use `UTC` for the `timezone` value.")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public RequestCreateMeeting duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The meeting&#x27;s scheduled duration, in minutes. This field is only used for scheduled meetings
   * (&#x60;2&#x60;).
   * 
   * @return duration
   **/
  @Schema(description = "The meeting's scheduled duration, in minutes. This field is only used for scheduled meetings (`2`).")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public RequestCreateMeeting scheduleFor(String scheduleFor) {
    this.scheduleFor = scheduleFor;
    return this;
  }

  /**
   * The email address or user ID of the user to schedule a meeting for.
   * 
   * @return scheduleFor
   **/
  @Schema(description = "The email address or user ID of the user to schedule a meeting for.")
  public String getScheduleFor() {
    return scheduleFor;
  }

  public void setScheduleFor(String scheduleFor) {
    this.scheduleFor = scheduleFor;
  }

  public RequestCreateMeeting timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The timezome to assign to the &#x60;start_time&#x60; value. This field is only used for scheduled
   * meetings (&#x60;2&#x60;). For a list of supported timezones and their format, refer to our
   * [timezone list
   * documentation](https://marketplace.zoom.us/docs/api-reference/other-references/abbreviation-lists#timezones).
   * 
   * @return timezone
   **/
  @Schema(description = "The timezome to assign to the `start_time` value. This field is only used for scheduled meetings (`2`).  For a list of supported timezones and their format, refer to our [timezone list documentation](https://marketplace.zoom.us/docs/api-reference/other-references/abbreviation-lists#timezones).")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public RequestCreateMeeting password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password required to join the meeting. By default, a password can **only** have a maximum
   * length of 10 characters and only contain alphanumeric characters and the &#x60;@&#x60;,
   * &#x60;-&#x60;, &#x60;_&#x60;, and &#x60;*&#x60; characters. * If the account owner or
   * administrator has configured [minimum passcode requirement
   * settings](https://support.zoom.us/hc/en-us/articles/360033559832-Meeting-and-webinar-passwords#h_a427384b-e383-4f80-864d-794bf0a37604),
   * the password **must** meet those requirements. * If password requirements are enabled, use the
   * [**Get User
   * Settings**](https://marketplace.zoom.us/docs/api-reference/zoom-api/users/usersettings) API or
   * the [**Get Account
   * Settings**](https://marketplace.zoom.us/docs/api-reference/zoom-api/accounts/accountsettings) API
   * to get the requirements.
   * 
   * @return password
   **/
  @Schema(description = "The password required to join the meeting. By default, a password can **only** have a maximum length of 10 characters and only contain alphanumeric characters and the `@`, `-`, `_`, and `*` characters. * If the account owner or administrator has configured [minimum passcode requirement settings](https://support.zoom.us/hc/en-us/articles/360033559832-Meeting-and-webinar-passwords#h_a427384b-e383-4f80-864d-794bf0a37604), the password **must** meet those requirements. * If password requirements are enabled, use the [**Get User Settings**](https://marketplace.zoom.us/docs/api-reference/zoom-api/users/usersettings) API or the [**Get Account Settings**](https://marketplace.zoom.us/docs/api-reference/zoom-api/accounts/accountsettings) API to get the requirements.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public RequestCreateMeeting agenda(String agenda) {
    this.agenda = agenda;
    return this;
  }

  /**
   * The meeting&#x27;s agenda. This value has a maximum length of 2,000 characters.
   * 
   * @return agenda
   **/
  @Schema(description = "The meeting's agenda. This value has a maximum length of 2,000 characters.")
  public String getAgenda() {
    return agenda;
  }

  public void setAgenda(String agenda) {
    this.agenda = agenda;
  }

  public RequestCreateMeeting trackingFields(List<RequestCreateMeetingTrackingFields> trackingFields) {
    this.trackingFields = trackingFields;
    return this;
  }

  public RequestCreateMeeting addTrackingFieldsItem(RequestCreateMeetingTrackingFields trackingFieldsItem) {
    if (this.trackingFields == null) {
      this.trackingFields = new ArrayList<RequestCreateMeetingTrackingFields>();
    }
    this.trackingFields.add(trackingFieldsItem);
    return this;
  }

  /**
   * Information about the meeting&#x27;s tracking fields.
   * 
   * @return trackingFields
   **/
  @Schema(description = "Information about the meeting's tracking fields.")
  public List<RequestCreateMeetingTrackingFields> getTrackingFields() {
    return trackingFields;
  }

  public void setTrackingFields(List<RequestCreateMeetingTrackingFields> trackingFields) {
    this.trackingFields = trackingFields;
  }

  public RequestCreateMeeting recurrence(RequestCreateMeetingRecurrence recurrence) {
    this.recurrence = recurrence;
    return this;
  }

  /**
   * Get recurrence
   * 
   * @return recurrence
   **/
  @Schema(description = "")
  public RequestCreateMeetingRecurrence getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(RequestCreateMeetingRecurrence recurrence) {
    this.recurrence = recurrence;
  }

  public RequestCreateMeeting settings(RequestCreateMeetingSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * 
   * @return settings
   **/
  @Schema(description = "")
  public RequestCreateMeetingSettings getSettings() {
    return settings;
  }

  public void setSettings(RequestCreateMeetingSettings settings) {
    this.settings = settings;
  }

  public RequestCreateMeeting templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * The admin meeting template&#x27;s unique ID. Use this field to schedule the meeting using an
   * [admin meeting
   * template](https://support.zoom.us/hc/en-us/articles/360036559151-Meeting-templates). You can get
   * this value with the [**List meeting
   * templates**](https://marketplace.zoom.us/docs/api-reference/zoom-api/meetings/listmeetingtemplates)
   * API. To create admin meeting templates, contact the Zoom support team.
   * 
   * @return templateId
   **/
  @Schema(description = "The admin meeting template's unique ID. Use this field to schedule the meeting using an [admin meeting template](https://support.zoom.us/hc/en-us/articles/360036559151-Meeting-templates). You can get this value with the [**List meeting templates**](https://marketplace.zoom.us/docs/api-reference/zoom-api/meetings/listmeetingtemplates) API.  To create admin meeting templates, contact the Zoom support team.")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCreateMeeting requestCreateMeeting = (RequestCreateMeeting) o;
    return Objects.equals(this.topic, requestCreateMeeting.topic) &&
        Objects.equals(this.type, requestCreateMeeting.type) &&
        Objects.equals(this.preSchedule, requestCreateMeeting.preSchedule) &&
        Objects.equals(this.startTime, requestCreateMeeting.startTime) &&
        Objects.equals(this.duration, requestCreateMeeting.duration) &&
        Objects.equals(this.scheduleFor, requestCreateMeeting.scheduleFor) &&
        Objects.equals(this.timezone, requestCreateMeeting.timezone) &&
        Objects.equals(this.password, requestCreateMeeting.password) &&
        Objects.equals(this.agenda, requestCreateMeeting.agenda) &&
        Objects.equals(this.trackingFields, requestCreateMeeting.trackingFields) &&
        Objects.equals(this.recurrence, requestCreateMeeting.recurrence) &&
        Objects.equals(this.settings, requestCreateMeeting.settings) &&
        Objects.equals(this.templateId, requestCreateMeeting.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic, type, preSchedule, startTime, duration, scheduleFor, timezone, password, agenda, trackingFields, recurrence, settings, templateId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCreateMeeting {\n");

    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    preSchedule: ").append(toIndentedString(preSchedule)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    scheduleFor: ").append(toIndentedString(scheduleFor)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    agenda: ").append(toIndentedString(agenda)).append("\n");
    sb.append("    trackingFields: ").append(toIndentedString(trackingFields)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
