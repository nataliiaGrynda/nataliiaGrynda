package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args){

        /*
        1 I am going to use a scanner class for creating my objects
        2 I will use the object for reading the data
         */

        Scanner scanner = new Scanner(System.in); // creating a scanner object for using the method next

        System.out.println("Please put your first name"); // this is what i want user to put
        String firstName = scanner.next(); //salih storing the first name from user

        System.out.println("Please put your last name:");// SaCOND MeSSaGE FROM USER
        String  lastName = scanner.next();

        System.out.println("The name user put = " + firstName); // printing my object / variable
        System.out.println("Last name = " + lastName);
    }
}
