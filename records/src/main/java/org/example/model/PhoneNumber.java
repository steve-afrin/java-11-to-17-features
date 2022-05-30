package org.example.model;

public record PhoneNumber(String type, String areaCode, String prefix, String number) {

  @Override
  public String toString() {
    return String.format("%s-%s-%s (%s)", this.areaCode, this.prefix, this.number, this.type);
  }
}
