package homework;

public class Homework16 {
  public static void main(String[] args) {
    String str = "Selenium is the most common UI\n" +
      "  automation tool.   ";
    System.out.println(countWords(str));
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






}














