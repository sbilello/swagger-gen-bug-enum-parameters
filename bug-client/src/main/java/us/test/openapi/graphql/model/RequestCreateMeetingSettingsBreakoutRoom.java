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
 * The [pre-assigned breakout
 * rooms](https://support.zoom.us/hc/en-us/articles/360032752671-Pre-assigning-participants-to-breakout-rooms)
 * settings.
 */
@Schema(description = "The [pre-assigned breakout rooms](https://support.zoom.us/hc/en-us/articles/360032752671-Pre-assigning-participants-to-breakout-rooms) settings.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-16T11:47:54.938371-07:00[America/Los_Angeles]")
public class RequestCreateMeetingSettingsBreakoutRoom {
  @JsonProperty("enable")
  private Boolean enable = null;

  @JsonProperty("rooms")
  private List<RequestCreateMeetingSettingsBreakoutRoomRooms> rooms = null;

  public RequestCreateMeetingSettingsBreakoutRoom enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Whether to enable the [**Breakout Room
   * pre-assign**](https://support.zoom.us/hc/en-us/articles/360032752671-Pre-assigning-participants-to-breakout-rooms)
   * option.
   * 
   * @return enable
   **/
  @Schema(description = "Whether to enable the [**Breakout Room pre-assign**](https://support.zoom.us/hc/en-us/articles/360032752671-Pre-assigning-participants-to-breakout-rooms) option.")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public RequestCreateMeetingSettingsBreakoutRoom rooms(List<RequestCreateMeetingSettingsBreakoutRoomRooms> rooms) {
    this.rooms = rooms;
    return this;
  }

  public RequestCreateMeetingSettingsBreakoutRoom addRoomsItem(RequestCreateMeetingSettingsBreakoutRoomRooms roomsItem) {
    if (this.rooms == null) {
      this.rooms = new ArrayList<RequestCreateMeetingSettingsBreakoutRoomRooms>();
    }
    this.rooms.add(roomsItem);
    return this;
  }

  /**
   * Information about the breakout rooms.
   * 
   * @return rooms
   **/
  @Schema(description = "Information about the breakout rooms.")
  public List<RequestCreateMeetingSettingsBreakoutRoomRooms> getRooms() {
    return rooms;
  }

  public void setRooms(List<RequestCreateMeetingSettingsBreakoutRoomRooms> rooms) {
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
    RequestCreateMeetingSettingsBreakoutRoom requestCreateMeetingSettingsBreakoutRoom = (RequestCreateMeetingSettingsBreakoutRoom) o;
    return Objects.equals(this.enable, requestCreateMeetingSettingsBreakoutRoom.enable) &&
        Objects.equals(this.rooms, requestCreateMeetingSettingsBreakoutRoom.rooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, rooms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCreateMeetingSettingsBreakoutRoom {\n");

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
