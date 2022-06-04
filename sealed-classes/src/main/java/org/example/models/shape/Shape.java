package org.example.models.shape;

import org.example.models.color.Color;

public sealed interface Shape
    permits Circle, Rectangle, Square, Triangle {
  /**
   * Draws the implemented shape.
   */
  void draw();

  /**
   * Colors the shape the specified color.
   * @param color a {@link Color} implementation
   */
  void color(Color color);

  /**
   * Rotates the shape the specific number of degrees.
   * @param degrees a {@code float} value that specifies how many
   *                degrees to rotate the shape.
   */
  void rotate(float degrees);
}
