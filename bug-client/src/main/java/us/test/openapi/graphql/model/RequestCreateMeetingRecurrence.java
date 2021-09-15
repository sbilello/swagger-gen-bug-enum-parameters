/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.model;

import java.util.Objects;

import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Recurrence object. Use this object only for a meeting with type &#x60;8&#x60; i.e., a recurring
 * meeting with fixed time.
 */
@Schema(description = "Recurrence object. Use this object only for a meeting with type `8` i.e., a recurring meeting with fixed time. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
public class RequestCreateMeetingRecurrence {
  /**
   * Recurrence meeting types:&lt;br&gt;&#x60;1&#x60; - Daily.&lt;br&gt;&#x60;2&#x60; -
   * Weekly.&lt;br&gt;&#x60;3&#x60; - Monthly.
   */
  public enum TypeEnum {
    NUMBER_1(1), NUMBER_2(2), NUMBER_3(3);

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
  private TypeEnum type = null;

  @JsonProperty("repeat_interval")
  private Integer repeatInterval = null;

  /**
   * This field is required **if you&#x27;re scheduling a recurring meeting of type** &#x60;2&#x60; to
   * state which day(s) of the week the meeting should repeat. &lt;br&gt; &lt;br&gt; The value for
   * this field could be a number between &#x60;1&#x60; to &#x60;7&#x60; in string format. For
   * instance, if the meeting should recur on Sunday, provide &#x60;\&quot;1\&quot;&#x60; as the value
   * of this field.&lt;br&gt;&lt;br&gt; **Note:** If you would like the meeting to occur on multiple
   * days of a week, you should provide comma separated values for this field. For instance, if the
   * meeting should recur on Sundays and Tuesdays provide &#x60;\&quot;1,3\&quot;&#x60; as the value
   * of this field. &lt;br&gt;&#x60;1&#x60; - Sunday. &lt;br&gt;&#x60;2&#x60; -
   * Monday.&lt;br&gt;&#x60;3&#x60; - Tuesday.&lt;br&gt;&#x60;4&#x60; -
   * Wednesday.&lt;br&gt;&#x60;5&#x60; - Thursday.&lt;br&gt;&#x60;6&#x60; -
   * Friday.&lt;br&gt;&#x60;7&#x60; - Saturday.
   */
  public enum WeeklyDaysEnum {
    _1("1"), _2("2"), _3("3"), _4("4"), _5("5"), _6("6"), _7("7");

    private String value;

    WeeklyDaysEnum(String value) {
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
    public static WeeklyDaysEnum fromValue(String text) {
      for (WeeklyDaysEnum b : WeeklyDaysEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("weekly_days")
  private WeeklyDaysEnum weeklyDays = WeeklyDaysEnum._1;

  @JsonProperty("monthly_day")
  private Integer monthlyDay = 1;

  /**
   * Use this field **only if you&#x27;re scheduling a recurring meeting of type** &#x60;3&#x60; to
   * state the week of the month when the meeting should recur. If you use this field, **you must also
   * use the &#x60;monthly_week_day&#x60; field to state the day of the week when the meeting should
   * recur.** &lt;br&gt;&#x60;-1&#x60; - Last week of the month.&lt;br&gt;&#x60;1&#x60; - First week
   * of the month.&lt;br&gt;&#x60;2&#x60; - Second week of the month.&lt;br&gt;&#x60;3&#x60; - Third
   * week of the month.&lt;br&gt;&#x60;4&#x60; - Fourth week of the month.
   */
  public enum MonthlyWeekEnum {
    NUMBER_MINUS_1(-1), NUMBER_1(1), NUMBER_2(2), NUMBER_3(3), NUMBER_4(4);

    private Integer value;

    MonthlyWeekEnum(Integer value) {
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
    public static MonthlyWeekEnum fromValue(String text) {
      for (MonthlyWeekEnum b : MonthlyWeekEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("monthly_week")
  private MonthlyWeekEnum monthlyWeek = null;

  /**
   * Use this field **only if you&#x27;re scheduling a recurring meeting of type** &#x60;3&#x60; to
   * state a specific day in a week when the monthly meeting should recur. To use this field, you must
   * also use the &#x60;monthly_week&#x60; field. &lt;br&gt;&#x60;1&#x60; -
   * Sunday.&lt;br&gt;&#x60;2&#x60; - Monday.&lt;br&gt;&#x60;3&#x60; - Tuesday.&lt;br&gt;&#x60;4&#x60;
   * - Wednesday.&lt;br&gt;&#x60;5&#x60; - Thursday.&lt;br&gt;&#x60;6&#x60; -
   * Friday.&lt;br&gt;&#x60;7&#x60; - Saturday.
   */
  public enum MonthlyWeekDayEnum {
    NUMBER_1(1), NUMBER_2(2), NUMBER_3(3), NUMBER_4(4), NUMBER_5(5), NUMBER_6(6), NUMBER_7(7);

    private Integer value;

    MonthlyWeekDayEnum(Integer value) {
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
    public static MonthlyWeekDayEnum fromValue(String text) {
      for (MonthlyWeekDayEnum b : MonthlyWeekDayEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("monthly_week_day")
  private MonthlyWeekDayEnum monthlyWeekDay = null;

  @JsonProperty("end_times")
  private Integer endTimes = 1;

  @JsonProperty("end_date_time")
  private OffsetDateTime endDateTime = null;

  public RequestCreateMeetingRecurrence type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Recurrence meeting types:&lt;br&gt;&#x60;1&#x60; - Daily.&lt;br&gt;&#x60;2&#x60; -
   * Weekly.&lt;br&gt;&#x60;3&#x60; - Monthly.
   * 
   * @return type
   **/
  @Schema(required = true, description = "Recurrence meeting types:<br>`1` - Daily.<br>`2` - Weekly.<br>`3` - Monthly.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RequestCreateMeetingRecurrence repeatInterval(Integer repeatInterval) {
    this.repeatInterval = repeatInterval;
    return this;
  }

  /**
   * Define the interval at which the meeting should recur. For instance, if you would like to
   * schedule a meeting that recurs every two months, you must set the value of this field as
   * &#x60;2&#x60; and the value of the &#x60;type&#x60; parameter as &#x60;3&#x60;. For a daily
   * meeting, the maximum interval you can set is &#x60;90&#x60; days. For a weekly meeting the
   * maximum interval that you can set is of &#x60;12&#x60; weeks. For a monthly meeting, there is a
   * maximum of &#x60;3&#x60; months.
   * 
   * @return repeatInterval
   **/
  @Schema(description = "Define the interval at which the meeting should recur. For instance, if you would like to schedule a meeting that recurs every two months, you must set the value of this field as `2` and the value of the `type` parameter as `3`.  For a daily meeting, the maximum interval you can set is `90` days. For a weekly meeting the maximum interval that you can set is  of `12` weeks. For a monthly meeting, there is a maximum of `3` months.  ")
  public Integer getRepeatInterval() {
    return repeatInterval;
  }

  public void setRepeatInterval(Integer repeatInterval) {
    this.repeatInterval = repeatInterval;
  }

  public RequestCreateMeetingRecurrence weeklyDays(WeeklyDaysEnum weeklyDays) {
    this.weeklyDays = weeklyDays;
    return this;
  }

  /**
   * This field is required **if you&#x27;re scheduling a recurring meeting of type** &#x60;2&#x60; to
   * state which day(s) of the week the meeting should repeat. &lt;br&gt; &lt;br&gt; The value for
   * this field could be a number between &#x60;1&#x60; to &#x60;7&#x60; in string format. For
   * instance, if the meeting should recur on Sunday, provide &#x60;\&quot;1\&quot;&#x60; as the value
   * of this field.&lt;br&gt;&lt;br&gt; **Note:** If you would like the meeting to occur on multiple
   * days of a week, you should provide comma separated values for this field. For instance, if the
   * meeting should recur on Sundays and Tuesdays provide &#x60;\&quot;1,3\&quot;&#x60; as the value
   * of this field. &lt;br&gt;&#x60;1&#x60; - Sunday. &lt;br&gt;&#x60;2&#x60; -
   * Monday.&lt;br&gt;&#x60;3&#x60; - Tuesday.&lt;br&gt;&#x60;4&#x60; -
   * Wednesday.&lt;br&gt;&#x60;5&#x60; - Thursday.&lt;br&gt;&#x60;6&#x60; -
   * Friday.&lt;br&gt;&#x60;7&#x60; - Saturday.
   * 
   * @return weeklyDays
   **/
  @Schema(description = "This field is required **if you're scheduling a recurring meeting of type** `2` to state which day(s) of the week the meeting should repeat. <br> <br> The value for this field could be a number between `1` to `7` in string format. For instance, if the meeting should recur on Sunday, provide `\"1\"` as the value of this field.<br><br> **Note:** If you would like the meeting to occur on multiple days of a week, you should provide comma separated values for this field. For instance, if the meeting should recur on Sundays and Tuesdays provide `\"1,3\"` as the value of this field.   <br>`1`  - Sunday. <br>`2` - Monday.<br>`3` - Tuesday.<br>`4` -  Wednesday.<br>`5` -  Thursday.<br>`6` - Friday.<br>`7` - Saturday.")
  public WeeklyDaysEnum getWeeklyDays() {
    return weeklyDays;
  }

  public void setWeeklyDays(WeeklyDaysEnum weeklyDays) {
    this.weeklyDays = weeklyDays;
  }

  public RequestCreateMeetingRecurrence monthlyDay(Integer monthlyDay) {
    this.monthlyDay = monthlyDay;
    return this;
  }

  /**
   * Use this field **only if you&#x27;re scheduling a recurring meeting of type** &#x60;3&#x60; to
   * state which day in a month, the meeting should recur. The value range is from 1 to 31. For
   * instance, if you would like the meeting to recur on 23rd of each month, provide &#x60;23&#x60; as
   * the value of this field and &#x60;1&#x60; as the value of the &#x60;repeat_interval&#x60; field.
   * Instead, if you would like the meeting to recur every three months, on 23rd of the month, change
   * the value of the &#x60;repeat_interval&#x60; field to &#x60;3&#x60;.
   * 
   * @return monthlyDay
   **/
  @Schema(description = "Use this field **only if you're scheduling a recurring meeting of type** `3` to state which day in a month, the meeting should recur. The value range is from 1 to 31.  For instance, if you would like the meeting to recur on 23rd of each month, provide `23` as the value of this field and `1` as the value of the `repeat_interval` field. Instead, if you would like the meeting to recur every three months, on 23rd of the month, change the value of the `repeat_interval` field to `3`.")
  public Integer getMonthlyDay() {
    return monthlyDay;
  }

  public void setMonthlyDay(Integer monthlyDay) {
    this.monthlyDay = monthlyDay;
  }

  public RequestCreateMeetingRecurrence monthlyWeek(MonthlyWeekEnum monthlyWeek) {
    this.monthlyWeek = monthlyWeek;
    return this;
  }

  /**
   * Use this field **only if you&#x27;re scheduling a recurring meeting of type** &#x60;3&#x60; to
   * state the week of the month when the meeting should recur. If you use this field, **you must also
   * use the &#x60;monthly_week_day&#x60; field to state the day of the week when the meeting should
   * recur.** &lt;br&gt;&#x60;-1&#x60; - Last week of the month.&lt;br&gt;&#x60;1&#x60; - First week
   * of the month.&lt;br&gt;&#x60;2&#x60; - Second week of the month.&lt;br&gt;&#x60;3&#x60; - Third
   * week of the month.&lt;br&gt;&#x60;4&#x60; - Fourth week of the month.
   * 
   * @return monthlyWeek
   **/
  @Schema(description = "Use this field **only if you're scheduling a recurring meeting of type** `3` to state the week of the month when the meeting should recur. If you use this field, **you must also use the `monthly_week_day` field to state the day of the week when the meeting should recur.** <br>`-1` - Last week of the month.<br>`1` - First week of the month.<br>`2` - Second week of the month.<br>`3` - Third week of the month.<br>`4` - Fourth week of the month.")
  public MonthlyWeekEnum getMonthlyWeek() {
    return monthlyWeek;
  }

  public void setMonthlyWeek(MonthlyWeekEnum monthlyWeek) {
    this.monthlyWeek = monthlyWeek;
  }

  public RequestCreateMeetingRecurrence monthlyWeekDay(MonthlyWeekDayEnum monthlyWeekDay) {
    this.monthlyWeekDay = monthlyWeekDay;
    return this;
  }

  /**
   * Use this field **only if you&#x27;re scheduling a recurring meeting of type** &#x60;3&#x60; to
   * state a specific day in a week when the monthly meeting should recur. To use this field, you must
   * also use the &#x60;monthly_week&#x60; field. &lt;br&gt;&#x60;1&#x60; -
   * Sunday.&lt;br&gt;&#x60;2&#x60; - Monday.&lt;br&gt;&#x60;3&#x60; - Tuesday.&lt;br&gt;&#x60;4&#x60;
   * - Wednesday.&lt;br&gt;&#x60;5&#x60; - Thursday.&lt;br&gt;&#x60;6&#x60; -
   * Friday.&lt;br&gt;&#x60;7&#x60; - Saturday.
   * 
   * @return monthlyWeekDay
   **/
  @Schema(description = "Use this field **only if you're scheduling a recurring meeting of type** `3` to state a specific day in a week when the monthly meeting should recur. To use this field, you must also use the `monthly_week` field.  <br>`1` - Sunday.<br>`2` - Monday.<br>`3` - Tuesday.<br>`4` -  Wednesday.<br>`5` - Thursday.<br>`6` - Friday.<br>`7` - Saturday.")
  public MonthlyWeekDayEnum getMonthlyWeekDay() {
    return monthlyWeekDay;
  }

  public void setMonthlyWeekDay(MonthlyWeekDayEnum monthlyWeekDay) {
    this.monthlyWeekDay = monthlyWeekDay;
  }

  public RequestCreateMeetingRecurrence endTimes(Integer endTimes) {
    this.endTimes = endTimes;
    return this;
  }

  /**
   * Select how many times the meeting should recur before it is canceled. (Cannot be used with
   * \&quot;end_date_time\&quot;.) maximum: 365
   * 
   * @return endTimes
   **/
  @Schema(description = "Select how many times the meeting should recur before it is canceled. (Cannot be used with \"end_date_time\".)")
  public Integer getEndTimes() {
    return endTimes;
  }

  public void setEndTimes(Integer endTimes) {
    this.endTimes = endTimes;
  }

  public RequestCreateMeetingRecurrence endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Select the final date on which the meeting will recur before it is canceled. Should be in UTC
   * time, such as 2017-11-25T12:00:00Z. (Cannot be used with \&quot;end_times\&quot;.)
   * 
   * @return endDateTime
   **/
  @Schema(description = "Select the final date on which the meeting will recur before it is canceled. Should be in UTC time, such as 2017-11-25T12:00:00Z. (Cannot be used with \"end_times\".)")
  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCreateMeetingRecurrence requestCreateMeetingRecurrence = (RequestCreateMeetingRecurrence) o;
    return Objects.equals(this.type, requestCreateMeetingRecurrence.type) &&
        Objects.equals(this.repeatInterval, requestCreateMeetingRecurrence.repeatInterval) &&
        Objects.equals(this.weeklyDays, requestCreateMeetingRecurrence.weeklyDays) &&
        Objects.equals(this.monthlyDay, requestCreateMeetingRecurrence.monthlyDay) &&
        Objects.equals(this.monthlyWeek, requestCreateMeetingRecurrence.monthlyWeek) &&
        Objects.equals(this.monthlyWeekDay, requestCreateMeetingRecurrence.monthlyWeekDay) &&
        Objects.equals(this.endTimes, requestCreateMeetingRecurrence.endTimes) &&
        Objects.equals(this.endDateTime, requestCreateMeetingRecurrence.endDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, repeatInterval, weeklyDays, monthlyDay, monthlyWeek, monthlyWeekDay, endTimes, endDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCreateMeetingRecurrence {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    repeatInterval: ").append(toIndentedString(repeatInterval)).append("\n");
    sb.append("    weeklyDays: ").append(toIndentedString(weeklyDays)).append("\n");
    sb.append("    monthlyDay: ").append(toIndentedString(monthlyDay)).append("\n");
    sb.append("    monthlyWeek: ").append(toIndentedString(monthlyWeek)).append("\n");
    sb.append("    monthlyWeekDay: ").append(toIndentedString(monthlyWeekDay)).append("\n");
    sb.append("    endTimes: ").append(toIndentedString(endTimes)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
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
