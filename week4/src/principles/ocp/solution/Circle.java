package principles.ocp.solution;

public class Circle extends Shapes {
  private double radius;

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public Circle(double radius) {
    this.setRadius(radius);
  }

  public double Area() {
    return this.radius * this.radius * 3.141592653589793D;
  }
}