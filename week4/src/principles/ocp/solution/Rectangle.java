package principles.ocp.solution;

public class Rectangle extends Shapes {
  private double width;
  private double height;

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

  public double Area() {
    return this.width * this.height;
  }
}