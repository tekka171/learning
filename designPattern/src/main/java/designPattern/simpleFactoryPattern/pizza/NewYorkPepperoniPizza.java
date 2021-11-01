package designPattern.simpleFactoryPattern.pizza;

public class NewYorkPepperoniPizza implements Pizza {
  @Override public void prepare() {
    System.out.println("Preparing NewYork Pepperoni Pizza");
  }

  @Override public void cook() {
    System.out.println("Cooking NewYork Pepperoni Pizza");
  }
}
