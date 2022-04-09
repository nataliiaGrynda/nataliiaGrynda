package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class _02_Practice_Remove_Dublicates {
  public static void main(String[] args) {


    List<String> objects = new ArrayList<>();
    objects.add("Cup");
    objects.add("Book");
    objects.add("Pan");
    objects.add("Cup");
    objects.add("Book");
    objects.add("Book");
    objects.add("Pencil");

    /*
    find unique elements in this and print them
     */
  List<String> uniques = new ArrayList<>();
    for (String object : objects) {
      if(!uniques.contains(object)) uniques.add(object);
    }
    System.out.println(uniques);
     }
   }





