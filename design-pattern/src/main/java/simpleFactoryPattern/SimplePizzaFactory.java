package simpleFactoryPattern;

import simpleFactoryPattern.pizza.CheesePizza;
import simpleFactoryPattern.pizza.GreekPizza;
import simpleFactoryPattern.pizza.PepperoniPizza;
import simpleFactoryPattern.pizza.Pizza;

public class SimplePizzaFactory {
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("Cheese")) {
      pizza = new CheesePizza();
    } else if (type.equals("Greek")) {
      pizza = new GreekPizza();
    } else if (type.equals("Pepperoni")) {
      pizza = new PepperoniPizza();
    }
    return pizza;
  }
}
