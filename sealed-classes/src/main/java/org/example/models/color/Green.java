package org.example.models.color;

public final class Green extends Color {
  private static Green instance = null;

  private Green() {
    super("green");
  }

  public static Green getInstance() {
    if (instance == null) {
      instance = new Green();
    }

    return instance;
  }
}
