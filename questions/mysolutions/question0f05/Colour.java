package question0f05;

public enum Colour {
  RED, GREEN, BLUE;


  @Override
  public String toString() {
    return switch (this) {
      case RED -> "Red";
      case BLUE -> "Blue";
      case GREEN -> "Green";
    };
  }
}
