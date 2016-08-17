package com.github.pierry.humanizer_for_android;

public class Humanizer {

  private static final String SPACE = " ";

  public static String FirstChar(String value) {
    String result = value.substring(0, 1).toUpperCase();
    return result;
  }

  public static String Name(String value) {
    String[] values = value.split("(?<=.)(?=\\p{Lu})");
    String result = "";
    for (int i = 0; i < values.length; i++) {
      result += values[i].substring(0, 1).toUpperCase();
      result += values[i].substring(1).toLowerCase();
      result += SPACE;
    }
    return result;
  }

  public static String AllUpperCase(String value) {
    String[] values = value.split(" ");
    String result = "";
    for (int i = 0; i < values.length; i++) {
      result += values[i].substring(0, 1).toUpperCase();
      result += values[i].substring(1).toLowerCase();
      result += SPACE;
    }
    return result;
  }
}
