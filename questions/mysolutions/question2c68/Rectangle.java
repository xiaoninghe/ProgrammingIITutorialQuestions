package question2c68;

public class Rectangle {

  private final Point topLeft;
  private final int width;
  private final int height;

  public Rectangle(Point topLeft, int width, int height) {
    this.topLeft = topLeft;
    this.width = width;
    this.height = height;
  }

  public Point topLeft() {
    return topLeft;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public int area() {
    return width * height;
  }

  public Point getBottomRight() {
    return new Point(
            topLeft.getCoordX() + width,
            topLeft.getCoordY() + height
    );
  }

  public boolean contains(Rectangle r2) {
    return
            topLeft.getCoordX() <= r2.topLeft().getCoordX()
                    && topLeft.getCoordY() <= r2.topLeft().getCoordY()
                    && getBottomRight().getCoordX() >= r2.getBottomRight().getCoordX()
                    && getBottomRight().getCoordY() >= r2.getBottomRight().getCoordY();
  }

  @Override
  public String toString() {
    return "(top-left = " + topLeft + ", width = " + width + ", height = " + height + ")";
  }
}
