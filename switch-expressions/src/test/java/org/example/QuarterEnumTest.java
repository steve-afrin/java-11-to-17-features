package org.example;

import java.time.Month;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuarterEnumTest {

  /**
   * Validates the {@code QuarterEnum#fromMonth(Month)} method.
   *
   * @param month           a {@code Month} value
   * @param expectedQuarter the expected {@code QuarterEnum} value to be
   *                        calculated and returned
   */
  @ParameterizedTest(name = "Validate proper conversion from {0} to {1}")
  @MethodSource
  void testFromMonth(final Month month,final QuarterEnum expectedQuarter) {
    assertEquals(expectedQuarter, QuarterEnum.fromMonth(month));
  }

  private static Stream<Arguments> testFromMonth() {
    return Stream.of(
        Arguments.of(Month.JANUARY, QuarterEnum.Q1),
        Arguments.of(Month.FEBRUARY, QuarterEnum.Q1),
        Arguments.of(Month.MARCH, QuarterEnum.Q1),
        Arguments.of(Month.APRIL, QuarterEnum.Q2),
        Arguments.of(Month.MAY, QuarterEnum.Q2),
        Arguments.of(Month.JUNE, QuarterEnum.Q2),
        Arguments.of(Month.JULY, QuarterEnum.Q3),
        Arguments.of(Month.AUGUST, QuarterEnum.Q3),
        Arguments.of(Month.SEPTEMBER, QuarterEnum.Q3),
        Arguments.of(Month.OCTOBER, QuarterEnum.Q4),
        Arguments.of(Month.NOVEMBER, QuarterEnum.Q4),
        Arguments.of(Month.DECEMBER, QuarterEnum.Q4)
    );
  }
}