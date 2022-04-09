package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListsToTheArray {
  public static void main(String[] args) {


    ArrayList<String> names = new ArrayList<>();
    names.add("Rami");
    names.add("Naim");
    names.add("Reem");

    LinkedList<Integer> ages = new LinkedList<>();
    ages.add(25);
    ages.add(26);
    ages.add(27);
    ages.add(30);

    Vector<Boolean> booleans = new Vector<>();
    booleans.add(true);
    booleans.add(false);
    booleans.add(false);
    booleans.add(false);

    //converting lists to Array


    System.out.println("________1st way_____");
    String[] namesArr = new String[names.size()];
//way one manual way
    for (int i = 0; i < names.size(); i++) {
      namesArr[i] = names.get(i);
    }
    System.out.println(Arrays.toString(namesArr));


    System.out.println("____second way_____");
    Object[] namesArr2 = names.toArray();// object is the perent of anythyng in java... object oriented




    Object[] agesArr = ages.toArray();
    Object[] booleansArr = booleans.toArray();


    System.out.println(Arrays.toString(namesArr2));
    System.out.println(Arrays.toString(agesArr));
    System.out.println(Arrays.toString(booleansArr));






  }
}
