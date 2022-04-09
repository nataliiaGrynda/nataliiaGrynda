package homework;

import java.util.Scanner;

public class Homework07 {
  public static void main(String[] args) {

    System.out.println("-----Task1-----");
    Scanner userInput = new Scanner(System.in);

/*
      int num1 = (int) (Math.random() * 11);
      int num2 = (int) (Math.random() * 11);
      int num3 = (int) (Math.random() * 11);
      int num4 = (int) (Math.random() * 11);
      System.out.println("Number 1 = " + num1);
      System.out.println("Number 2 = " + num2);
      System.out.println("Number 3 = " + num3);
      System.out.println("Number 4 = " + num4);
      System.out.println("Absolute difference of " + num1 + " with " + 5 + " is = " + (Math.abs(num1 - 5)));
      System.out.println("Absolute difference of " + num2 + " with " + 5 + " is = " + (Math.abs(num2 - 5)));
      System.out.println("Absolute difference of " + num3 + " with " + 5 + " is = " + (Math.abs(num3 - 5)));
      System.out.println("Absolute difference of " + num4 + " with " + 5 + " is = " + (Math.abs(num4 - 5)));


      if (num1 > num2 && num1 > num3 && num1 > num4) {
          System.out.println("Greatest number is = " + num1);
      } else if (num2 > num1 && num2 > num3 && num2 > num4) {
          System.out.println("Greatest number is = " + num2);
      } else if (num3 > num1 && num3 > num2 && num3 > num4) {
          System.out.println("Greatest number is = " + num3);
      } else if (num4 > num1 && num4 > num3 && num4 > num2) {
          System.out.println("Greatest number is = " + num4);
      }
      if (num1 < num2 && num1 < num3 && num1 < num4) {
          System.out.println("Smallest number is = " + num1);
      } else if (num2 < num1 && num2 < num3 && num2 < num4) {
          System.out.println("Smallest number is = " + num2);
      } else if (num3 < num1 && num3 < num2 && num3 < num4) {
          System.out.println("Smallest number is = " + num3);
      } else if (num4 < num1 && num4 < num3 && num4 < num2) {
          System.out.println("Smallest number is = " + num4);
      }


      System.out.println("-----Task2-----");
      int number1 = -50 + (int) (Math.random() * ((50 - (-50)) + 1));
      int number2 = -50 + (int) (Math.random() * ((50 - (-50)) + 1));
      int number3 = -50 + (int) (Math.random() * ((50 - (-50)) + 1));
      int number4 = -50 + (int) (Math.random() * ((50 - (-50)) + 1));
      int number5 = -50 + (int) (Math.random() * ((50 - (-50)) + 1));
      int number6 = -50 + (int) (Math.random() * ((50 - (-50)) + 1));
      int number7 = -50 + (int) (Math.random() * ((50 - (-50)) + 1));
      int number8 = -50 + (int) (Math.random() * ((50 - (-50)) + 1));
      System.out.println("Number 1 = " + number1);
      System.out.println("Number 2 = " + number2);
      System.out.println("Number 3 = " + number3);
      System.out.println("Number 4 = " + number4);
      System.out.println("Number 5 = " + number5);
      System.out.println("Number 6 = " + number6);
      System.out.println("Number 7 = " + number7);
      System.out.println("Number 8 = " + number8);

      if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5 && number1 > number6 && number1 > number7 && number1 > number8) {
          System.out.println("Greatest number is = " + number1);
      } else if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5 && number2 > number6 && number2 > number7 && number2 > number8) {
          System.out.println("Greatest number is = " + number2);
      } else if (number3 > number2 && number3 > number1 && number3 > number4 && number3 > number5 && number3 > number6 && number3 > number7 && number3 > number8) {
          System.out.println("Greatest number is = " + number3);
      } else if (number4 > number2 && number4 > number3 && number4 > number1 && number4 > number5 && number4 > number6 && number4 > number7 && number4 > number8) {
          System.out.println("Greatest number is = " + number4);
      } else if (number5 > number2 && number5 > number3 && number5 > number4 && number5 > number1 && number5 > number6 && number5 > number7 && number5 > number8) {
          System.out.println("Greatest number is = " + number5);
      } else if (number6 > number2 && number6 > number3 && number6 > number4 && number6 > number5 && number6 > number1 && number6 > number7 && number6 > number8) {
          System.out.println("Greatest number is = " + number6);
      } else if (number7 > number2 && number7 > number3 && number7 > number4 && number7 > number5 && number7 > number6 && number7 > number1 && number7 > number8) {
          System.out.println("Greatest number is = " + number7);
      } else if (number8 > number2 && number8 > number3 && number8 > number4 && number8 > number5 && number8 > number6 && number8 > number7 && number8 > number1) {
          System.out.println("Greatest number is = " + number8);
      }
      if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5 && number1 < number6 && number1 < number7 && number1 < number8) {
          System.out.println("Smallest number is = " + number1);
      } else if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5 && number2 < number6 && number2 < number7 && number2 < number8) {
          System.out.println("Smallest number is = " + number2);
      } else if (number3 < number2 && number3 < number1 && number3 < number4 && number3 < number5 && number3 < number6 && number3 < number7 && number3 < number8) {
          System.out.println("Smallest number is = " + number3);
      } else if (number4 < number2 && number4 < number3 && number4 < number1 && number4 < number5 && number4 < number6 && number4 < number7 && number4 < number8) {
          System.out.println("Smallest number is = " + number4);
      } else if (number5 < number2 && number5 < number3 && number5 < number4 && number5 < number1 && number5 < number6 && number5 < number7 && number5 < number8) {
          System.out.println("Smallest number is = " + number5);
      } else if (number6 < number2 && number6 < number3 && number6 < number4 && number6 < number5 && number6 < number1 && number6 < number7 && number6 < number8) {
          System.out.println("Smallest number is = " + number6);
      } else if (number7 < number2 && number7 < number3 && number7 < number4 && number7 < number5 && number7 < number6 && number7 < number1 && number7 < number8) {
          System.out.println("Smallest number is = " + number7);
      } else if (number8 < number2 && number8 < number3 && number8 < number4 && number8 < number5 && number8 < number6 && number8 < number7 && number8 < number1) {
          System.out.println("Smallest number is = " + number8);
      }

      int average = ((number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8) / 8);
      System.out.println("Average of 8 numbers is = " + average);

      if (number3 >= 0 && number3 <= 50) {
          System.out.println("3rd number is positive = true");
      } else {
          System.out.println("3rd number is positive = false");
      }
      if (number5 >= 0 && number5 <= 50) {
          System.out.println("5th number is positive = true");
      } else {
          System.out.println("5th number is positive = false");
      }
      if (number1 == 0 || number2 == 0 || number3 == 0 || number4 == 0 || number5 == 0 || number6 == 0 || number7 == 0 || number8 == 0) {
          boolean numCheck = false;
          System.out.println("There is at least one zero among those numbers is = " + numCheck);
      }


      System.out.println("-----Task4-----");

      int numb1 = (int) (Math.random() * 101);
      int numb2 = (int) (Math.random() * 101);
      int numb3 = (int) (Math.random() * 101);
      System.out.println(numb1);
      System.out.println(numb2);
      System.out.println(numb3);
      if (numb1 >= 25) {
          System.out.println("true");
      } else if (numb2 >= 25) {
          System.out.println("true");
      } else if (numb3 >= 25) {
          System.out.println("true");
      } else if (numb1 <= 25) {
          System.out.println("false");
      } else if (numb2 <= 25) {
          System.out.println("false");
      } else if (numb3 <= 25) {
          System.out.println("false");
      }
      System.out.println("end of program");

      System.out.println("-----Task5-----");

      System.out.println("Please enter number between 1 and 7");
      int inputNumber = userInput.nextInt();

      if (inputNumber == 1) {
          System.out.println("The number entered returns MONDAY");
      } else if (inputNumber == 2) {
          System.out.println("The number entered returns TUESDAY");
      } else if (inputNumber == 3) {
          System.out.println("The number entered returns WEDNESDAY");
      } else if (inputNumber == 4) {
          System.out.println("The number entered returns THURSDAY");
      } else if (inputNumber == 5) {
          System.out.println("The number entered returns FRIDAY");
      } else if (inputNumber == 6) {
          System.out.println("The number entered returns SATURDAY ");
      } else if (inputNumber == 7) {
          System.out.println("The number entered returns SUNDAY");
      }


        System.out.println("-----Task6-----");

        System.out.println("Please enter number between -10 and 10");
        int randomNumber = userInput.nextInt();

        if (randomNumber > -10) {
            System.out.println("Number entered is POSITIVE");
        } else if (randomNumber < -10) {
            System.out.println("Number entered is NEGATIVE");
        } else if (randomNumber == 0) {
            System.out.println("Number entered is ZERO");
        } else if (randomNumber % 2 == 0) {
            System.out.println("Number entered is EVEN");
        } else if (randomNumber % 1 == 1) {
            System.out.println("Number entered is ODD");


            System.out.println("-----Task7-----");
            System.out.println("Tell me your exam results?");
            int examResults1 = userInput.nextInt(), examResults2 = userInput.nextInt(), examResults3 = userInput.nextInt();

            if (examResults1 >= 70) {
                System.out.println("YOU PASSED");
            }
            if (examResults2 >= 70) {
                System.out.println("YOU PASSED");

            }
            if (examResults3 >= 70) {

                System.out.println("YOU PASSED");
            } else {
                System.out.println("YOU FAILED");


            }
        }

    System.out.println("----Task8-----");
    System.out.println("Please enter 3 numbers");
    int n1111 = userInput.nextInt();
    int n2222 = userInput.nextInt();
    int n3333 = userInput.nextInt();
    if (n1111 == n2222 && n1111 == n3333) {
      System.out.println("TRIPLE MATCH");
    } else if (n1111 == n2222 || n1111 == n3333) {
      System.out.println("DOUBLE MATCH");
    } else {
      System.out.println("NO MATCH");
    }*/




  }

}










