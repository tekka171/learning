package designPattern.simpleFactoryPattern.pizza;

public class PepperoniPizza implements Pizza {
  @Override public void prepare() {
    System.out.println("Preparing Pepperoni Pizza");
  }

  @Override public void cook() {
    System.out.println("Cooking Pepperoni Pizza");
  }
}
