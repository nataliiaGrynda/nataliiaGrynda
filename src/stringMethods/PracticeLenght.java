package stringMethods;


import java.util.Scanner;

public class PracticeLenght {
  public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your favorite book name");
String bookName = input.nextLine();
    System.out.println("please enter your your favorite quote");
String quote = input.nextLine();

    System.out.println(bookName.length());
    System.out.println(quote.length());





  }
}
