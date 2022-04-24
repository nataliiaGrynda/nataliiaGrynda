package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Exercise01_remove_duplicates {
  public static void main(String[] args) {


    /*

     */

    System.out.println(".....first way - not preferd");
    ArrayList<String> objects = new ArrayList<>();
objects.add("Computer");
objects.add("Phone");
    objects.add("Mouse");
    objects.add("Mouse");
    objects.add("Phone");
    objects.add("Pen");

    ArrayList<String> uniques = new ArrayList<>();
    for (String object : objects) {
      if(!uniques.contains(object)) uniques.add(object);{


        //TreeSet -> computer, mouse, pen, phone... will remove all the duplicates and sort them
      //HashSet... when we want to remove the duplicates and you dont care about the order
      //LinkedHashSet is the one i need for this
        LinkedHashSet<String> muUniques = new LinkedHashSet<>();
        System.out.println(muUniques);











      }
    }










  }
}
