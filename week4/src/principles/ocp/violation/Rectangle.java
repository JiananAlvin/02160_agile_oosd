package principles.ocp.violation;

public class Rectangle {
  public double width;
  public double height;

  public double getWidth() {
    return this.width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return this.height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
}
