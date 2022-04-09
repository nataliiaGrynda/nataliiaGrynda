package ifElseStatements.isElseStatements;
import java.util.Scanner;
public class MathGrade {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name");


        String fullName = userInput.nextLine();
        System.out.println("Hey" + fullName + "! Please enter your balance");
        System.out.println("What is your balance?");
        double yourBalance = Double.parseDouble(userInput.next());

        if(yourBalance >= 600){

            System.out.println("Awesome. You have enough money ");

        }else{

            System.out.println("Sorry! You are poor!");
        }



    }


}
