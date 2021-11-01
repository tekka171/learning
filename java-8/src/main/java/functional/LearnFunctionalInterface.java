package functional;

public class LearnFunctionalInterface {
  interface Product {
    void booking(String id);
  }

  static class FlightProduct implements Product {
    @Override public void booking(String id) {
      System.out.println("Book flight id " + id);
    }
  }

  static class HotelProduct implements Product {
    @Override public void booking(String id) {
      System.out.println("Book Hotel id " + id);
    }
  }

  static class BookingService {
    private Product product;

    public BookingService() {
    }

    public void setProduct(Product product) {
      this.product = product;
    }

    public void booking(String id) {
      product.booking(id);
    }
  }

  public static void main(String[] args) {
    //Before Java 8
    Product flight = new FlightProduct();
    Product hotel = new HotelProduct();

    BookingService bookingService = new BookingService();
    bookingService.setProduct(flight);
    bookingService.booking("10");

    bookingService.setProduct(hotel);
    bookingService.booking("5");

    //After Java 8
    bookingService.setProduct((n) -> System.out.println("Book flight with Java 8 for id " + n));
    bookingService.booking("10");

    bookingService.setProduct((n) -> System.out.println("Book hotel with Java 8 for id " + n));
    bookingService.booking("5");
  }
}
