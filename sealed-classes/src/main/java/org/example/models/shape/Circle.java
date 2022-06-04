package org.example.models.shape;

import org.example.models.color.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Circle implements Shape {
  private static final Logger LOG = LoggerFactory.getLogger(Circle.class);

  @Override
  public void draw() {
    LOG.info("Drawing this circle ...");
  }

  @Override
  public void color(final Color color) {
    LOG.info("Coloring this circle {} ...", color.getColorDescription());
  }

  @Override
  public void rotate(final float degrees) {
    LOG.info("Rotating a circle {} degrees still looks the same", degrees);
  }
}
