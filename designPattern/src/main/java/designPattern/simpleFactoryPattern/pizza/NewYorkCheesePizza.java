package designPattern.simpleFactoryPattern.pizza;

public class NewYorkCheesePizza implements Pizza {
  @Override public void prepare() {
    System.out.println("Preparing NewYork Cheese Pizza");
  }

  @Override public void cook() {
    System.out.println("Cooking NewYork Cheese Pizza");
  }
}
