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
 * RequestCreateMeetingSettingsBreakoutRoomRooms
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-16T11:47:54.938371-07:00[America/Los_Angeles]")
public class RequestCreateMeetingSettingsBreakoutRoomRooms {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("participants")
  private List<String> participants = null;

  public RequestCreateMeetingSettingsBreakoutRoomRooms name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The breakout room&#x27;s name.
   * 
   * @return name
   **/
  @Schema(description = "The breakout room's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RequestCreateMeetingSettingsBreakoutRoomRooms participants(List<String> participants) {
    this.participants = participants;
    return this;
  }

  public RequestCreateMeetingSettingsBreakoutRoomRooms addParticipantsItem(String participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<String>();
    }
    this.participants.add(participantsItem);
    return this;
  }

  /**
   * The email addresses of the participants to assign to the breakout room.
   * 
   * @return participants
   **/
  @Schema(description = "The email addresses of the participants to assign to the breakout room.")
  public List<String> getParticipants() {
    return participants;
  }

  public void setParticipants(List<String> participants) {
    this.participants = participants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCreateMeetingSettingsBreakoutRoomRooms requestCreateMeetingSettingsBreakoutRoomRooms = (RequestCreateMeetingSettingsBreakoutRoomRooms) o;
    return Objects.equals(this.name, requestCreateMeetingSettingsBreakoutRoomRooms.name) &&
        Objects.equals(this.participants, requestCreateMeetingSettingsBreakoutRoomRooms.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, participants);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCreateMeetingSettingsBreakoutRoomRooms {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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
