package org.example.models.shape;

import org.example.models.color.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Triangle implements Shape {
  private static final Logger LOG = LoggerFactory.getLogger(Triangle.class);

  @Override
  public void draw() {
    LOG.info("Drawing this triangle ...");
  }

  @Override
  public void color(final Color color) {
    LOG.info("Coloring this triangle {} ...", color.getColorDescription());
  }

  @Override
  public void rotate(final float degrees) {
    LOG.info("Rotating this triangle {} degrees ...", degrees);
  }
}
