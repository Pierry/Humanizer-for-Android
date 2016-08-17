package com.github.pierry.humanizer_for_android;

public class Humanizer {

  private static final String SPACE = " ";

  public static String FirstChar(String value) {
    String result = value.substring(0, 1).toUpperCase();
    return result;
  }

  public static String Name(String value) {
    String[] values = value.split("(?<=.)(?=\\p{Lu})");
    StringBuilder strBuilder = new StringBuilder();
    for (int i = 0; i < values.length; i++) {
      strBuilder.append(values[i].substring(0, 1).toUpperCase());
      strBuilder.append(values[i].substring(1).toLowerCase());
      strBuilder.append(SPACE);
    }
    return strBuilder.toString();
  }

  public static String AllUpperCase(String value) {
    String[] values = value.split(" ");
    StringBuilder strBuilder = new StringBuilder();
    for (int i = 0; i < values.length; i++) {
      strBuilder.append(values[i].substring(0, 1).toUpperCase());
      strBuilder.append(values[i].substring(1).toLowerCase());
      strBuilder.append(values[i].substring(1).toLowerCase());
      strBuilder.append(SPACE);
    }
    return strBuilder.toString();
  }
}
