package simpleFactoryPattern;

import simpleFactoryPattern.pizza.Pizza;

public class SimplePizzaStore {
  public Pizza orderPizza(String type) {
    SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
    Pizza pizza = simplePizzaFactory.createPizza(type);
    pizza.prepare();
    pizza.cook();
    return pizza;
  }
}
