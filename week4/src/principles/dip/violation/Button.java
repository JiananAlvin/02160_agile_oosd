package principles.dip.violation;

public class Button {
  protected Lamp lamp;
  protected boolean isPushed;

  public Button(Lamp lamp) {
    this.lamp = lamp;
    this.isPushed = false;
  }

  public boolean isPushed() {
    return this.isPushed;
  }

  public void push() {
    this.isPushed = !this.isPushed;
    if (this.isPushed()) {
      this.lamp.turnOn();
    } else {
      this.lamp.turnOff();
    }

  }
}
