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
 * ResponseCreateMeetingSettingsBreakoutRoomRooms
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
public class ResponseCreateMeetingSettingsBreakoutRoomRooms {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("participants")
  private List<String> participants = null;

  public ResponseCreateMeetingSettingsBreakoutRoomRooms name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the breakout room.
   * 
   * @return name
   **/
  @Schema(description = "Name of the breakout room.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResponseCreateMeetingSettingsBreakoutRoomRooms participants(List<String> participants) {
    this.participants = participants;
    return this;
  }

  public ResponseCreateMeetingSettingsBreakoutRoomRooms addParticipantsItem(String participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<String>();
    }
    this.participants.add(participantsItem);
    return this;
  }

  /**
   * Email addresses of the participants who are to be assigned to the breakout room.
   * 
   * @return participants
   **/
  @Schema(description = "Email addresses of the participants who are to be assigned to the breakout room.")
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
    ResponseCreateMeetingSettingsBreakoutRoomRooms responseCreateMeetingSettingsBreakoutRoomRooms = (ResponseCreateMeetingSettingsBreakoutRoomRooms) o;
    return Objects.equals(this.name, responseCreateMeetingSettingsBreakoutRoomRooms.name) &&
        Objects.equals(this.participants, responseCreateMeetingSettingsBreakoutRoomRooms.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, participants);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCreateMeetingSettingsBreakoutRoomRooms {\n");

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
