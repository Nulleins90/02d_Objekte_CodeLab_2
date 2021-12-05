package com.cc.java;

public class Mitarbeiter {

  private String firstName;
  private String familyName;
  private String function;
  private String yearJoined;

  public Mitarbeiter(
    String firstName,
    String familyName,
    String function,
    String yearJoined
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
        return yearJoined;
      default:
        return "Falscher Parameter";
    }
  }
}
