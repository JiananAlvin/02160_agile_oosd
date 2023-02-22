package principles.lsp.violation;

public class Test {
  public Test() {
  }

  public static void main(String[] args) {
    TransportationDevice car = new Car();
    TransportationDevice bike = new Bicycle();
    Object[] devices = new Object[]{car, bike};
    Object[] var7 = devices;
    int var6 = devices.length;

    for(int var5 = 0; var5 < var6; ++var5) {
      Object device = var7[var5];
      ((TransportationDevice)device).startEngine();
    }

  }
}
