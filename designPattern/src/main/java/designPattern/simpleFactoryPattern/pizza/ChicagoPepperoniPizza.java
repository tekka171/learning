package designPattern.simpleFactoryPattern.pizza;

public class ChicagoPepperoniPizza implements Pizza {
  @Override public void prepare() {
    System.out.println("Preparing Chicago Pepperoni Pizza");
  }

  @Override public void cook() {
    System.out.println("Cooking Chicago Pepperoni Pizza");
  }
}
