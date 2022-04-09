package homework;

import java.util.Arrays;

public class Homework13 {
  public static void main(String[] args) {

    System.out.println("_____Task1_____");


    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 0 && i % 5 == 0) {
        System.out.println("fooBar");
      } else if (i % 5 == 0)
        System.out.println("Bar");
      else if (i % 2 == 0)
        System.out.println("Foo");
      else {
        System.out.println(i);
      }
    }


    System.out.println("_____Task2_____");

    int[] numbers = {0, -4, -7, 0, 5, 10, 45};
    boolean isFirstPositive = false;
    boolean isFirstNegative = false;

    for (int number : numbers) {
      if (number > 0 && !isFirstPositive) {
        isFirstPositive = true;

        System.out.println("First positive number is " + isFirstPositive);
      } else if (!isFirstNegative) ;
      isFirstNegative = true;

      System.out.println("First negative number is " + numbers);
    }
    if (isFirstPositive && isFirstNegative) {

    }


    System.out.println("_____Task3_____");

    int[] num = new int[5];

    int random = (int) Math.random() * 11;
    for (int i = 0; i < num.length; i++) {
      num[i] = random = (int) Math.random() * 11;
      Arrays.sort(num);
    }
    System.out.println(Arrays.toString(num));
    System.out.println(Arrays.binarySearch(num, 2) >= 0);
    System.out.println(Arrays.binarySearch(num, 3) >= 0);


    System.out.println("_____Task4_____");

    String[] list1 = {"banana", "orange", "Apple"};
    String[] list2 = {"pineapple", "banana", "orange"};

    boolean findString = false;
    for (String str : list2) {
      if (str.equalsIgnoreCase("apple")) {
        findString = true;
        break;
      }
    }
    System.out.println(findString);


    System.out.println("_____Task5_____");
    int[] numbers1 = {10, 20, 30, 50, 70,};
    int[] numbers2 = {20, 50, 70, 100, 300};
    boolean dublicate = false;
    for (int i = 0; i < numbers1.length; i++) {
      for (int j = 0; j < numbers2.length; j++) {
        if (numbers1[i] == numbers2[j])
          System.out.println(numbers1[i]);
        break;
      }
    } if (!dublicate)
      System.out.println("There is no matching elements");


    System.out.println("_____Task6_____");

    String str = "banaNa";
    // char[] str1 = str.toCharArray();
    String empty = "";


    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j < str.length(); j++) {// +1 countes babana one by one adding 1 each time it counts
        if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j))
          if (!empty.contains(str.charAt(i) + "")) {
            empty += str.charAt(i);
          }
      }
    }
    System.out.println(empty);
  }
}
