package designPattern.simpleFactoryPattern;

import org.junit.jupiter.api.Test;

class SimpleFactoryPatternTest {
  @Test
  void test1() {
    //The consumer doesn't care about "pizza choices" & "pizza creation"
    SimplePizzaStore pizzaStore = new SimplePizzaStore();
    pizzaStore.orderPizza("Cheese");
  }

  @Test
  void test2() {
    //The consumer manages the "pizza choices", however the "pizza creation" remains with the library owner
    PizzaStore store = new ChicagoStylePizzaStore();
    store.orderPizza("Cheese");
    store.orderPizza("Greek");

    store = new NewYorkStylePizzaStore();
    store.orderPizza("Pepperoni");
  }
}