package designPattern.iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;

class IteratorPatternTest {
  @Test
  void test1() {
    List<String> arrayList = new ArrayList<>();
    arrayList.add("1");
    arrayList.add("2");
    arrayList.add("3");
    arrayList.add("4");
    arrayList.add("5");

    //Use java's built-in iterator
    for (String s : arrayList) {
      System.out.println("Use java for loop: " + s);
    }

    //Use iterator interface
    Iterator<String> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      System.out.println("Use iterator: " + iterator.next());
    }
  }
}