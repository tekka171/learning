package simpleFactoryPattern;

import simpleFactoryPattern.pizza.Pizza;

public abstract class PizzaStore {
  protected abstract Pizza createPizza(String type);

  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);
    pizza.prepare();
    pizza.cook();
    return pizza;
  }
}
