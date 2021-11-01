package functional;

import java.time.Duration;
import java.time.LocalTime;
import java.util.function.Function;

public class LearnMethodReference {
  public static void main(String[] args) {
    Double price = 100.0;

    //anonymous method
    Double calculate = PriceCalculator.calculate(price, n -> n * 0.9);
    System.out.println(calculate);

    //static method reference
    calculate = PriceCalculator.calculate(price, StaticPriceStrategy::markedUpPrice);
    System.out.println(calculate);

    //instance method reference
    InstancePriceStrategy instancePriceStrategy = new InstancePriceStrategy(1.1);
    calculate = PriceCalculator.calculate(price, instancePriceStrategy::markedUpPrice);
    System.out.println(calculate);

    //Constructor reference
    ProductInterface productInterface = Product::new;
    Product buku = productInterface.getProduct("buku", 100.0);
    System.out.println(buku.productType + ": " + buku.price);

    //Simple case to use method reference
    simpleCaseToUse();
  }

  interface PriceCalculator {
    static Double calculate(Double price, Function<Double, Double> f) {
      return f.apply(price);
    }
  }

  static class StaticPriceStrategy {
    static Double normalPrice(Double price) {
      return price;
    }

    static Double smallDiscountPrice(Double price) {
      return price * 0.9;
    }

    static Double markedUpPrice(Double price) {
      return price * 1.2;
    }
  }

  static class InstancePriceStrategy {
    Double modifier;

    public InstancePriceStrategy(Double modifier) {
      this.modifier = modifier;
    }

    Double normalPrice(Double price) {
      return modifier * price;
    }

    Double smallDiscountPrice(Double price) {
      return modifier * price * 0.9;
    }

    Double markedUpPrice(Double price) {
      return modifier * price * 1.2;
    }
  }

  static class Product {
    public String productType;
    public Double price;

    public Product(String productType, Double price) {
      this.productType = productType;
      this.price = price;
    }
  }

  interface ProductInterface {
    Product getProduct(String productType, Double price);
  }

  abstract static class TimeLogging {
    void run() {
    }

    public void runWithTimeLogging() {
      LocalTime before = LocalTime.now();
      run();
      LocalTime after = LocalTime.now();
      System.out.printf("Execution took %d ms%n", Duration.between(before, after).toMillis());
    }
  }

  static class ProductBooking extends TimeLogging {
    @Override void run() {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    static void runStatic() {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  static void runWithTimeLogging(Runnable runnable) {
    LocalTime before = LocalTime.now();
    runnable.run();
    LocalTime after = LocalTime.now();
    System.out.printf("Execution took %d ms%n", Duration.between(before, after).toMillis());
  }

  private static void simpleCaseToUse() {
    //Any class that wants this, needs to inherit
    //Java doesn't support multiple inheritance
    ProductBooking productBooking = new ProductBooking();
    productBooking.runWithTimeLogging();

    //With method reference
    runWithTimeLogging(() -> System.out.println("runnn"));
    runWithTimeLogging(ProductBooking::runStatic);
  }
}
