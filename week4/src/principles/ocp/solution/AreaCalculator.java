package principles.ocp.solution;

public class AreaCalculator {
  public AreaCalculator() {
  }

  public double calculateArea(Object[] shapes) {  // [c1, c2, r1, r2]
    double area = 0.0D;

    for(int i = 0; i < shapes.length; ++i) {
      Object shape = shapes[i];
      area += ((Shapes)shape).Area();
    }

    return area;
  }
}
