package loops.controlStatements;

import java.util.Scanner;

public class Practice02 {
  public static void main(String[] args) {
/*1. ask user to write 2 numbers
2 find min and max numbers
3 print them from smaller to bigger

Write a Java program that asks user to enter 2 different integers
between 0 to 10 ( 0 and 10 are included)
Print all the numbers between given 2 integers starting
from smallest to biggest (given numbers are included)
HOWEVER, do not print the number of 5
 */
    Scanner input = new Scanner(System.in);
    System.out.println("Please print first number");
    int number1 = input.nextInt();
    System.out.println("Please print second number");
     int number2 = input.nextInt();

     // int min = Math.min(number1,number2);
     //  int max = Math.max(number1,number2);

      for(int i = Math.min(number1,number2); i < Math.max(number1,number2); i++){
   System.out.println(i);
   if(i == 5) continue; // if(i != 5) the same thing
        {
   }
 }




  }
}
