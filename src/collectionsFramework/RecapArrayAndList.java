package collectionsFramework;

import java.util.*;

public class RecapArrayAndList {
  public static void main(String[] args) {
/*
Create an int array to store 1, 5, 7, 9, 10
Then, print the array
 */

    int[] arr = {1, 5, 7, 9, 10,10};//null is not allowed as it is primitives
    System.out.println(Arrays.toString(arr));
    System.out.println(arr[2]);//7 print secound array

    System.out.println(".....string array.....");

   String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", "null", "null" };//allows duplicates, keeps the insertion
    System.out.println(Arrays.toString(cities));

    /*
    List: ArrayList - vector, are almost the same, but the differnse vector is thread safe
     */

    ArrayList<String> names1 = new ArrayList<>();
    List<String> names2 = new ArrayList<>();
   // Collection<String> names3 = new ArrayList<>();- child can take shape of any perent... but we dont use them
   // Iterable<String> names4 = new ArrayList<>();
  //  Object names5 = new ArrayList<>();
   // Cloneable names6 = new ArrayList<>();
    ArrayList<String> cities2 = new ArrayList<>(Arrays.asList(cities));
    Collections.addAll(cities2, cities);
    cities2.add("Tokyo");// allows duplicates.
    System.out.println(cities2);
    System.out.println(cities2.get(3));//denver

// vector is treadSafe means sinhronized. if we ran multiple programs at the same tome vector is safe to run.
    Vector<String> names = new Vector<>();
    names.add("null");
    names.add("Regina");
    names.add("Regina");
    names.add("Data");
    System.out.println(names.size());

    names.forEach(System.out::println);
    System.out.println("names of index of5 = " +  names.get(2));


    System.out.println("...... String linked List.......");

    LinkedList<String> object1 = new LinkedList<>();
    List<String> object2 = new LinkedList<>(); //even tho it is like linkedlist but it acts like a list

    object1.add("Phone");
    object1.add("Computer");
    object1.add("Airpods");
    object1.add("Screen");
    object1.add("Screen");
    object1.add(null);
    object1.add(null);
    object1.add(null);
    object1.add(null);


    System.out.println(object1.getLast());
    System.out.println(object1);
    System.out.println(object1.get(2));
    System.out.println(object1.stream().filter(Objects::isNull).count());//4

  }
}
