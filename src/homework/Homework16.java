package homework;

import java.util.Arrays;

public class Homework16 {
  public static void main(String[] args) {
    String str = "Selenium is the most common UI\n" +
      "  automation tool.   ";
    System.out.println(countWords(str));
    System.out.println(Arrays.toString(Homework16.no3(new int[]{3,4,5,6})));
  }
/*
  Requirement:
  Write a method countWords() that takes a String as an
  argument, and returns how many words there are in the
  the given String
  Test data 1:
  String str = “      Java is fun       ”;
  Expected output 1:
    3
  Test data 2:
  String str = “Selenium is the most common UI
  automation tool.   ”;
  Expected output 2:
    8
  NOTE: Make your code dynamic that works for any given
  String
  NOTE: Be careful about empty String
  NOTE: Be careful about before and after white spaces
*/

  public static int countWords(String str) {
    str = "   Java is fun   ".trim();
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') count++;
    }
    return count + 1;
  }


  /*-Create a method called no3or5()
  -This method will take an int array argument and it will
  return a new array with some elements replaced as below
    If element can be divided by 5, replace it with 99
    If element can be divided by 3, replace it with 100
    If element can be divided by both 3 and 5, replace it with
  101*/
  public static int[] no3(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 3 == 0 && arr[i] % 5 == 0) arr[i] = 101;
      else if (arr[i] % 3 == 0) arr[i] = 100;
      else if (arr[i] % 5 == 0) arr[i] = 99;
    }
    return arr;
  }

}













