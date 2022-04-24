package collectionsFramework;

import java.util.TreeMap;

public class TreeMapPractice {
  public static void main(String[] args) {


    TreeMap<String, Integer> studentsAges = new TreeMap<>();
    studentsAges.put("Kaly", 17);// TreeMap sorts key- value with pairs
    studentsAges.put("Torrie", 20);
    studentsAges.put("Alona", 15);
    studentsAges.put("andrey", 25);
    //studentsAges.put(null, 15);//nullPointerException... doesn't except null
    studentsAges.put("Guluzar", null);// excepts null as an value

    System.out.println(studentsAges);













  }
}
