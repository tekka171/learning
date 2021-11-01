package designPattern.adapterPattern;

import designPattern.adapterPattern.drone.Drone;
import designPattern.adapterPattern.drone.SuperDrone;
import designPattern.adapterPattern.duck.Duck;
import designPattern.adapterPattern.duck.MallardDuck;
import org.junit.jupiter.api.Test;

class AdapterPatternTest {
  @Test
  void test1() {
    Duck duck = new MallardDuck();
    testDuck(duck);

    Drone drone = new SuperDrone();
    Duck droneToDuckAdapter = new DroneToDuckAdapter(drone);
    testDuck(droneToDuckAdapter);
  }

  private void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }
}