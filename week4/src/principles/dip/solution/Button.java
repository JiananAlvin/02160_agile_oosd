package principles.dip.solution;

public class Button {
  protected IDevice device;
  protected boolean isPushed;

  public Button(IDevice device) {
    this.device = device;
    this.isPushed = false;
  }

  public boolean isPushed() {
    return this.isPushed;
  }

  public void push() {
    this.isPushed = !this.isPushed;
    if (this.isPushed()) {
      this.device.turnOn();
    } else {
      this.device.turnOff();
    }

  }
}