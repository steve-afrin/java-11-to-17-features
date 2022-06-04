package org.example.models.shape;

import org.example.models.color.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public sealed class Rectangle implements Shape
  permits Square {
  private static final Logger LOG = LoggerFactory.getLogger(Rectangle.class);

  @Override
  public void draw() {
    LOG.info("Drawing this rectangle ...");
  }

  @Override
  public void color(final Color color) {
    LOG.info("Coloring this rectangle {} ...", color.getColorDescription());
  }

  @Override
  public void rotate(final float degrees) {
    LOG.info("Rotating this rectangle {} degrees ...", degrees);
  }
}
