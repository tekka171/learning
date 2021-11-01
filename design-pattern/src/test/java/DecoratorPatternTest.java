import decoratorPattern.Pizza;
import decoratorPattern.ThinCrustPizza;
import decoratorPattern.ThinPizza;
import decoratorPattern.toppings.Cheese;
import decoratorPattern.toppings.Peppers;
import decoratorPattern.toppings.Sausage;
import org.junit.jupiter.api.Test;

class DecoratorPatternTest {
  @Test
  void test1() {
    Pizza thinPizza = new ThinPizza();
    thinPizza = new Cheese(thinPizza);
    thinPizza = new Sausage(thinPizza);
    System.out.println("Cost: " + thinPizza.cost() + " for " + thinPizza.getDescription());

    Pizza thinCrustPizza = new ThinCrustPizza();
    thinCrustPizza = new Cheese(thinCrustPizza);
    thinCrustPizza = new Cheese(thinCrustPizza);
    thinCrustPizza = new Peppers(thinCrustPizza);
    System.out.println("Cost: " + thinCrustPizza.cost() + " for " + thinCrustPizza.getDescription());

  }
}