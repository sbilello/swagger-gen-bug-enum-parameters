/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.model;

import java.util.Objects;

import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Occurence object. This object is only returned for Recurring Webinars.
 */
@Schema(description = "Occurence object. This object is only returned for Recurring Webinars.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-16T11:47:54.938371-07:00[America/Los_Angeles]")
public class ResponseCreateMeetingOccurrences {
  @JsonProperty("occurrence_id")
  private String occurrenceId = null;

  @JsonProperty("start_time")
  private OffsetDateTime startTime = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("status")
  private String status = null;

  public ResponseCreateMeetingOccurrences occurrenceId(String occurrenceId) {
    this.occurrenceId = occurrenceId;
    return this;
  }

  /**
   * Occurrence ID: Unique Identifier that identifies an occurrence of a recurring webinar. [Recurring
   * webinars](https://support.zoom.us/hc/en-us/articles/216354763-How-to-Schedule-A-Recurring-Webinar)
   * can have a maximum of 50 occurrences.
   * 
   * @return occurrenceId
   **/
  @Schema(description = "Occurrence ID: Unique Identifier that identifies an occurrence of a recurring webinar. [Recurring webinars](https://support.zoom.us/hc/en-us/articles/216354763-How-to-Schedule-A-Recurring-Webinar) can have a maximum of 50 occurrences.")
  public String getOccurrenceId() {
    return occurrenceId;
  }

  public void setOccurrenceId(String occurrenceId) {
    this.occurrenceId = occurrenceId;
  }

  public ResponseCreateMeetingOccurrences startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Start time.
   * 
   * @return startTime
   **/
  @Schema(description = "Start time.")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public ResponseCreateMeetingOccurrences duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration.
   * 
   * @return duration
   **/
  @Schema(description = "Duration.")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public ResponseCreateMeetingOccurrences status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Occurrence status.
   * 
   * @return status
   **/
  @Schema(description = "Occurrence status.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCreateMeetingOccurrences responseCreateMeetingOccurrences = (ResponseCreateMeetingOccurrences) o;
    return Objects.equals(this.occurrenceId, responseCreateMeetingOccurrences.occurrenceId) &&
        Objects.equals(this.startTime, responseCreateMeetingOccurrences.startTime) &&
        Objects.equals(this.duration, responseCreateMeetingOccurrences.duration) &&
        Objects.equals(this.status, responseCreateMeetingOccurrences.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occurrenceId, startTime, duration, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCreateMeetingOccurrences {\n");

    sb.append("    occurrenceId: ").append(toIndentedString(occurrenceId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
