package ifElseStatements;

public class Exercise1 {
    public static void main(String[] args) {

       /* Write a program that is gonna create 3 random numbers
        between 45-90. Print out the all the numbers max, min,
                and the middle.

        56, 78, 63

        output:

        num1= 56
        num2= 78
        num3= 63
        max= 78
        min= 56
        middle= 63
*/


        int num1 = (int) (Math.random() * 46) + 45;   //(90 - 45 + 1);
        int num2 = (int) (Math.random() * 46) + 45;
        int num3 = (int) (Math.random() * 46) + 45;

        int max = Math.max(Math.max(num1, num2), num3);
       // int min = Math.mix(Math.mix(num1, num2), num3);
        int mid = 0;

      //  if (num1 != max && num2 != min) {
          //  if(){




        }


    }

