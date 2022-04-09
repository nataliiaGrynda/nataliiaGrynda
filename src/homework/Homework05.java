package homework;

import java.util.Scanner;

public class Homework05 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int num1 = userInput.nextInt(), num2 = userInput.nextInt(), num3 = userInput.nextInt();

        System.out.println(" Max value = " + Math.max(Math.max(num1, num2), num3));
        System.out.println(" Min value = " + Math.min(Math.min(num1, num2), num3));


        System.out.println("------Task2------");

        System.out.println("Please enter 5 numbers");

        int number1 = userInput.nextInt(), number2 = userInput.nextInt(), number3 = userInput.nextInt(),
                number4 = userInput.nextInt(), number5 = userInput.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(Math.max(Math.max(number1, number2), number3), number4), number5));
        System.out.println(" Min value = " + Math.min(Math.min(Math.min(Math.min(number1, number2), number3), number4), number5));

        System.out.println("-------Task3-------");

        System.out.println("Please enter 2 numbers");
        int collectNumber1 = userInput.nextInt(), collectNumber2 = userInput.nextInt();

        System.out.println("The difference between numbers is = " + Math.abs(collectNumber1 - collectNumber2));


        System.out.println("-------Task4-------");
        //random * (end point  - start point +1) + start point --> include
        int random1Between50And100 = (int) (Math.random() * 51) + 50;
        int random2Between50And100 = (int) (Math.random() * 51) + 50;
        int random3Between50And100 = (int) (Math.random() * 51) + 50;

        System.out.println("Number 1 = " + random1Between50And100);
        System.out.println("Number 2 = " + random2Between50And100);
        System.out.println("Number 3 = " + random3Between50And100);
        System.out.println("The sum of numbers is = " + (random1Between50And100 + random2Between50And100 + random3Between50And100));


        System.out.println("-------Task5-------");


        double alex$ = 125 - 25.5;
        double mike$ = 220 + 25.5;

        System.out.println("Alex's money: $" + alex$);
        System.out.println("Mike's money: " + mike$);


        System.out.println("-------Task6-------");

        double toBuyABike = 390;
        double savePerDay = 15.50;
        int daysTookToSave = (int) (toBuyABike / savePerDay);
        System.out.println(daysTookToSave);


    }
}
