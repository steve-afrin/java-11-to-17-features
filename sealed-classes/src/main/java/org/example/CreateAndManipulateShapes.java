package org.example;

import org.example.models.color.Blue;
import org.example.models.color.Green;
import org.example.models.color.Red;
import org.example.models.shape.Circle;
import org.example.models.shape.Square;
import org.example.models.shape.Triangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateAndManipulateShapes {
  private static final Logger LOG = LoggerFactory.getLogger(CreateAndManipulateShapes.class);

  public static void main(final String[] args) {
    LOG.info("Let's start with a circle");
    drawAndColorCircle();
    LOG.info("Now let's do a square");
    drawAndColorSquare();
    LOG.info("Finally let's do a triangle");
    drawAndColorTriangle();
  }

  private static void drawAndColorCircle() {
    final var circle = new Circle();
    circle.draw();
    circle.color(Blue.getInstance());
    circle.rotate(90f);
  }

  private static void drawAndColorSquare() {
    final var square = new Square();
    square.draw();
    square.color(Green.getInstance());
    square.rotate(125f);
  }

  private static void drawAndColorTriangle() {
    final var triangle = new Triangle();
    triangle.draw();
    triangle.color(Red.getInstance());
    triangle.rotate(45f);
  }
}
