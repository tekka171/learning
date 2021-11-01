package decoratorPattern.toppings;

import decoratorPattern.Pizza;

public class Sausage extends Toppings {
  private final Pizza pizza;

  public Sausage(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override public double cost() {
    return pizza.cost() + 0.5;
  }

  @Override public String getDescription() {
    return pizza.getDescription() + ", Sausage";
  }
}
