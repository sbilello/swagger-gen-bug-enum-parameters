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
 * Meeting object
 */
@Schema(description = "Meeting object")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
public class ResponseCreateMeeting {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("assistant_id")
  private String assistantId = null;

  @JsonProperty("host_email")
  private String hostEmail = null;

  @JsonProperty("registration_url")
  private String registrationUrl = null;

  @JsonProperty("topic")
  private String topic = null;

  /**
   * Meeting Type
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

  @JsonProperty("timezone")
  private String timezone = null;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt = null;

  @JsonProperty("agenda")
  private String agenda = null;

  @JsonProperty("start_url")
  private String startUrl = null;

  @JsonProperty("join_url")
  private String joinUrl = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("h323_password")
  private String h323Password = null;

  @JsonProperty("pmi")
  private Long pmi = null;

  @JsonProperty("tracking_fields")
  private List<ResponseCreateMeetingTrackingFields> trackingFields = null;

  @JsonProperty("occurrences")
  private List<ResponseCreateMeetingOccurrences> occurrences = null;

  @JsonProperty("settings")
  private ResponseCreateMeetingSettings settings = null;

  @JsonProperty("recurrence")
  private ResponseCreateMeetingRecurrence recurrence = null;

  public ResponseCreateMeeting id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * [Meeting ID](https://support.zoom.us/hc/en-us/articles/201362373-What-is-a-Meeting-ID-): Unique
   * identifier of the meeting in \&quot;**long**\&quot; format(represented as int64 data type in
   * JSON), also known as the meeting number.
   * 
   * @return id
   **/
  @Schema(description = "[Meeting ID](https://support.zoom.us/hc/en-us/articles/201362373-What-is-a-Meeting-ID-): Unique identifier of the meeting in \"**long**\" format(represented as int64 data type in JSON), also known as the meeting number.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ResponseCreateMeeting assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

  /**
   * Unique identifier of the scheduler who scheduled this meeting on behalf of the host. This field
   * is only returned if you used \&quot;schedule_for\&quot; option in the [Create a Meeting API
   * request](https://marketplace.zoom.us/docs/api-reference/zoom-api/meetings/meetingcreate).
   * 
   * @return assistantId
   **/
  @Schema(description = "Unique identifier of the scheduler who scheduled this meeting on behalf of the host. This field is only returned if you used \"schedule_for\" option in the [Create a Meeting API request](https://marketplace.zoom.us/docs/api-reference/zoom-api/meetings/meetingcreate).")
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  public ResponseCreateMeeting hostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
    return this;
  }

  /**
   * Email address of the meeting host.
   * 
   * @return hostEmail
   **/
  @Schema(description = "Email address of the meeting host.")
  public String getHostEmail() {
    return hostEmail;
  }

