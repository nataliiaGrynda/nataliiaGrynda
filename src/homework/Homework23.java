package homework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {
  /*
    Requirement:
    Write a method called as parseData() which takes a String has some keys in {} and
    values after between }{ and returns a collection that has all the keys and values
    as entries.
    NOTE: The keys should be sorted!
     */

  public static TreeMap<String, String> parseData(String str) {
    TreeMap<String, String> map = new TreeMap<>();
    String[] arr = str.replaceAll("[{}]", " ").split(" ");
    for (int i = 1; i < arr.length; i += 2) {
      map.put(arr[i], arr[i + 1]);
    }
    return map;
  }

  /*
  Requirement:
  Write a method called as calculateTotalPrice1() which takes a Map of some shopping
  items with their amounts and calculates the total prices as double. Item prices are given below
  Apple = $2.00
  Orange = $3.29
  Mango = $4.99
  Pineapple = $5.25
   */
  public static double calculateTotalPrice1(Map<String, Integer> map) {
    double totalPrice = 0.00;
    HashMap<String, Double> map1 = new HashMap<>();
    map1.put("Apple", 2.00);
    map1.put("Mango", 4.99);
    map1.put("Orange", 3.29);
    map1.put("Pineapple", 5.25);

    for (String s : map.keySet()) {
      totalPrice += map.get(s) * map1.get(s);
    }
    return totalPrice;
  }

  /*
  Requirement:
  Write a method calculateTotalPrice2() which takes a Map of some shopping items
  with their amounts and calculates the total prices as double. Item prices are given below
  Apple = $2.00
  Orange = $3.29
  Mango = $4.99
  BUT there will be some discounts as below
  There will be %50 discount for every second Apple
  There will be 1 free Mango if customer gets 3. So, fourth one is free.
   */
  public static double calculateTotalPrice2(Map<String, Integer> map) {
    Map<String, Double> prices = new LinkedHashMap<>();
    prices.put("Apple", 2.00);
    prices.put("Orange", 3.29);
    prices.put("Mango", 4.99);
    double sum = 0.00;
    for (String key : map.keySet()) {
      for (int i = 1; i <= map.get(key); i++) {
        if (key.equals("Apple")) {
          if (i % 2 != 0) sum += prices.get(key);
          else sum += prices.get(key) / 2;
        } else if (key.equals("Mango")) {
          if (i % 4 != 0) sum += prices.get(key);
        } else sum += prices.get(key);
      }
    }
    return sum;
  }


  public static void main(String[] args) {
    String str = "{104}LA{101}Paris{102}Berlin{103}Chicago{100}London";
    System.out.println(parseData(str));
    Map<String, Integer> items = new LinkedHashMap<>();
    items.put("Apple", 4);
    items.put("Orange", 3);
    items.put("Mango", 8);

    double[] prices = {2.0, 4.99};
    System.out.println(calculateTotalPrice2(items));

  }
}
