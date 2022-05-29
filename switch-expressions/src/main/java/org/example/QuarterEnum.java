package org.example;

import java.time.Month;

/**
 * Simple {@code enum} class to demonstrate use of the new {@code switch}
 * expression.
 */
public enum QuarterEnum {
  Q1("first quarter"), Q2("second quarter"), Q3("third quarter"), Q4("fourth quarter");

  private final String stringValue;

  QuarterEnum(final String value) {
    this.stringValue = value;
  }

  @Override
  public String toString() {
    return this.stringValue;
  }

  /**
   * Convert a {@code Month} value to the proper {@code QuarterEnum} value.
   *
   * @param month a {@code Month} value
   * @return the proper corresponding {@code QuarterEnum} value for the
   * provided parameter value
   */
  public static QuarterEnum fromMonth(final Month month) {
    return switch(month) {
      case JANUARY, FEBRUARY, MARCH -> Q1;
      case APRIL, MAY, JUNE -> Q2;
      case JULY, AUGUST, SEPTEMBER -> Q3;
      case OCTOBER, NOVEMBER, DECEMBER -> Q4;
    };
  }
}
