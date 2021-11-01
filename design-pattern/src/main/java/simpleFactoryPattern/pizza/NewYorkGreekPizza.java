package simpleFactoryPattern.pizza;

public class NewYorkGreekPizza implements Pizza {
  @Override public void prepare() {
    System.out.println("Preparing NewYork Greek Pizza");
  }

  @Override public void cook() {
    System.out.println("Cooking NewYork Greek Pizza");
  }
}
