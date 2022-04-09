package ifElseStatements.isElseStatements;

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {

       /* Write a program that generates a random number between -10, 10(inclusive)
                and if the number is positive print out "number is POSITIVE!",
        if the number is negative print out "number is NEGATIVE!",
                and if the number is 0 print out "number is ZERO!".


                input:                      input:                  input:
        6                           -5                      0
        output:                     output:                 output:
        number is POSITIVE!         number is NEGATIVE!     number is ZERO!

        //generate a number
        //create is statement for checing 3 different possibility
        //do the proper action for every posibility
*/
        int num = (int)(Math.random() * 21) - 10;   //(10 + 10 +1 );
        System.out.println(num);

        if (num < 0) {// negative
            System.out.println("number is negative");
        }
             else if (num > 0) {//positive
                System.out.println("number is positive");

            } if(num == 0){
                System.out.println("number is 0");



            }



        }


    }

