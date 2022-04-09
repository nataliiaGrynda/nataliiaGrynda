package loops.doWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class AskUser10 {
  public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    //System.out.println("Please enter a number");
    /*int num = input.nextInt();

    while(num < 10){
      System.out.println("the num is not equal");
      System.out.println("please enter a new number");
      num = input.nextInt();
    }
    System.out.println("this number is equal or more then to 10");

*/

    int number;

    do {
      System.out.println("please enter a number");
number = input.nextInt();
//if(number < 10);
      //System.out.println("please enter anuther number");
    }while(number <10);
    System.out.println("the number you entered is more then 10");

/*
 int number;
        int attempt = 1;

        do{
            if(attempt == 1) System.out.println("Please enter a number");
            else{
                System.out.println("This number is not more than or equal to 10");
                System.out.println("Please enter a new number");
            }
            number = input.nextInt();
            attempt++;
        } while(number < 10);

        System.out.println("This number is more than or equal to 10");

 */




  }
}
