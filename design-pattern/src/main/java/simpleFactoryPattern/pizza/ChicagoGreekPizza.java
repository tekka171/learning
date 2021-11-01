package simpleFactoryPattern.pizza;

public class ChicagoGreekPizza implements Pizza {
  @Override public void prepare() {
    System.out.println("Preparing Chicago Greek Pizza");
  }

  @Override public void cook() {
    System.out.println("Cooking Chicago Greek Pizza");
  }
}
