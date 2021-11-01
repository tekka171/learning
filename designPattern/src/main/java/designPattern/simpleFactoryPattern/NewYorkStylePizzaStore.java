package designPattern.simpleFactoryPattern;

import designPattern.simpleFactoryPattern.pizza.NewYorkCheesePizza;
import designPattern.simpleFactoryPattern.pizza.NewYorkGreekPizza;
import designPattern.simpleFactoryPattern.pizza.NewYorkPepperoniPizza;
import designPattern.simpleFactoryPattern.pizza.Pizza;

public class NewYorkStylePizzaStore extends PizzaStore {
  @Override protected Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("Cheese")) {
      pizza = new NewYorkCheesePizza();
    } else if (type.equals("Greek")) {
      pizza = new NewYorkGreekPizza();
    } else if (type.equals("Pepperoni")) {
      pizza = new NewYorkPepperoniPizza();
    }
    return pizza;
  }
}
