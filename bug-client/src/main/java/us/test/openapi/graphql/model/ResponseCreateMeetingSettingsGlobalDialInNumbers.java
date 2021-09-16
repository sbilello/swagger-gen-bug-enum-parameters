/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ResponseCreateMeetingSettingsGlobalDialInNumbers
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-16T11:47:54.938371-07:00[America/Los_Angeles]")
public class ResponseCreateMeetingSettingsGlobalDialInNumbers {
  @JsonProperty("country")
  private String country = null;

  @JsonProperty("country_name")
  private String countryName = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("number")
  private String number = null;

  /**
   * Type of number.
   */
  public enum TypeEnum {
    TOLL("toll"), TOLLFREE("tollfree");

    private String value;

    TypeEnum(String value) {
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

  public ResponseCreateMeetingSettingsGlobalDialInNumbers country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country code. For example, BR.
   * 
   * @return country
   **/
  @Schema(description = "Country code. For example, BR.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ResponseCreateMeetingSettingsGlobalDialInNumbers countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

  /**
   * Full name of country. For example, Brazil.
   * 
   * @return countryName
   **/
  @Schema(description = "Full name of country. For example, Brazil.")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public ResponseCreateMeetingSettingsGlobalDialInNumbers city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City of the number, if any. For example, Chicago.
   * 
   * @return city
   **/
  @Schema(description = "City of the number, if any. For example, Chicago.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ResponseCreateMeetingSettingsGlobalDialInNumbers number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Phone number. For example, +1 2332357613.
   * 
   * @return number
   **/
  @Schema(description = "Phone number. For example, +1 2332357613.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public ResponseCreateMeetingSettingsGlobalDialInNumbers type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of number.
   * 
   * @return type
   **/
  @Schema(description = "Type of number. ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCreateMeetingSettingsGlobalDialInNumbers responseCreateMeetingSettingsGlobalDialInNumbers = (ResponseCreateMeetingSettingsGlobalDialInNumbers) o;
    return Objects.equals(this.country, responseCreateMeetingSettingsGlobalDialInNumbers.country) &&
        Objects.equals(this.countryName, responseCreateMeetingSettingsGlobalDialInNumbers.countryName) &&
        Objects.equals(this.city, responseCreateMeetingSettingsGlobalDialInNumbers.city) &&
        Objects.equals(this.number, responseCreateMeetingSettingsGlobalDialInNumbers.number) &&
        Objects.equals(this.type, responseCreateMeetingSettingsGlobalDialInNumbers.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, countryName, city, number, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCreateMeetingSettingsGlobalDialInNumbers {\n");

    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
