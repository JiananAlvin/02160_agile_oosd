package principles.lsp.violation;

public class Bicycle extends TransportationDevice {
  public Bicycle() {
  }

  public void startEngine() {
    throw new UnsupportedOperationException("Bikes do not have an engine");
  }
}
