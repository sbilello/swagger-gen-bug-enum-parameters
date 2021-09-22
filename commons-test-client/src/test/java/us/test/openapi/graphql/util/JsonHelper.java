/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.util;

import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.threetenbp.ThreeTenModule;

@Slf4j
public class JsonHelper {
  private static final ObjectMapper objectMapper = new ObjectMapper();

  static {
    ThreeTenModule module = new ThreeTenModule();
    module.addDeserializer(Instant.class, CustomInstantDeserializer.INSTANT);
    module.addDeserializer(OffsetDateTime.class, CustomInstantDeserializer.OFFSET_DATE_TIME);
    module.addDeserializer(ZonedDateTime.class, CustomInstantDeserializer.ZONED_DATE_TIME);
    objectMapper.registerModule(module);
    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    objectMapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
    objectMapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
    objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
  }

  private JsonHelper() {}

  public static <T> Optional<T> fromJson(String json, Class<T> beanClass) {
    try {
      return Optional.of(objectMapper.readValue(json, beanClass));
    } catch (Exception e) {
      log.error("deserialize json string to class {} object error, {}", beanClass.getTypeName(), e.getLocalizedMessage());
    }
    return Optional.empty();
  }

  public static Optional<String> toJson(Object object) {
    try {
      return Optional.of(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object));
    } catch (Exception e) {
      log.error("serialize object to json string error, {}", e.getLocalizedMessage());
    }
    return Optional.empty();
  }

}
