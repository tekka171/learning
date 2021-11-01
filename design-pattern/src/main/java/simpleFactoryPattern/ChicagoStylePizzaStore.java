package simpleFactoryPattern;

import simpleFactoryPattern.pizza.ChicagoCheesePizza;
import simpleFactoryPattern.pizza.ChicagoGreekPizza;
import simpleFactoryPattern.pizza.ChicagoPepperoniPizza;
import simpleFactoryPattern.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
  @Override protected Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("Cheese")) {
      pizza = new ChicagoCheesePizza();
    } else if (type.equals("Greek")) {
      pizza = new ChicagoGreekPizza();
    } else if (type.equals("Pepperoni")) {
      pizza = new ChicagoPepperoniPizza();
    }
    return pizza;
  }
}
