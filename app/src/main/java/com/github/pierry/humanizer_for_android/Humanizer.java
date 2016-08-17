package com.github.pierry.humanizer_for_android;

public class Humanizer {

  private static final String SPACE = " ";

  public static String FirstChar(String value) {
    String result = value.substring(0, 1).toUpperCase();
    return result;
  }

  public static String Name(String value) {
    String[] values = value.split("(?<=.)(?=\\p{Lu})");
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < values.length; i++) {
      result.append(values[i].substring(0, 1).toUpperCase());
      result.append(values[i].substring(1).toLowerCase());
      result.append(SPACE);
    }
    return result.toString();
  }

  public static String AllUpperCase(String value) {
    String[] values = value.split(" ");
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < values.length; i++) {
      result.append(values[i].substring(0, 1).toUpperCase());
      result.append(values[i].substring(1).toLowerCase());
      result.append(SPACE);
    }
    return result.toString();
  }
}
