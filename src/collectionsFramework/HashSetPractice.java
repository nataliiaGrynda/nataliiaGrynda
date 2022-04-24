package collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
  public static void main(String[] args) {

    /*
    how to create hashSet
     */
//we use set for social security, phone number,
    HashSet<Integer> numbers = new HashSet<>();
    Set<Integer> numbers2 = new HashSet<>();// child in the shape of perent, so we may lose some
    numbers.add(5);// set is known as unordered collection
    numbers.add(10);//ones we add an number it will store it anywhere in the collections
    numbers.add(10);//les effort, just throws everything in the bag
    numbers.add(-3);
    numbers.add(0);//we dont have get method(), findFirst()
    numbers.add(-7);// i dont care abuot the indecses, so i will use set. it dousnt take much memory
    numbers.add(-55);
numbers.add(null);// we can add one null...
    System.out.println(numbers);








  }
}
