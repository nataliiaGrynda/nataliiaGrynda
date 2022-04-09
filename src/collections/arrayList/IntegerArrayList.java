package collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerArrayList {
  public static void main(String[] args) {


    ArrayList<Integer> numbers = new ArrayList();
    numbers.add(5);
    numbers.add(7);
    numbers.add(10);
    System.out.println(numbers.size());// 3
    System.out.println(numbers);// [5,7,10]

    System.out.println(numbers.get(0));
    System.out.println(numbers.get(1));
    System.out.println(numbers.get(2));


    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }


    for (Integer number : numbers) {
      System.out.println(number);
    }




int countEven = 0;
    for (Integer number : numbers) {
     if(number % 2 == 0) countEven++;


      System.out.println(countEven);
    }




  }
}
