package question2c68;

public class Point {

  private final int coordX;
  private final int coordY;

  public Point(int coordX, int coordY) {
    this.coordX = coordX;
    this.coordY = coordY;
  }

  public int getCoordX() {
    return coordX;
  }

  public int getCoordY() {
    return coordY;
  }

  public String toString() {
    return "(" + coordX + ", " + coordY + ")";
  }
}
