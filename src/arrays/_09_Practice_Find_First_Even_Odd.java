package arrays;

public class _09_Practice_Find_First_Even_Odd {
  public static void main(String[] args) {

    int[] numbers = {0, 5, 3, 2, 4, 7, 10};

/*
First even = 0
First odd = 5
 */

    boolean isFirstEven = false;
    boolean isFirstOdd = false;


    for (int number : numbers) {
      if (number % 2 == 0 && !isFirstEven) {
        isFirstEven = true;

        System.out.println("first even " + number);
      }
      else if(!isFirstOdd){
        isFirstOdd =true;
        System.out.println("firsrt odd " + number);
      }
      if(isFirstEven && isFirstOdd)break;
    }
if(!isFirstOdd) System.out.println("there is no even in this array");
 if(!isFirstEven) System.out.println("there is no odd in this array");
  }
}
