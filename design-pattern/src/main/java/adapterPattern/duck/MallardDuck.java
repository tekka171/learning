package adapterPattern.duck;

public class MallardDuck implements Duck {
  @Override public void quack() {
    System.out.println("Quack quack quack");
  }

  @Override public void fly() {
    System.out.println("Flying");
  }
}
