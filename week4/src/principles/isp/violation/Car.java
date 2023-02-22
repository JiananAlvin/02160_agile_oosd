package principles.isp.violation;

public class Car implements ICar {
  private int speed;
  private int gear;

  public Car() {
  }

  public int getSpeed() {
    return this.speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getGear() {
    return this.gear;
  }

  public void setGear(int gear) {
    this.gear = gear;
  }

  public void accelerate() {
    ++this.speed;
  }

  public void shiftDown() {
    --this.gear;
  }

  public void shiftUp() {
    ++this.gear;
  }
}