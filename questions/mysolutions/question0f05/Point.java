package question0f05;

public class Point {

  private final double x;
  private final double y;
  private final double z;

  public Point(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double distanceFrom(Point other) {
    return Math.sqrt((other.x - x) * (other.x - x) + (other.y - y) * (other.y - y) + (other.z - z) * (other.z - z));
  }

  public static Point getOrigin() {
    return new Point(0, 0, 0);
  }

  public double magnitude() {
    return Math.sqrt(x * x + y * y + z * z);
  }

  @Override
  public String toString() {
    return "Point(" + x + ", " + y + ", " + z + ")";
  }
}

