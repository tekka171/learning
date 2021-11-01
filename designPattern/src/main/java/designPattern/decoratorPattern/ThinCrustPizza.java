package designPattern.decoratorPattern;

public class ThinCrustPizza extends Pizza {
  public ThinCrustPizza() {
    description = "Thin Crust Pizza";
  }

  @Override public double cost() {
    return 5;
  }
}
