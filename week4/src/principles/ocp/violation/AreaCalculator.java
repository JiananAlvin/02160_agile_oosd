package principles.ocp.violation;

public class AreaCalculator {
  int i;
  public AreaCalculator() {
  }

  public double calculateArea(Object[] shapes) {
    double area = 0.0D;
    Object[] var7 = shapes;
    int var6 = shapes.length;

    for(int var5 = 0; var5 < var6; ++var5) {
      Object shape = var7[var5];
      if (shape instanceof Rectangle) {
        Rectangle rectangle = (Rectangle)shape;
        area += rectangle.getWidth() * rectangle.getHeight();
      } else {
        Circle circle = (Circle)shape;
        area += Math.pow(circle.getRadius(), 2.0D) * 3.141592653589793D;
      }
    }

    return area;
  }
}
