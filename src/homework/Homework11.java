package homework;

import java.util.Scanner;

public class Homework11 {
  public static void main(String[] args) {
/*
    System.out.println("_____Task1_____");
    String msg = "";
    for (int i = 1; i <= 100; i++) {

      if (i % 7 == 0) {
        msg += i + " - ";
      }
    }
    System.out.println(msg.substring(0, msg.length() - 3));

    System.out.println("_____Task2____");
    String str = "";
    for (int i = 1; i < 51; i++) {
      if (i % 2 == 0 && i % 3 == 0) {
        str += i + " - ";

      }
    }
    System.out.println(str.substring(0, str.length() - 3));


    System.out.println("_____Task3_____");
    String str3 = "";
    for (int i = 100; i >= 50; i--) {
      if (i % 5 == 0) {
        str3 += i + " - ";
      }
    }
    System.out.print(str3.substring(0, str3.length() - 3));


    System.out.println("_____Task4____");

    for (int i = 0; i <= 7; i++) {
      System.out.println("The square of " + i + " is = " + i * i);

    }

    System.out.println("_____Task5____");
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    System.out.print(sum);

    System.out.println("____Task6_____");


 */
    Scanner input = new Scanner(System.in);
  /*  System.out.println("Enter positive number");
    int number = input.nextInt();
    System.out.println(number);
    int factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial *= i;
    }

    System.out.println(factorial);


    System.out.println("_____Task7_____");
//1 create scanner object for getting a full name
//2 create a counetr outside of the loop
//3 create a for i loop sto check every single if they are vovel count it
// 4 print out "There are 3 vowel letters in this full name"
    System.out.println("Please enter first and last name");


    String name = input.nextLine().toLowerCase();

    int count = 0;
    for (int i = 0; i <= name.length() - 1; i++) {
      String str6 = name.charAt(i) + "";
      if (str6.equals("a") || str6.equals("e") || str6.equals("i") || str6.equals("o") || str6.equals("u") || str6.equals("y")) {
        count++;
      }
    }
    System.out.println("There are " + count + " vowel letters in this full name");

    System.out.println();


  //2get number from user with scanner add them to sum and if they are more then  or equal to 100
  //1 create do while loop
  // 3 if the number is more then or equal to 100 and we are t first run break
  //3  create a container for counter, sum and number

    System.out.println("____Task8_____");

    int sumTask8 = 0;
    do {
      System.out.println("Please enter a number");
      int numberTask8 = input.nextInt();
      if (numberTask8 >= 100) {
        System.out.println("This number is already is more than 100");
      }
      numberTask8++;
      sumTask8 += numberTask8;
    } while (sumTask8 < 100);
    System.out.println("Sum of the entered numbers is at least 100 ");



//1 two containers at least 0, 1 and for another one for the sum
//create for i loop runs  'n' times
print out 2 numbers

    System.out.println("____Task9____");
    String msg9 = " ";
    int num1Task9 = 0, num2Task9 = 1, num3Task9;

    for (int i = 0; i < 7; i++) {
      System.out.print(num1Task9 + " - ");
      num3Task9 = num1Task9 + num2Task9;
      num1Task9 = num2Task9;
      num2Task9 = num3Task9;
      msg9 += i + " - ";
    }

    System.out.println(msg9.substring(0, msg9.length() - 3));
*/
    System.out.println("____Task10____");


    String nameT10;
    do{
      System.out.println("Please enter name");
      nameT10 = input.nextLine();
    }while(!(nameT10.startsWith("j") || nameT10.startsWith("J")));{
      System.out.println("End of program");
    }

  }
}
