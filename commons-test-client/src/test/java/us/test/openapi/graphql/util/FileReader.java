/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileReader {
  private FileReader() {}

  public static String readFile(String filePath) {
    try {
      InputStream inputStream = Objects.requireNonNull(FileReader.class.getClassLoader().getResourceAsStream(filePath));
      return new BufferedReader(
              new InputStreamReader(inputStream, StandardCharsets.UTF_8))
              .lines()
              .collect(Collectors.joining("\n"));
    } catch (Exception e) {
      log.error("It was not possible to read {}", filePath, e);
    }
    return null;
  }
}
