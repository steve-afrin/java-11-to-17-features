package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Helps demonstrate the new {@code 'B'} format in the `DateTimeFormatter` class
 * to provide CLDR-type time of day text when formatting times for output.
 */
public final class DayTimeExample {
  private static final Logger LOG = LoggerFactory.getLogger(DayTimeExample.class);
  private static final LocalTime MIDNIGHT = LocalTime.of(0, 0, 0);
  private static final LocalTime NOON = LocalTime.of(12, 0, 0);

  private static final LocalTime MORNING = LocalTime.of(9, 15, 0);
  private static final LocalTime AFTERNOON = LocalTime.of(17, 40, 0);
  private static final LocalTime EVENING = LocalTime.of(19, 52, 0);
  private static final LocalTime NIGHT = LocalTime.of(22, 9, 0);

  private static final DateTimeFormatter USUAL_TIME_PATTERN = DateTimeFormatter.ofPattern("h:mm a");
  private static final DateTimeFormatter NEW_TIME_PATTERN = DateTimeFormatter.ofPattern("h:mm B");
  private static final String LOG_MESSAGE_FOR_TIME = "The time is {}.";

  // Hide the constructor as it is not needed for this class.
  private DayTimeExample() {
  }

  public static void main(final String[] args) {
    LOG.info(LOG_MESSAGE_FOR_TIME, USUAL_TIME_PATTERN.format(MIDNIGHT));
    LOG.info(LOG_MESSAGE_FOR_TIME, NEW_TIME_PATTERN.format(MIDNIGHT));
    LOG.info(LOG_MESSAGE_FOR_TIME, USUAL_TIME_PATTERN.format(NOON));
    LOG.info(LOG_MESSAGE_FOR_TIME, NEW_TIME_PATTERN.format(NOON));
    LOG.info(LOG_MESSAGE_FOR_TIME, USUAL_TIME_PATTERN.format(MORNING));
    LOG.info(LOG_MESSAGE_FOR_TIME, NEW_TIME_PATTERN.format(MORNING));
    LOG.info(LOG_MESSAGE_FOR_TIME, USUAL_TIME_PATTERN.format(AFTERNOON));
    LOG.info(LOG_MESSAGE_FOR_TIME, NEW_TIME_PATTERN.format(AFTERNOON));
    LOG.info(LOG_MESSAGE_FOR_TIME, USUAL_TIME_PATTERN.format(EVENING));
    LOG.info(LOG_MESSAGE_FOR_TIME, NEW_TIME_PATTERN.format(EVENING));
    LOG.info(LOG_MESSAGE_FOR_TIME, USUAL_TIME_PATTERN.format(NIGHT));
    LOG.info(LOG_MESSAGE_FOR_TIME, NEW_TIME_PATTERN.format(NIGHT));
  }
}
