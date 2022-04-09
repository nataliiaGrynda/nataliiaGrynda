package scanner;
import java.util.Scanner;

public class ScannerExercises {


    public static void main(String[] args){

        /*pseudo code
        create an object of scanner (import)
        Print out instruction about what we need
        use next() method for reading
        print out the first and the last name in one statement
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = input.next();
        System.out.println("Please enter your last name");
        String lastName = input.next();
        System.out.println("First name and the Last name of the user is = " + firstName + " " + lastName);


        /*create an object
        print out the question
        get the address by the next line() method and store it
        print out the users address

         */



        System.out.println("Please write the full address");
        input.nextLine();
        String yourAddress = input.nextLine();
        System.out.println("User address = " + yourAddress);


    }
}
