package collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

public class SortingArrayList {
  public static void main(String[] args) {

    //how to sort an arrayList
    int[] numbersArray = {3,7,0,4};
    System.out.println("My array before sort = " + numbersArray);
    Arrays.sort(numbersArray);
    System.out.println("My array after sort = " + numbersArray);


    //sorting an ArrayList

    ArrayList<Integer> numbersList = new ArrayList<>();
    numbersList.add(3);
    numbersList.add(7);
    numbersList.add(0);
    numbersList.add(4);
    Collections.sort(numbersList);
    System.out.println(numbersList);













  }
}
