import adapterPattern.DroneToDuckAdapter;
import adapterPattern.drone.Drone;
import adapterPattern.drone.SuperDrone;
import adapterPattern.duck.Duck;
import adapterPattern.duck.MallardDuck;
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