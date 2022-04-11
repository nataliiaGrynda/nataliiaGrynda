package javaMemoryManagement;

import java.util.ArrayList;

public class StringExample {
  public static void main(String[] args) {



    String[] names1 =  new String[5];
    ArrayList<Integer> numbers = new ArrayList<>();

    //first way to create string
    String names = "John";

    //second way to create string
    String names2 = new String("Alex");
    String names3 = "Alex";
    String names4 = "John";
    System.out.println(names1.equals(names4));

    for (int i = 0; i < 1000; i++) {
      String name = new String("Kaly");
    }


  }
}
