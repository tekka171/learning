package simpleFactoryPattern.pizza;

public class GreekPizza implements Pizza {
  @Override public void prepare() {
    System.out.println("Preparing Greek Pizza");
  }

  @Override public void cook() {
    System.out.println("Cooking Greek Pizza");
  }
}
