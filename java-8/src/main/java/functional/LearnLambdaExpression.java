package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LearnLambdaExpression {
  interface Calculator {
    void draw();
  }

  public static void main(String[] args) {
    //Lambda syntax
    lambdaSyntax();

    //Lambda for collections
    lambdaForCollections();

    //Lambda is lazy
    lambdaIsLazy();

    //Lambda in nested loop
    lambdaNestedLoop();
  }

  private static void lambdaSyntax() {
    //Lambda syntax: (argument-list) -> {body})

    int width = 10;

    //Implement interface without lambda expression
    Calculator d1 = new Calculator() {
      @Override public void draw() {
        System.out.println("Drawing " + width);
      }
    };
    d1.draw();

    //Implement interface with lambda expression
    Calculator d2 = () -> System.out.println("Drawing with lambda " + width);
    d2.draw();

    System.out.println();
  }

  private static void lambdaForCollections() {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(2);
    numbers.add(5);
    numbers.add(1);
    numbers.add(4);
    numbers.add(3);

    Integer res = 0;
    for (Integer number : numbers) {
      if (number == 3) {
        res = number;
      }
    }

    //Lambda expressions:
    //1. Function - take 1, return 1
    List<Integer> function = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
    for (Integer n : function) {
      System.out.println("Function value: " + n);
    }

    //2. Consumer - take 1, return nothing
    numbers.forEach(n -> System.out.println("Consumer value: " + n));

    //3. Supplier - take nothing, return something
    List<Integer> collect = numbers.stream().collect(Collectors.toList());
    System.out.println("Supplier value: " + collect);

    //collect(supplier, accumulator, and combiner)
    //sample: create a new list with value doubled
    collect = numbers.stream().collect(ArrayList::new, (n, m) -> n.add(m * 2), (n, m) -> {
    });
    System.out.println("Supplier value: " + collect);

    //sample: create a new list with value tripled in parallel
    collect = numbers.parallelStream().collect(ArrayList::new, (n, m) -> n.add(m * 3), (n, m) -> n.addAll(m));
    System.out.println("Supplier value: " + collect);

    //4. Predicate - take 1, return bool
    res = numbers.stream().filter(n -> n == 3).findFirst().orElse(null);
    System.out.println("Predicate value: " + res);

    System.out.println();
  }

  private static void lambdaIsLazy() {
    int number = 4;

    //1. Use non-lambda
    System.out.println("Lambda is lazy 1");
    boolean numberTwo = isNumberTwo(number);
    boolean numberThree = isNumberThree(number);
    if (numberTwo && numberThree) {
      System.out.println(true);
    }

    //2. Use non-lambda, NOT wasting
    System.out.println("Lambda is lazy 2");
    if (isNumberTwo(number) && isNumberThree(number)) {
      System.out.println(true);
    }

    //3. Use lambda
    System.out.println("Lambda is lazy 3");
    Supplier<Boolean> lambdaNumberTwo = () -> number == 2;
    Supplier<Boolean> lambdaNumberThree = () -> isNumberThree(number);
    if (lambdaNumberTwo.get() && lambdaNumberThree.get()) {
      System.out.println(true);
    }

    System.out.println();
  }

  private static boolean isNumberTwo(int number) {
    System.out.println("isNumberTwo: " + number);
    return number == 2;
  }

  private static boolean isNumberThree(int number) {
    System.out.println("isNumberThree: " + number);
    return number == 3;
  }

  private static void lambdaNestedLoop() {
    Owner joko = new Owner("Joko", 20);
    Owner budi = new Owner("Budi", 18);
    Owner tono = new Owner("Tono", 17);
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product("Buku", 5, new ArrayList<Owner>() {{
      add(joko);
    }}));
    products.add(new Product("Pencil", 1, new ArrayList<Owner>() {{
      add(tono);
      add(joko);
    }}));
    products.add(new Product("Penggaris", 2, new ArrayList<Owner>() {{
      add(budi);
    }}));
    products.add(new Product("Penghapus", 2, new ArrayList<Owner>() {{
      add(joko);
      add(budi);
    }}));

    //Find product which is NOT owned by "Budi"
    List<Product> filteredProduct = new ArrayList<>();

    //Without lambda
    for (Product product : products) {
      boolean notOwnedByBudi = true;
      for (Owner owner : product.getOwners()) {
        if (owner.getName().equals("Budi")) {
          notOwnedByBudi = false;
          break;
        }
      }
      if (notOwnedByBudi) {
        filteredProduct.add(product);
      }
    }
    System.out.println("Lambda nested loop: " + filteredProduct);

    //With lambda
    filteredProduct = products.stream()
        .filter(n -> n.getOwners().stream().noneMatch(m -> m.getName().equals("Budi")))
        .collect(Collectors.toList());
    System.out.println("Lambda nested loop: " + filteredProduct);
  }

  static class Product {
    String productType;
    int quantity;
    List<Owner> owners;

    @Override public String toString() {
      return "Product{" +
          "productType='" + productType + '\'' +
          ", quantity=" + quantity +
          ", owners=" + owners +
          '}';
    }

    public Product(String productType, int quantity, List<Owner> owners) {
      this.productType = productType;
      this.quantity = quantity;
      this.owners = owners;
    }

    public List<Owner> getOwners() {
      return owners;
    }

    public void setOwners(List<Owner> owners) {
      this.owners = owners;
    }

    public String getProductType() {
      return productType;
    }

    public void setProductType(String productType) {
      this.productType = productType;
    }

    public int getQuantity() {
      return quantity;
    }

    public void setQuantity(int quantity) {
      this.quantity = quantity;
    }
  }

  static class Owner {
    String name;
    int age;

    @Override public String toString() {
      return "Owner{" +
          "name='" + name + '\'' +
          ", age=" + age +
          '}';
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public Owner(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
}
