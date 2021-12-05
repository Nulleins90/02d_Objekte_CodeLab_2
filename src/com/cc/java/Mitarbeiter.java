package com.cc.java;

public class Mitarbeiter {

  private String firstName;
  private String familyName;
  private String function;
  private int yearJoined;

  public Mitarbeiter(
    String firstName,
    String familyName,
    String function,
    int yearJoined
  ) {
    this.firstName = firstName;
    this.familyName = familyName;
    this.function = function;
    this.yearJoined = yearJoined;
  }

  public String getInfo(String request) {
    switch (request) {
      case "Vorname":
        return firstName;
      case "Name":
        return familyName;
      case "Funktion":
        return function;
      case "Eintrittsjahr":
        return String.valueOf(yearJoined);
      default:
        return "Falscher Parameter";
    }
  }
}
