package scanner;

import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args){

        /*how to use Scanner method
        1 create an object of Scanner(import the class as well)
        class name data type variable name object name = new class name/data tape (if it in need it);
        2 variableName/ object name(imput reader). methodName (if it is needed);

                 */
        /* task1
         ask user to enter their age
        task2 print the question
        task 3 use the proper next method (nextInt)
        task 4 print out the users age.
         */

        Scanner collect = new Scanner(System.in);

        System.out.println("please enter your age");
         int age = collect.nextInt();
        System.out.println("user age is = " +  collect);



        System.out.println("what is your account balance");
        double userAccountBalance = collect.nextDouble();
        System.out.println("\n\t\'userAccountBalance is\' = \"$" + userAccountBalance+"\"");//$"12.56";

        System.out.println("Are you understanding this java class?(true or false)");
        boolean yourAnswer = collect.nextBoolean();
        System.out.println("doYouUnderstandTheClass = \"" + yourAnswer +"\"");
















    }
}
