package methods;
import utilities.ScannerHelper;

import java.util.Scanner;
public class FindIfNumberIsPosNegOrZero {
  public static void main(String[] args) {

/*
Ask user to enter an any number
-Print "The number is positive" if the user enters a positive number
-Print "The number is negative" if the user enters a negative number
-Print "The number is zero" if the user enters zero
 */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter any number");

int number = scanner.nextInt();

int num = ScannerHelper.getNumberFromUser();




  }
}
