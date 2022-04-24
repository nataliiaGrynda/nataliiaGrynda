package collectionsFramework;

import java.util.TreeSet;

public class TreeSetPractice {
  public static void main(String[] args) {
    //doesn't allowed duplicates, doesn't allow nulls


    TreeSet<Integer> numbers = new TreeSet<>();
    numbers.add(3);// it implicitly sorts automatically
    numbers.add(1);// sets don't allow any method that indexOf
    numbers.add(2);
    numbers.add(5);
    //numbers.add(null); // doesn't allow, it doesn't give compile Error, but when we print it straws an NullPointerException
    System.out.println(numbers);

  TreeSet<String> names = new TreeSet<>();
  names.add("John");
  names.add("John");// this will not be added
  names.add("Joe");//
  names.add("Alex");
  names.add("ali");//when we sort lower case always print the last
    System.out.println(names);











  }
}
