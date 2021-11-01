package designPattern.simpleFactoryPattern.pizza;

public class ChicagoCheesePizza implements Pizza {
  @Override public void prepare() {
    System.out.println("Preparing Chicago Cheese Pizza");
  }

  @Override public void cook() {
    System.out.println("Cooking Chicago Cheese Pizza");
  }
}
