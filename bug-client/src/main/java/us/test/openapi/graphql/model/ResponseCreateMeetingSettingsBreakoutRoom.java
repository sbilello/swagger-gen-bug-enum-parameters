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
 * Setting to [pre-assign breakout
 * rooms](https://support.zoom.us/hc/en-us/articles/360032752671-Pre-assigning-participants-to-breakout-rooms#h_36f71353-4190-48a2-b999-ca129861c1f4).
 */
@Schema(description = "Setting to [pre-assign breakout rooms](https://support.zoom.us/hc/en-us/articles/360032752671-Pre-assigning-participants-to-breakout-rooms#h_36f71353-4190-48a2-b999-ca129861c1f4).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
public class ResponseCreateMeetingSettingsBreakoutRoom {
  @JsonProperty("enable")
  private Boolean enable = null;

  @JsonProperty("rooms")
  private List<ResponseCreateMeetingSettingsBreakoutRoomRooms> rooms = null;

  public ResponseCreateMeetingSettingsBreakoutRoom enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Set the value of this field to &#x60;true&#x60; if you would like to enable the [breakout room
   * pre-assign](https://support.zoom.us/hc/en-us/articles/360032752671-Pre-assigning-participants-to-breakout-rooms#h_36f71353-4190-48a2-b999-ca129861c1f4)
   * option.
   * 
   * @return enable
   **/
  @Schema(description = "Set the value of this field to `true` if you would like to enable the [breakout room pre-assign](https://support.zoom.us/hc/en-us/articles/360032752671-Pre-assigning-participants-to-breakout-rooms#h_36f71353-4190-48a2-b999-ca129861c1f4) option.")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public ResponseCreateMeetingSettingsBreakoutRoom rooms(List<ResponseCreateMeetingSettingsBreakoutRoomRooms> rooms) {
    this.rooms = rooms;
    return this;
  }

  public ResponseCreateMeetingSettingsBreakoutRoom addRoomsItem(ResponseCreateMeetingSettingsBreakoutRoomRooms roomsItem) {
    if (this.rooms == null) {
      this.rooms = new ArrayList<ResponseCreateMeetingSettingsBreakoutRoomRooms>();
    }
    this.rooms.add(roomsItem);
    return this;
  }

  /**
   * Create room(s).
   * 
   * @return rooms
   **/
  @Schema(description = "Create room(s).")
  public List<ResponseCreateMeetingSettingsBreakoutRoomRooms> getRooms() {
    return rooms;
  }

  public void setRooms(List<ResponseCreateMeetingSettingsBreakoutRoomRooms> rooms) {
    this.rooms = rooms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCreateMeetingSettingsBreakoutRoom responseCreateMeetingSettingsBreakoutRoom = (ResponseCreateMeetingSettingsBreakoutRoom) o;
    return Objects.equals(this.enable, responseCreateMeetingSettingsBreakoutRoom.enable) &&
        Objects.equals(this.rooms, responseCreateMeetingSettingsBreakoutRoom.rooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, rooms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCreateMeetingSettingsBreakoutRoom {\n");

    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
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
