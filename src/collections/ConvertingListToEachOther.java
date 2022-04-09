package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListToEachOther {
  public static void main(String[] args) {


    /*
    Array list to LinkedList
    LinkedList to ArrayList
    Vector - ArrayList
    ArryaList - Vector

     */

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(7);
    numbers.add(9);
    System.out.println("The arrayList = " + numbers);
    //converting ArrayList to a LinkedList
    LinkedList<Integer> numbers2 = new LinkedList<>(numbers);
    System.out.println("The linkedList = " + numbers2);


//CONVERTING LINKED LIST TO AARAYLIST

    ArrayList<Integer> numbers3 = new ArrayList<>(numbers2);


    ArrayList<String> names = new ArrayList<>();


    String[] namesArr= {"Kaly", "torie","Taylor"};
    Vector<String> names1 = new Vector<>();
    Collections.addAll(names1,namesArr);
    System.out.println(names1);

  }
}
