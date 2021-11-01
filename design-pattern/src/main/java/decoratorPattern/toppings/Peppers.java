package decoratorPattern.toppings;

import decoratorPattern.Pizza;

public class Peppers extends Toppings {
  private final Pizza pizza;

  public Peppers(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override public double cost() {
    return pizza.cost() + 0.1;
  }

  @Override public String getDescription() {
    return pizza.getDescription() + ", Peppers";
  }
}
