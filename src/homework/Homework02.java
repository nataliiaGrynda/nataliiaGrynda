package homework;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args){


        Scanner privateInfoInput = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = privateInfoInput.next();

        System.out.println("Enter your last name");
        String lastName = privateInfoInput.next();

        System.out.println("Enter your age");
        int age = privateInfoInput.nextInt();

        System.out.println("Enter your email address");
        String emailAddress = privateInfoInput.next();

        System.out.println("Enter your phone number");
        privateInfoInput.nextLine();
        String phoneNumber = privateInfoInput.nextLine();

        System.out.println("Enter your address");
        String address = privateInfoInput.next();

        System.out.println("the first name user enters = " + firstName);
        System.out.println("the last name user enters = " + lastName);
        System.out.println("the age the user enters = " + age);
        System.out.println("the email address the user enters = " + emailAddress);
        System.out.println("the phone number the user enters = " + phoneNumber);
        System.out.println("the address the user enters = " + address);


        System.out.println("What is your favorite book");
        privateInfoInput.nextLine();
        String favBook = privateInfoInput.next();

        System.out.println("What is your favorite color");
        String favColor = privateInfoInput.next();

        System.out.println("What is your favorite number");
        int favNumber = privateInfoInput.nextInt();


        System.out.println("Users favorite book = " + favBook);
        System.out.println("Users favorite color = " + favColor);
        System.out.println("Users favorite number = " + favNumber);






    }
}
