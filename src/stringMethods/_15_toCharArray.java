package stringMethods;

import java.util.Arrays;

public class _15_toCharArray {
  public static void main(String[] args) {


    String s = "Java";
    char[] chars = s.toCharArray(); //{'j', 'a','v','a'};we can put "Java" insteade of s
    System.out.println(Arrays.toString(s.toCharArray()));


    System.out.println(Arrays.toString("hello".toCharArray()));

  }
}
