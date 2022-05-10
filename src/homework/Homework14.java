package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework14 {
  public static void main(String[] args) {

    System.out.println("_____Task1_____");
    int[] numbers = {-4, 45, -7, 0, 0, 10, 45, 45};

    boolean findDuplicate = false;
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] == numbers[j]) {
          System.out.println(numbers[i]);
          findDuplicate = true;
          break;
        }
      }
      if (findDuplicate) break;
    }
    if (!findDuplicate) System.out.println("There is no duplicates");


    System.out.println("_____Task2_____");

    String[] words = {"Z", "abc", "z", "123", "#"};

    boolean isDuplicate = false;
    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (words[i].equalsIgnoreCase(words[j])) {
          System.out.println(words[i]);// i print the first Z
          isDuplicate = true;
          break;// as soon i find duplicate break it
        }
      }
      if (!isDuplicate) break;// this break helps to get read of second match

    }
    if (!isDuplicate) System.out.println("There is no duplicates");


    System.out.println("____Task3____");


    int[] numbersTask3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
    String s1 = "";
    for (int i = 0; i < numbersTask3.length-1; i++) {
      for (int j = i + 1; j < numbersTask3.length; j++) {
        if (numbersTask3[i] == numbersTask3[j] && !s1.contains(numbersTask3[i] + "")) {
          s1 += numbersTask3[i] + "\n";
        }
      }
    }
  //System.out.println(s1.isEmpty()) ? "There is no duplicates: s1";


    System.out.println("_____Task4______");

    String[] wordsTask4 = {"python", "foo", "foo", "java", "123"};

    boolean isDuplicateTask4 = false;
    for (int i = 0; i < wordsTask4.length; i++) {
      for (int j = i + 1; j < wordsTask4.length; j++) {
        if (wordsTask4[i].equalsIgnoreCase(wordsTask4[j])) {
          System.out.println(wordsTask4[i]);
          isDuplicateTask4 = true;
          break;
        }
      }
    }
    if (!isDuplicateTask4) System.out.println("There is no duplicates");


    System.out.println("_____Task5_____");

    String[] words1 = {"abc", "foo", "bar"};
    ArrayList<String> wordsStoring = new ArrayList<>();
    for (int i = words1.length - 1; i >= 0; i--) wordsStoring.add(words1[i]);
    {
      System.out.println(wordsStoring);

    }

    System.out.println("_____Task6_____");


    String str = "Java is fun";
    String[] reverseStr = str.split(" ");
    String finalString = "";
    for (String s : reverseStr) {
      String reverse = "";
      for (int i = s.length()-1; i >=0 ; i--) {
        reverse += s.charAt(i);
      }
      finalString += reverse + " ";
    }
    System.out.println(finalString);
    
    
    
    
    
    

  }
}
