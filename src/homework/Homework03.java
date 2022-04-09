package homework;

public class Homework03 {
    public static void main(String[] args){

      System.out.println( "-----1Task-----");

        int number1 = 5;
        int number2 = 10;
        int sum = number1 + number2;


        System.out.println("The number 1 entered by user = " + number1);
        System.out.println("The number 2 entered by user = " + number2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + sum);


        System.out.println("------2Task-----");

        /*
        pseudo code
        1create or use a scanner to read data from user
        2store data as given in the requirements
        3find division
        4print all as required in the task
*/



       double num1 = 45.45;
        double num2 = 5;

        double division = num1 / num2;

        System.out.println("The num1 entered by user is = "+ num1);
        System.out.println("The num2 entered by user is = "+ num2);
        System.out.println("The division of number 1 and 2 entered by user is = " + division);

        System.out.println("-----3Task-----");


        System.out.println(-10 + (7 * 5));
        System.out.println((72 + 24) % 24);
        System.out.println(10 + ((-3*9) / 9));
        System.out.println(5 + ((18 / 3) * 3) - (6 % 3));




        System.out.println("-----4Task----");

      double number3 = 24;
      double number4 = 10;

      double sum1 = number3 + number4;
      double multiplication = number3 * number4;
      double subtraction = number3 - number4;
      double division1 = number3 / number4;
      double remainder = number3 % number4;

        System.out.println("The sum of the given numbers is = " + sum1);
        System.out.println("The product of the given numbers is = " + multiplication);
        System.out.println("The subtraction of the given numbers is = " + subtraction);
        System.out.println("The division of the given numbers = " + division1);
        System.out.println("The remainder if the given numbers is = " + remainder);


        System.out.println("-----5Task-----");


        double widthOfRectangle = 7.5;
        double heightOfRectangle = 10.5;

        double multiplication1 = widthOfRectangle * 10.5;
        double multiplication2 = heightOfRectangle *2 + widthOfRectangle*2;

        System.out.println("The area of the rectangle = " + multiplication1);
        System.out.println("The perimeter of the rectangle = " + multiplication2);


        System.out.println("-----6Task-----");


        double averageForSoftwareEngineerSalary = 90_000.00;
        double earnIn3Years = averageForSoftwareEngineerSalary * 30;
        System.out.println("A Software Engineer in Test can earn " + earnIn3Years + " in\n 3 years");






    }
}
