package errays;

import java.util.Arrays;

public class _03_Practice_Int_Array {
  public static void main(String[] args) {

    /*
    TASK-1
Create an int array and store below data

-3
-7
0
2
0
7
7
10
2
15

Print the array with message "Array not sorted = "
Print the sorted array with message "Array sorted = "


    int[] numbers = {-3, 07, 0, 2, 0, 7, 7, 10, 2, 15};
    System.out.println("Array not sorted = " + Arrays.toString(numbers));

    Arrays.sort(numbers);
    System.out.println("Array is sorted = " + Arrays.toString(numbers));


count how many positive negative and zero numbers you have
 int positives = 0, negatives = 0, zeros = 0;

        for (int number : numbers) {
            if(number > 0) positives++;
            else if(number < 0) negatives++;
            else zeros++;
        }

        System.out.println("Positives = " + positives);
        System.out.println("Negatives = " + negatives);
        System.out.println("Zeros = " + zeros);

        System.out.println("\n-------TASK-2 - another approach-------\n");
        int pos = 0, neg = 0;

        for (int number : numbers) {
            if(number > 0) pos++;
            else if(number < 0) neg++;
        }

        System.out.println("Positives = " + pos);
        System.out.println("Negatives = " + neg);
        System.out.println("Zeros = " + (numbers.length - pos - neg));



    System.out.println("_____Task2_____");


    count how many even and odds
     int numEven=0; int numOdd= 0;
     for(int i = 0; i < numbers.length; i++) {
       if (i % 2 == 0) numEven++;

       else numOdd++;

     }System.out.println("Odds = " + numOdd);
    System.out.println("EVEN = " + numEven);
*/

  }}