package org.example;

import lombok.Value;

@Value
public class FriendlyPerson {
  public String says() {
    return "hello";
  }
}
