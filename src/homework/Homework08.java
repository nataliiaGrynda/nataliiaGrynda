package homework;
import java.util.Scanner;
public class Homework08 {
  public static void main(String[] args) {

    System.out.println("/n-----Task1-----/n");

    int randomNumber = (int)(Math.random() * 50) +1;
    System.out.println((int)(Math.random() * 50) +1);

    if(randomNumber >= 10 || randomNumber <= 25){
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }

     //randomNumber >= 10 || randomNumber <= 25)? "true" : false);turnary


    System.out.println("/n-----Task2-----/n");

    int ranNum = (int) (Math.random() * 101);
    System.out.println((int) (Math.random() * 101));
    if (ranNum >= 1 && ranNum <= 25) {
      System.out.println("1st quarter");
    } else if (ranNum >= 26 && ranNum <= 50) {
      System.out.println("2nd quarter");
    } else if (ranNum >= 51 && ranNum <= 75) {
      System.out.println("3rd quarter");
    } else if (ranNum >= 76 && ranNum <= 100) {
      System.out.println("4th quarter");
    } else if (ranNum >= 2 && ranNum <= 50) {
      System.out.println(ranNum + " is in the 1st half");
    } else if (ranNum >= 51 && ranNum <= 100) {
      System.out.println(ranNum + " in in the 2nd quarter");
    }


    System.out.println("\n-----Task3-----\n");

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter 5 numbers between 1 and 10");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    int num4 = input.nextInt();
    int num5 = input.nextInt();
if(num1 >= 1 && num1 <=10){
  num1 = (num1 * 5);

}else num1 = 0;

  if(num2 >= 1 && num2 <= 10) {
    num2 = (num2 * 4);
  } else num2 = 0;
  if(num3 >= 1 && num3 <= 10){
   num3 = (num3 * 3);
  }
  else num3 = 0;
  if (num4 >= 1 && num4 <= 10){
    num4 = (num4 * 4);

  }
  else num4 = 0;
  if(num5 >= 1 && num5 <= 10){
    num5 = (num5 * 1);
  }
  else num5 = 0;

    System.out.println(num1 + num2 + num3 + num4 + num5);
  }
}