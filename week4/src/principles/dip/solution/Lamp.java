package principles.dip.solution;

public class Lamp implements IDevice {
  public Lamp() {
  }

  public void turnOn() {
    System.out.println("Lamp is ON");
  }

  public void turnOff() {
    System.out.println("Lamp is OFF");
  }
}
