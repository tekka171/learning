package decoratorPattern;

public class ThinPizza extends Pizza {
  public ThinPizza() {
    description = "Thin Pizza";
  }

  @Override public double cost() {
    return 4;
  }
}
