package principles.ocp.violation;

public class Circle {
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
}
