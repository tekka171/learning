package designPattern.adapterPattern;

import designPattern.adapterPattern.drone.Drone;
import designPattern.adapterPattern.duck.Duck;

public class DroneToDuckAdapter implements Duck {
  private final Drone drone;

  public DroneToDuckAdapter(Drone drone) {
    this.drone = drone;
  }

  @Override public void quack() {
    drone.beep();
  }

  @Override public void fly() {
    drone.spin_rotors();
    // drone.take_off();
  }
}
