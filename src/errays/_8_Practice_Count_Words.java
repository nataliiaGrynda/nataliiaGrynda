package errays;

import java.util.Arrays;

public class _8_Practice_Count_Words {
  public static void main(String[] args) {

    /*
    assume u given a string please find how many words you have in the given string

     */


    String s1 = "Today is Tuesday";
    String[] countWords = s1.split(" ");
    System.out.println(Arrays.toString(countWords));

  int count = 0;

      for(char c: s1.toCharArray()){
        if(c == ' ')count++;
    }
    System.out.println(count+1);


    String[] words = s1.split(" ");
    System.out.println(words.length); // 3

    /*

     */

    String s2 = "Some counties i visited were Argentina, Belgium, and Malta";
    String[] s3 = s2.split(" ");

      int counter = 0;
    for (String s : s3) {
      if(s.toLowerCase().startsWith("a")) counter++;
    }
    System.out.println(counter);





  }
}
