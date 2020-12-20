package question8d24;

public enum Strategy {
  AGGRESSIVE, DEFENSIVE, AVERAGE;

  @Override
  public String toString() {
    return switch (this) {
      case AGGRESSIVE -> "Aggressive";
      case AVERAGE -> "Average";
      case DEFENSIVE -> "Defensive";
    };
  }
}
