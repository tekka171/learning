package designPattern.simpleFactoryPattern;

import designPattern.simpleFactoryPattern.pizza.ChicagoCheesePizza;
import designPattern.simpleFactoryPattern.pizza.ChicagoGreekPizza;
import designPattern.simpleFactoryPattern.pizza.ChicagoPepperoniPizza;
import designPattern.simpleFactoryPattern.pizza.Pizza;

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
