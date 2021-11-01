package simpleFactoryPattern.pizza;

public class CheesePizza implements Pizza {
  @Override public void prepare() {
    System.out.println("Preparing Cheese Pizza");
  }

  @Override public void cook() {
    System.out.println("Cooking Cheese Pizza");
  }
}