  public void setHostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
  }

  public ResponseCreateMeeting registrationUrl(String registrationUrl) {
    this.registrationUrl = registrationUrl;
    return this;
  }

  /**
   * URL using which registrants can register for a meeting. This field is only returned for meetings
   * that have enabled registration.
   * 
   * @return registrationUrl
   **/
  @Schema(description = "URL using which registrants can register for a meeting. This field is only returned for meetings that have enabled registration.")
  public String getRegistrationUrl() {
    return registrationUrl;
  }

  public void setRegistrationUrl(String registrationUrl) {
    this.registrationUrl = registrationUrl;
  }

  public ResponseCreateMeeting topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Meeting topic
   * 
   * @return topic
   **/
  @Schema(description = "Meeting topic")
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public ResponseCreateMeeting type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Meeting Type
   * 
   * @return type
   **/
  @Schema(description = "Meeting Type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ResponseCreateMeeting preSchedule(Boolean preSchedule) {
    this.preSchedule = preSchedule;
    return this;
  }

  /**
   * Whether to create a prescheduled meeting. This **only** supports the meeting &#x60;type&#x60;
   * value of &#x60;2&#x60; (Scheduled Meeting): * &#x60;true&#x60; — Create a prescheduled meeting. *
   * &#x60;false&#x60; — Create a regular meeting.
   * 
   * @return preSchedule
   **/
  @Schema(description = "Whether to create a prescheduled meeting. This **only** supports the meeting `type` value of `2` (Scheduled Meeting): * `true` — Create a prescheduled meeting. * `false` — Create a regular meeting.")
  public Boolean isPreSchedule() {
    return preSchedule;
  }

  public void setPreSchedule(Boolean preSchedule) {
    this.preSchedule = preSchedule;
  }

  public ResponseCreateMeeting startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Meeting start date-time in UTC/GMT. Example: \&quot;2020-03-31T12:02:00Z\&quot;
   * 
   * @return startTime
   **/
  @Schema(description = "Meeting start date-time in UTC/GMT. Example: \"2020-03-31T12:02:00Z\"")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public ResponseCreateMeeting duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Meeting duration.
   * 
   * @return duration
   **/
  @Schema(description = "Meeting duration.")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public ResponseCreateMeeting timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Timezone to format start_time
   * 
   * @return timezone
   **/
  @Schema(description = "Timezone to format start_time")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public ResponseCreateMeeting createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time at which this meeting was created.
   * 
   * @return createdAt
   **/
  @Schema(description = "The date and time at which this meeting was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ResponseCreateMeeting agenda(String agenda) {
    this.agenda = agenda;
    return this;
  }

  /**
   * Agenda
   * 
   * @return agenda
   **/
  @Schema(description = "Agenda")
  public String getAgenda() {
    return agenda;
  }

  public void setAgenda(String agenda) {
    this.agenda = agenda;
  }

  public ResponseCreateMeeting startUrl(String startUrl) {
    this.startUrl = startUrl;
    return this;
  }

  /**
   * URL to start the meeting. This URL should only be used by the host of the meeting and **should
   * not be shared with anyone other than the host** of the meeting as anyone with this URL will be
   * able to login to the Zoom Client as the host of the meeting.
   * 
   * @return startUrl
   **/
  @Schema(description = "URL to start the meeting. This URL should only be used by the host of the meeting and **should not be shared with anyone other than the host** of the meeting as anyone with this URL will be able to login to the Zoom Client as the host of the meeting.")
  public String getStartUrl() {
    return startUrl;
  }

  public void setStartUrl(String startUrl) {
    this.startUrl = startUrl;
  }

  public ResponseCreateMeeting joinUrl(String joinUrl) {
    this.joinUrl = joinUrl;
    return this;
  }

  /**
   * URL for participants to join the meeting. This URL should only be shared with users that you
   * would like to invite for the meeting.
   * 
   * @return joinUrl
   **/
  @Schema(description = "URL for participants to join the meeting. This URL should only be shared with users that you would like to invite for the meeting.")
  public String getJoinUrl() {
    return joinUrl;
  }

  public void setJoinUrl(String joinUrl) {
    this.joinUrl = joinUrl;
  }

  public ResponseCreateMeeting password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Meeting password. Password may only contain the following characters: &#x60;[a-z A-Z 0-9 @ - _ *
   * !]&#x60; If \&quot;Require a password when scheduling new meetings\&quot; setting has been
   * **enabled** **and**
   * [locked](https://support.zoom.us/hc/en-us/articles/115005269866-Using-Tiered-Settings#locked) for
   * the user, the password field will be autogenerated in the response even if it is not provided in
   * the API request.
   * 
   * @return password
   **/
  @Schema(description = "Meeting password. Password may only contain the following characters: `[a-z A-Z 0-9 @ - _ * !]`  If \"Require a password when scheduling new meetings\" setting has been **enabled** **and** [locked](https://support.zoom.us/hc/en-us/articles/115005269866-Using-Tiered-Settings#locked) for the user, the password field will be autogenerated in the response even if it is not provided in the API request.    ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ResponseCreateMeeting h323Password(String h323Password) {
    this.h323Password = h323Password;
    return this;
  }

  /**
   * H.323/SIP room system password
   * 
   * @return h323Password
   **/
  @Schema(description = "H.323/SIP room system password")
  public String getH323Password() {
    return h323Password;
  }

  public void setH323Password(String h323Password) {
    this.h323Password = h323Password;
  }

  public ResponseCreateMeeting pmi(Long pmi) {
    this.pmi = pmi;
    return this;
  }

  /**
   * Personal Meeting Id. Only used for scheduled meetings and recurring meetings with no fixed time.
   * 
   * @return pmi
   **/
  @Schema(description = "Personal Meeting Id. Only used for scheduled meetings and recurring meetings with no fixed time.")
  public Long getPmi() {
    return pmi;
  }

  public void setPmi(Long pmi) {
    this.pmi = pmi;
  }

  public ResponseCreateMeeting trackingFields(List<ResponseCreateMeetingTrackingFields> trackingFields) {
    this.trackingFields = trackingFields;
    return this;
  }

  public ResponseCreateMeeting addTrackingFieldsItem(ResponseCreateMeetingTrackingFields trackingFieldsItem) {
    if (this.trackingFields == null) {
      this.trackingFields = new ArrayList<ResponseCreateMeetingTrackingFields>();
    }
    this.trackingFields.add(trackingFieldsItem);
    return this;
  }

  /**
   * Tracking fields
   * 
   * @return trackingFields
   **/
  @Schema(description = "Tracking fields")
  public List<ResponseCreateMeetingTrackingFields> getTrackingFields() {
    return trackingFields;
  }

  public void setTrackingFields(List<ResponseCreateMeetingTrackingFields> trackingFields) {
    this.trackingFields = trackingFields;
  }

  public ResponseCreateMeeting occurrences(List<ResponseCreateMeetingOccurrences> occurrences) {
    this.occurrences = occurrences;
    return this;
  }

  public ResponseCreateMeeting addOccurrencesItem(ResponseCreateMeetingOccurrences occurrencesItem) {
    if (this.occurrences == null) {
      this.occurrences = new ArrayList<ResponseCreateMeetingOccurrences>();
    }
    this.occurrences.add(occurrencesItem);
    return this;
  }

  /**
   * Array of occurrence objects.
   * 
   * @return occurrences
   **/
  @Schema(description = "Array of occurrence objects.")
  public List<ResponseCreateMeetingOccurrences> getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(List<ResponseCreateMeetingOccurrences> occurrences) {
    this.occurrences = occurrences;
  }

  public ResponseCreateMeeting settings(ResponseCreateMeetingSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * 
   * @return settings
   **/
  @Schema(description = "")
  public ResponseCreateMeetingSettings getSettings() {
    return settings;
  }

  public void setSettings(ResponseCreateMeetingSettings settings) {
    this.settings = settings;
  }

  public ResponseCreateMeeting recurrence(ResponseCreateMeetingRecurrence recurrence) {
    this.recurrence = recurrence;
    return this;
  }

  /**
   * Get recurrence
   * 
   * @return recurrence
   **/
  @Schema(description = "")
  public ResponseCreateMeetingRecurrence getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(ResponseCreateMeetingRecurrence recurrence) {
    this.recurrence = recurrence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCreateMeeting responseCreateMeeting = (ResponseCreateMeeting) o;
    return Objects.equals(this.id, responseCreateMeeting.id) &&
        Objects.equals(this.assistantId, responseCreateMeeting.assistantId) &&
        Objects.equals(this.hostEmail, responseCreateMeeting.hostEmail) &&
        Objects.equals(this.registrationUrl, responseCreateMeeting.registrationUrl) &&
        Objects.equals(this.topic, responseCreateMeeting.topic) &&
        Objects.equals(this.type, responseCreateMeeting.type) &&
        Objects.equals(this.preSchedule, responseCreateMeeting.preSchedule) &&
        Objects.equals(this.startTime, responseCreateMeeting.startTime) &&
        Objects.equals(this.duration, responseCreateMeeting.duration) &&
        Objects.equals(this.timezone, responseCreateMeeting.timezone) &&
        Objects.equals(this.createdAt, responseCreateMeeting.createdAt) &&
        Objects.equals(this.agenda, responseCreateMeeting.agenda) &&
        Objects.equals(this.startUrl, responseCreateMeeting.startUrl) &&
        Objects.equals(this.joinUrl, responseCreateMeeting.joinUrl) &&
        Objects.equals(this.password, responseCreateMeeting.password) &&
        Objects.equals(this.h323Password, responseCreateMeeting.h323Password) &&
        Objects.equals(this.pmi, responseCreateMeeting.pmi) &&
        Objects.equals(this.trackingFields, responseCreateMeeting.trackingFields) &&
        Objects.equals(this.occurrences, responseCreateMeeting.occurrences) &&
        Objects.equals(this.settings, responseCreateMeeting.settings) &&
        Objects.equals(this.recurrence, responseCreateMeeting.recurrence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, assistantId, hostEmail, registrationUrl, topic, type, preSchedule, startTime, duration, timezone, createdAt, agenda, startUrl, joinUrl, password, h323Password, pmi, trackingFields, occurrences, settings, recurrence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCreateMeeting {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    hostEmail: ").append(toIndentedString(hostEmail)).append("\n");
    sb.append("    registrationUrl: ").append(toIndentedString(registrationUrl)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    preSchedule: ").append(toIndentedString(preSchedule)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    agenda: ").append(toIndentedString(agenda)).append("\n");
    sb.append("    startUrl: ").append(toIndentedString(startUrl)).append("\n");
    sb.append("    joinUrl: ").append(toIndentedString(joinUrl)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    h323Password: ").append(toIndentedString(h323Password)).append("\n");
    sb.append("    pmi: ").append(toIndentedString(pmi)).append("\n");
    sb.append("    trackingFields: ").append(toIndentedString(trackingFields)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
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
