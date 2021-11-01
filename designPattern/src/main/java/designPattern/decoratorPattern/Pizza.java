package designPattern.decoratorPattern;

public abstract class Pizza {
  String description = "Unknown Beverage";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
