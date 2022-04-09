package homework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {





        System.out.println("-------Task1-------");

        Scanner collect = new Scanner(System.in);
        System.out.println("Can you please enter 1 numbers");
        int firstNumber = collect.nextInt();
        System.out.println("Can you please enter 2 number");
        int secondNumber = collect.nextInt();
        System.out.println("The average of given two numbers is: = " + ((firstNumber + secondNumber) / 2));


        System.out.println("-------Task2-------");


        System.out.println("Can you please enter 2 numbers");
        int number1Is = collect.nextInt(), number2Is = collect.nextInt();

        System.out.println("The product of the given 2 number " + (number1Is * number2Is));


        System.out.println("-------Task3-------");


        System.out.println("Please write 3 numbers");
        int num1 = collect.nextInt(), num2 = collect.nextInt(), num3 = collect.nextInt();

        System.out.println("The " + num1 + " multiplied with " + num1 + " is = " + (num1 * num1));
        System.out.println("The " + num2 + " multiplied with " + num2 + " is = " + (num2 * num2));
        System.out.println("The " + num3 + " multiplied with " + num3 + " is = " + (num3 * num3));


        System.out.println("-------Task4-------");

        System.out.println("Please enter 2 numbers");
        int firstNum = collect.nextInt(), secondNum = collect.nextInt();

        System.out.println("The reminder of " + firstNum + " % " + secondNum + " = " + (firstNum % secondNum));


        System.out.println("-------Task5-------");


        System.out.println("Please write 5 numbers");
        int num1A = collect.nextInt(), num2A = collect.nextInt(), numb3A = collect.nextInt(),
                num4A = collect.nextInt(), num5A= collect.nextInt();

        System.out.println("The average of the given 5 numbers is: " + (num1A + num2A + numb3A + num4A + num5A) / 5 );

        System.out.println("-------Task6-------");

        System.out.println("Please enter one number to find the product between 1 and 10");

        int number = collect.nextInt();

        System.out.println(number + " * 1 = " + number * 1);
        System.out.println(number + " * 2 = " + number * 2);
        System.out.println(number + " * 3 = " +  number * 3);
        System.out.println(number + " * 4 = " + number * 4 );
        System.out.println(number + " * 5 = " +  number * 5);
        System.out.println(number + " * 6 = " + number * 6);
        System.out.println(number + " * 7 = " +  number * 7);
        System.out.println(number + " * 8 = " +  number * 8);
        System.out.println(number + " * 9 = " +  number * 9);
        System.out.println(number + " * 10 = " + number * 10);


        System.out.println("-------Task6-------");




        int perimeterAndSquareArea = collect.nextInt();

        System.out.println("perimeter of the square = " + (perimeterAndSquareArea * 4));
        System.out.println("area of the square = " + (perimeterAndSquareArea * perimeterAndSquareArea));
    }
}
