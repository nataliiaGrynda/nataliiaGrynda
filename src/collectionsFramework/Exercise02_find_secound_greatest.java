package collectionsFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise02_find_secound_greatest {
  public static void main(String[] args) {


    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(7);
    numbers.add(3);
    numbers.add(5);
    numbers.add(5);
    numbers.add(7);
    numbers.add(3);
    numbers.add(3);

    //TreeSet it will sort, but doesn't get method
    TreeSet<Integer> uniques = new TreeSet<>(numbers);// converted to TreeSet// sorts, by doesn't have get method
    System.out.println(uniques);
// that is why we need to
    ArrayList<Integer> uniqueList = new ArrayList<>(uniques);// so we convert it back to array list

    System.out.println(uniqueList.get(uniqueList.size()-2));//and get second greatest, with the get method
    System.out.println(uniqueList.get(1));// second smallest





  }
}
