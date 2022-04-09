package ifElseStatements.ifStatements;
import java.util.Scanner;
public class Between0And100 {
    public static void main(String[] args){
/*
Write a program asks user to put number and checks if the number
is between 0 and 100

if it is true print out "It is in between 0 and 100"

else "it is not in between 0 and 100"
 */
        Scanner input = new Scanner(System.in);

        System.out.println("Please write number and check if the number is between 0 and 100");
        int number = input.nextInt();
        boolean isNumBiggerThan0 = number >=0;
        boolean isNumberSmallerThan10 = number <=100;
        boolean inBetwen0And100 = isNumBiggerThan0 && isNumberSmallerThan10;

        if(inBetwen0And100){
            System.out.println(" it is in beetween 0 and 100");


        }else{

            System.out.println("it is not beetween 0 and 100");
        }


    }



}
