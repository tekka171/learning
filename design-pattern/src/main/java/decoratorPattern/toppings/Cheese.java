package decoratorPattern.toppings;

import decoratorPattern.Pizza;

public class Cheese extends Toppings {
  private final Pizza pizza;

  public Cheese(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override public double cost() {
    return pizza.cost() + 0.3;
  }

  @Override public String getDescription() {
    return pizza.getDescription() + ", Cheese";
  }
}
