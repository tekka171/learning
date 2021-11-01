package designPattern.simpleFactoryPattern;

import designPattern.simpleFactoryPattern.pizza.CheesePizza;
import designPattern.simpleFactoryPattern.pizza.GreekPizza;
import designPattern.simpleFactoryPattern.pizza.PepperoniPizza;
import designPattern.simpleFactoryPattern.pizza.Pizza;

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
