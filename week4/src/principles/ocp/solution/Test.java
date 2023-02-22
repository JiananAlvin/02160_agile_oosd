package principles.ocp.solution;

class Test {
  Test() {
  }

  public static void main(String[] args) {
    AreaCalculator calc = new AreaCalculator();
    Circle circle = new Circle(2.0D);
    Rectangle rectangle = new Rectangle(3.0D, 4.0D);
    Object[] shapes = new Object[]{circle, rectangle};
    double area = calc.calculateArea(shapes);
    System.out.println(12.0D + Math.pow(2.0D, 2.0D) * 3.141592653589793D == area);
  }
}


