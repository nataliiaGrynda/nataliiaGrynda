package collectionsFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise03_count_each_character_in_string {
  public static void main(String[] args) {



    /*
    count each letter
    C=1
    h=1
    i=4
    c=3
    a=2
    g=1
    o=1
     =4
     s
     */
//linked hashMap.. need to keep the order

    String word = "Chicago is a nice city";

    LinkedHashMap<Character,Integer> charCount = new LinkedHashMap<>();

   /* for(Character c: word.toCharArray()){
      System.out.println(c);
    }
   */

    for (char c : word.toCharArray()) {
      if(!charCount.containsKey(c)) charCount.put(c, 1);
      else charCount.put(c, charCount.get(c)+1);
    }
    for(Map.Entry entry : charCount.entrySet()){
      System.out.println(entry);
    }
















  }
}
