package projects;

import java.util.Scanner;

public class Project06 {
  public static void main(String[] args) {

    System.out.println("_____Task1_____");

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a sentence");
    String sentence = scan.nextLine();
    int count = 0;
    if(sentence.length() > 2 ) {
      for (int i = 0; i < sentence.length(); i++) {
        if (sentence.charAt(i) == ' ')
          count++;
        }
        System.out.println("This sentence has " + (count+1) + " words ");

    } else
      System.out.println("This sentence does not have multiple words");

    System.out.println("_____Task2_____");

       System.out.println("Please enter a word");
       String input = scan.nextLine();
       String reverse = "";
       if(input.length() >= 1) {
         for (int i = input.length() - 1; i >= 0; i--) {
           reverse += input.charAt(i);
         }
           if (input.contains(reverse))
             System.out.println("This word is palindrome");

         else System.out.println("This word is not palindrome");
       } else
           System.out.println("This word does not have 1 or more characters");

    System.out.println("_____Task3_____");

    System.out.println("Please enter sentence");
    String word = scan.nextLine().toLowerCase();
    int countTask3 = 0;
    if (word.length() > 1) {
      for (int i = 0; i <= word.length() - 1; i++) {
        if (word.charAt(i) == 'a')
          countTask3++;
      }
      System.out.println("This sentence has " + countTask3 + " a or A letters");
    }
      else System.out.println("This sentence does not have any characters");

    System.out.println("_____Task4_____");

    System.out.println("Please print a positive number");
    int positiveNumber = scan.nextInt();

    for(int i = 1; i <= positiveNumber; i++){

      if( i % 2 == 0 && i % 3 == 0) {
        System.out.println("FooBar");
      }else if(i % 3 == 0){
        System.out.println("Bar");
      }else if( i % 2 == 0){
        System.out.println("Foo");
      }else
      System.out.println(i);
    }
   }
  }