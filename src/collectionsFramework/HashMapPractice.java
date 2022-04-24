package collectionsFramework;

import sun.awt.geom.AreaOp;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
  public static void main(String[] args) {
/*
Key        Value
Ukraine -> Kiev
Spain -> Madrid
 */
    //TreeMap ..... it will sort with the keys..keys are sorted
//LinkedHashMap... would keep the insertion order
    HashMap<String, String> capitals = new HashMap<>();// prints in random order
    capitals.put("Ukraine", "Kiev");
    capitals.put("Spain", "Madrid");
    capitals.put("Portugal", "Lisbon");
    capitals.put("Italy", "Roma");
    capitals.put("USA", "DC");
    capitals.put("Canada", "Ottawa");

    System.out.println(capitals);//printing a hashMap.... it prints random

// how to get a particular key-value pair


    System.out.println(capitals.get("Spain"));
    //all maps provides the get method
    System.out.println(capitals.get("Germany"));// will return null because we don't have that value


    //Map always stores data with key-value pairs

    System.out.println("....understanding hashMap........");


    HashMap<Integer, String> student = new HashMap<>();//unpredictable order it will print
    student.put(1,"Alona");
    student.put(1, "Daria");// it will update the value
    student.put(2,"Abdullah");
    student.put(3, "Abdullah");
    student.put(4, "Data");
    student.put(null, "John");//it will except the null, and print the size 5... if we put another null - it will reassign the value
    student.put(5, null);
    student.put(6, null); //
    student.put(null, null);// will update "John"

    System.out.println(student.size());//4
    System.out.println(student);// will print in different order




  }
}
