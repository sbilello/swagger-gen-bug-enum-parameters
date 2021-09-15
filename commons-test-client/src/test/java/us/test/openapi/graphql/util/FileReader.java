/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.util;

import java.io.IOException;
import java.util.Objects;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileReader {
  private FileReader() {}

  public static String readFile(String filePath) {
    try {
      return new String(Objects.requireNonNull(FileReader.class.getClassLoader().getResourceAsStream(filePath)).readAllBytes());
    } catch (IOException e) {
      log.error("It was not possible to read {}", filePath, e);
    }
    return null;
  }
}
