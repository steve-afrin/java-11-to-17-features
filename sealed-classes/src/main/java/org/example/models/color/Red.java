package org.example.models.color;

public final class Red extends Color {
  private static Red instance = null;

  private Red() {
    super("red");
  }

  public static Red getInstance() {
    if (instance == null) {
      instance = new Red();
    }

    return instance;
  }
}
