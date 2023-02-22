package principles.isp.violation;

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

  public void shiftDown() {
    throw new UnsupportedOperationException("not supported by electric car");
  }

  public void shiftUp() {
    throw new UnsupportedOperationException("not supported by electric car");
  }
}
