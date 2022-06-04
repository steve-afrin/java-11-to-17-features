package org.example;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class to validate proper generation of the expected enhanced, default error
 * message from the {@code NullPointerException}.
 */
class CalculatorTest {
  // Used only to demonstrate generated stack traces from
  // {@code NullPointerException}.
  private static final Logger LOG = LoggerFactory.getLogger(CalculatorTest.class);

  /**
   * Exercises the {@link Calculator#compute(long, long, long)} method and
   * captures the expected {@code NullPointerException}
   * @param nullVariable
   * @param a
   * @param b
   * @param c
   * @param expectedExceptionMessage
   */
  @ParameterizedTest(name = "Validate NullPointerException message for {0}")
  @MethodSource
  void testCompute(
      final String testDescription,
      final AtomicLong a,
      final AtomicLong b,
      final AtomicLong c,
      final String expectedExceptionMessage) {
    final var thrown = assertThrows(
        NullPointerException.class,
        () -> Calculator.compute(a.get(), b.get(), c.get())
    );

    assertEquals(expectedExceptionMessage, thrown.getMessage());
    LOG.warn("Encountered NullPointerException while trying to compute value", thrown);
  }

  private static Stream<Arguments> testCompute() {
    return Stream.of(
        Arguments.of("a is null", null, new AtomicLong(4), new AtomicLong(5),
            "Cannot invoke \"java.util.concurrent.atomic.AtomicLong.get()\" because \"a\" is null"),
        Arguments.of("b is null", new AtomicLong(3), null, new AtomicLong(5),
            "Cannot invoke \"java.util.concurrent.atomic.AtomicLong.get()\" because \"b\" is null"),
        Arguments.of("c is null", new AtomicLong(3), new AtomicLong(4), null,
            "Cannot invoke \"java.util.concurrent.atomic.AtomicLong.get()\" because \"c\" is null")
    );
  }
}
