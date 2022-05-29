package org.example;

import java.time.Month;

/**
 * Simple {@code enum} class to demonstrate use of the old {@code switch}
 * statement.
 */
public enum QuarterEnumSwitchStatement {
  Q1("first quarter"), Q2("second quarter"), Q3("third quarter"), Q4("fourth quarter");

  private final String stringValue;

  QuarterEnumSwitchStatement(final String value) {
    this.stringValue = value;
  }

  @Override
  public String toString() {
    return this.stringValue;
  }

  /**
   * Convert a {@code Month} value to the proper {@code QuarterEnumSwitchStatement} value.
   *
   * @param month a {@code Month} value
   * @return the proper corresponding {@code QuarterEnumSwitchStatement} value
   * for the provided parameter value
   */
  public static QuarterEnumSwitchStatement fromMonth(final Month month) {
    QuarterEnumSwitchStatement quarter = null;

    switch(month) {
      case JANUARY, FEBRUARY, MARCH:
        quarter = Q1;
        break;
      case APRIL, MAY, JUNE:
        quarter = Q2;
        break;
      case JULY, AUGUST, SEPTEMBER:
        quarter = Q3;
        break;
      case OCTOBER, NOVEMBER, DECEMBER:
        quarter = Q4;
    }

    return quarter;
  }
}
