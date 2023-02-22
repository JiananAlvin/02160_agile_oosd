package principles.dip.solution;

public class Lantern implements IDevice {
  public Lantern() {
  }

  public void turnOn() {
    System.out.println("Lantern is ON");
  }

  public void turnOff() {
    System.out.println("Lantern is OFF");
  }
}
