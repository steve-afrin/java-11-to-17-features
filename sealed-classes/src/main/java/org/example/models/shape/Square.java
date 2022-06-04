package org.example.models.shape;

import org.example.models.color.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Square extends Rectangle implements Shape {
  private static final Logger LOG = LoggerFactory.getLogger(Square.class);

  @Override
  public void draw() {
    LOG.info("Drawing this square ...");
  }

  @Override
  public void color(final Color color) {
    LOG.info("Coloring this square {} ...", color.getColorDescription());
  }

  @Override
  public void rotate(final float degrees) {
    LOG.info("Rotating this square {} degrees ...", degrees);
  }
}
