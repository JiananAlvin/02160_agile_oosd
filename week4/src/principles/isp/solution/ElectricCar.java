package principles.isp.solution;

public class ElectricCar implements ICar {
  private int speed;

  public ElectricCar() {
  }

  public int getSpeed() {
    return this.speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void accelerate() {
    ++this.speed;
  }
}
