package arrays;

public class _04_Practice_Partial_Arrays {
  public static void main(String[] args) {

    /*
 Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22
        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
     */


    int [] numbers = {10,-3,-7,0,0,7,22};
   /// int num = 0;
    for (int number : numbers) {


      System.out.println(number);
    }

    /*
  find the sum of all the elements
   */
   int sum = 0;
    for (int number : numbers) {
       sum += number;
    }
    System.out.println(sum);


    System.out.println("____Task3____");
   /*
   find the sum of first 3 elements in the array
    */

  int sum3 = 0;
    for(int i = 0; i <= 2; i++){
      sum3 += numbers[i];
    }
    System.out.println(sum3);


    System.out.println("____Task4_____");
/*
find sum of last 5 elements
 */
    int sum4 = 0;
                //we canput2          we can put 6
  for (int i = numbers.length-5; i <= numbers.length-1; i++){
    sum4 += numbers[i];
  }
    System.out.println(sum4);

    System.out.println("____Task5_____");
/*
Find the product of last 4 elements in the array but exclude zero if there are any
// 10, -3, -7, 0, 0, 7, 22

RESULT:
156

 */
      int sumExclude0 = 1;
       for(int i = 3; i < numbers.length; i++) {
         if (numbers[i] != 0) {
           sumExclude0 *= numbers[i];
         }
       }
         System.out.println(sumExclude0);


    System.out.println("_____Task6_____");

      /*
TASK-6
Check your collection and print true if one of the element is 0
Print false if none of the elements is zero

RESULT:
true

       */
    boolean contains0 = false;

    for (int number : numbers) {
      if (number == 0) {
        contains0 = true;
        break;
      }
    }
        System.out.println(contains0);









    }
  }

