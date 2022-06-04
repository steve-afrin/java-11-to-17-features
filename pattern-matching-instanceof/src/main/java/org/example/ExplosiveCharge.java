package org.example;

import lombok.Value;

@Value
public class ExplosiveCharge {
  public String detonate() {
    return "kaboom!!!";
  }
}
