package collectionsFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
  public static void main(String[] args) {


    LinkedHashSet<String> words = new LinkedHashSet<>();
    words.add("Foo");//keeps the insertion order
    words.add("Bar");// it douent provide any method that uses index
    words.add("foo");
    words.add("BAR");
    words.add(null);//can have only one null
    words.add("John");//doesnt allowed duplicates
    // we use it when we vant to keep the inserted order, and we dont exses indexses one by one,


    System.out.println(words);











  }
}
