package ifElseStatements.isElseStatements;
import java.util.Scanner;
public class FindTheSmallestOfTwoNmbers {
    public static void main(String[] args){
/*
        Write a program that asks user to enter 2 numbers
        Find the smallest and print it

        EXAMPLE PROGRAM:
        Program: Please enter 2 numbers
        User: 5 7

        Program: 5
*/
//if(num1 < num2) sout(num1)-----second way
//else sout(num2)


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 < num2){
            System.out.println("The smallest number is " + Math.min(num1,num2));



        }else {

        }

    }
}
