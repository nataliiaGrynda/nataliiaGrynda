package collections;

import java.util.*;

public class Exercise01 {
  public static void main(String[] args) {

    /*
    create a list to store below data
     */
String [] countries = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};
     List<String> cities = new ArrayList<>(Arrays.asList(countries));
    System.out.println(cities);
   // Collections.addAll(cities, countries);// anuther way

    cities.remove("Miami");
    cities.remove("Dallas");
    System.out.println(cities);





  }
}
