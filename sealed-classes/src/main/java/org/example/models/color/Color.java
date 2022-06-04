package org.example.models.color;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract sealed class Color
  permits Blue, Green, Red {
  private static final Logger LOG = LoggerFactory.getLogger(Color.class);

  private final String colorDescription;

  protected Color(final String colorValue) {
    this.colorDescription = colorValue;
  }

  public String getColorDescription() {
    LOG.info("My color is {}", this.colorDescription);
    return this.colorDescription;
  }
}
