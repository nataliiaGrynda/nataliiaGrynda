package practice;

import java.util.Scanner;

public class PracticeMyselfNew {


  public static int countWords(String str){
    String[] words = str.trim().split("\\s+");
    return words.length;
  }


  public static void main(String[] args) {
    System.out.println(countWords("I love java and Liam"));

  int[] numbers = {-3,5,4,0,11};
     int count = 0;
    for (int number : numbers) {
      if(number == 2 || number == 3) count++;
      else if (number > 3){
        boolean prime = true;
        for (int i = 2; i <= number / 2; i++) {
          if (number % i == 0) {
            prime = false;
            break;
          }
        }
        if (prime) count++;
      }
    }
    System.out.println(count);


     String name = "Liam";
     String reverse = "";
     for(int i = name.length()-1; i >= 0; i--){
       reverse += name.charAt(i);
     }
    System.out.println(reverse);

     String space = "i love you and";
     int count1 = 0;
    for(int i = 0;i <= space.length();i++){
      if(Character.isWhitespace(i)) count1++;{

      }
    }
    System.out.println(count1);
  }

  }

