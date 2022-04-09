package projects;

import org.omg.CORBA.WStringSeqHelper;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        System.out.println("-------Task1------");


        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        int number1 = userInput.nextInt(), number2 = userInput.nextInt(), number3 = userInput.nextInt();
        System.out.println("The product of the numbers entered is = " + (number1) * (number2) * (number3));


        System.out.println("--------Task2-------");


        System.out.println("What is your first name?");
        String firstName = userInput.nextLine();
        System.out.println("What is your last name?");
        String lastName = userInput.nextLine();
        System.out.println("what is your year of birth?");
        int yearOfBirth = userInput.nextInt();
        int currentYear = userInput.nextInt();
        userInput.nextLine();
        System.out.println(firstName + " " + lastName + "'s age is = " + (currentYear - yearOfBirth));


        System.out.println("------Task3------");


        System.out.println("What is your full name?");
        String fullName = userInput.nextLine();
        System.out.println("What is your weight?");
        double yourWeight = userInput.nextDouble();
        userInput.nextLine();
        System.out.println(fullName + yourWeight);


        System.out.println("------Task4-----");


        System.out.println("What is your full name?");
        String fullNameStudentOne = userInput.nextLine();
        System.out.println("What is your age?");
        int ageStudentOne = userInput.nextInt();
        userInput.nextLine();
        System.out.println("What is your full name?");
        String fullNameStudentTwo = userInput.nextLine();
        System.out.println("What is your age?");
        int ageStudentTwo = userInput.nextInt();
        userInput.nextLine();
        System.out.println("What is your full name?");
        String fullNameStudentThree = userInput.nextLine();
        System.out.println("What is your age");
        int ageStudentThree = userInput.nextInt();

        System.out.println(fullNameStudentOne + "'s age is " + ageStudentOne);
        System.out.println(fullNameStudentTwo + "'s age is " + ageStudentTwo);
        System.out.println(fullNameStudentThree + "'s age is " + ageStudentThree);

        int average = (ageStudentOne + ageStudentTwo + ageStudentThree) / 3;
        System.out.println("The average age is " + average + ".");

        int eldest = Math.max(ageStudentOne, Math.max(ageStudentTwo, ageStudentThree));
        System.out.println("The eldest age is " + eldest + ".");
        int youngest = Math.min(ageStudentOne, Math.min(ageStudentTwo, ageStudentThree));
        System.out.println("The youngest age is " + youngest + ".");


    }
}
