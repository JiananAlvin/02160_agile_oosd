package principles.dip.solution;

public class Test {
  public Test() {
  }

  public static void main(String[] args) {
//    Lamp lamp = new Lamp();
//    Button button = new Button(lamp);
    Lantern l = new Lantern();
    Button button = new Button(l);
    button.push();
    button.push();
  }
}