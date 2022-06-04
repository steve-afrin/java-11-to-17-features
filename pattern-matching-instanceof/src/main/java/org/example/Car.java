package org.example;

import lombok.Value;

@Value
public class Car {
  public String makesSound() {
    return "vrooooooom!";
  }
}
