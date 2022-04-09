package errays;

import java.util.Arrays;

public class _6_Additional_Inteview_Questions {
  public static void main(String[] args) {


    /*
    find the greatest
     */
    int[] numbers = {5,3,0,-5};
    Arrays.sort(numbers);
    System.out.println(numbers[numbers.length-1]);

      int max = numbers[0];
       for(int number: numbers){
        max = Math.max(max,number);
}

    System.out.println(max);

    System.out.println("____tASK2_____");
       /*
       create a double array and store below element
        */

    double[] arr = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};
    double sortMin = arr[0];
    for (double v : arr) {
      sortMin = Math.min(sortMin,v);
    }
    System.out.println(sortMin);

    System.out.println("_Task3_");
    /*
      use above array and find second minimum value
       */
  double minValue = 0;
    for (double v : arr) {
      if(v != minValue && v < minValue)minValue = v;

    }
    System.out.println(minValue);




  }
}
