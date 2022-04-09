package ifElseStatements.ifStatements;
import  java.util.Scanner;
public class RetiredExamples {
    public static void main(String[] args){

        //create an object
        //ask the question about their age
        //retrieve age
        //use if statement and proper action in curly braces

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = userInput.nextInt();
        boolean isAgeMoreThanEqual55 = age >= 55;

        if(isAgeMoreThanEqual55){

            System.out.println("It is your time to get retired ");
        }else{

            System.out.println("You are no gonna retire");
        }











    }
}
