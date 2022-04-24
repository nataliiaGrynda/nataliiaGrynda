package homework;
import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args){


        String s1 = "5", s2 = "10";
        int int1N = Integer.parseInt(s1);
        int int2N = Integer.parseInt(s2);

        System.out.println("-Sum of " + 5 + " and " + 10 + " is = " + (int1N + int2N));
        System.out.println("-Product of " + 5 + " and " + 10 + " is = " + (int1N * int2N));
        System.out.println("-Division of " + 5 + " and " + 10 + " is = " + (int1N / int2N));
        System.out.println("-Subtraction of " + 5 + " and " + 10 + " is = " + (int1N - int2N));
        System.out.println("-Remainder of " + 5 + " and " + 10 + " is = " + (int1N % int2N));

        System.out.println("------Task2------");

        String s11 = "200", s22 = "-50";
        int s111 = Integer.parseInt(s11);
        int s222 = Integer.parseInt(s22);
        // to find thew average always add the values than divide by how many values you added
        // DIFFERENCE MEANS SUBTRACTION; PRODUCT MEAN MULTIPLY; QUOTIENT MEANS DIVISION
        System.out.println("The greatest value is = " + Math.max(s111, s222));// for max and min value we use comma
        System.out.println("The smallest value is = " + Math.min(s111, s222));
        System.out.println("The average is = " + ((s111 + s222) / 2));
        System.out.println("The absolute difference is = " + Math.abs(s111 - s222));// abs can only hold 1 value, BUT it can also takes expressions (3-5)

        System.out.println("------Task3------");

//3 queters , 1 dime, 2 nikels, 1 penny each day = .75 + .10, + .10 + .1 = .96

        double daysSave24 = 24 / 0.96;
        double daysSave168 = 168 / 0.96;
        int daysSave24Int = (int)daysSave24;
        int daysSave168Int = (int)daysSave168;
        // 1 month = 30 days --> 5 month = 150days
        double month5 = 150 * 0.96;

        System.out.println(daysSave24Int + " days ");
        System.out.println(daysSave168Int + " days ");
        System.out.println("$" + month5);


        System.out.println("------Task4------");

       // double costOfComp = 1_250;
       // double savingsPerDay = 62.50;
        double divideBoth = 1_250 / 62.50;
        int divideBothInt = (int)divideBoth; // pick the object name that i wanted to cast

        System.out.println((int)divideBothInt);


        System.out.println("------Task5------");


       // double priceForTheCar = 14_265;

      //  double carPayment1 = 475.50;
        double divide1 = 14_265 / 475.50;
        int divide1Int = (int)divide1;
      //  double carPayment2 = 951;
        double divide2 = 14_265 / 951;
        int divide2Int = (int)divide2;
        System.out.println("Option 1 will take " + divide1Int + " months");
        System.out.println("Option 2 will take " + divide2Int + " months");



        System.out.println("------Task6------");

        // create an object for the scanner
        //ask user to write 2 numbers and store as int
        //find the result of number1 /  number2 and store this in the double data type
        // them out



        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        double resultWillBe = (double)number1 / (double) number2;
        System.out.println(resultWillBe);









    }
}
