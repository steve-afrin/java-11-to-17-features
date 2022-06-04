package org.example.models.color;

public final class Blue extends Color {
  private static Blue instance = null;

  private Blue() {
    super("blue");
  }

  public static Blue getInstance() {
    if (instance == null) {
      instance = new Blue();
    }

    return instance;
  }
}
