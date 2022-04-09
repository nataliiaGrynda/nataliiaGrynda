package collections.arrayList;

import java.util.ArrayList;


public class _01_Practice_Counting_ArrayList_Elements {
  public static void main(String[] args) {

    /*

    create an arrayList that stores below numbers
     */

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(12);
    numbers.add(13);
    numbers.add(8);
    numbers.add(9);
    numbers.add(15);
    System.out.println(numbers);

/*
count how many add numbers you have in the list and print the result
 */
    int count = 0;
    for (int i = 0; i < numbers.size(); i++) {
      if (i % 2 == 1) count++;
    }
    System.out.println("Odds = " + count);



    /*
    create a list called colors athat stores below elements
     */
    ArrayList<String> colors = new ArrayList<>();
    colors.add("Purple");
    colors.add("Yellow");
    colors.add("blue");
    colors.add("red");
    colors.add("Brown");
    colors.add("Black");
    colors.add("White");
    System.out.println(colors);

  /*
  count how many colors in the color list are starting with uppercase
   */


    System.out.println("\n-------TASK-4-for each loop ---------\n");
    int countU = 0;

    for (String color : colors) {
      if(Character.isUpperCase(color.charAt(0))) countU++;
    }

    System.out.println(countU);


    System.out.println("\n-------TASK-4-fori loop ---------\n");
    countU = 0;

    for (int i = 0; i < colors.size(); i++) {
      if(Character.isUpperCase(colors.get(i).charAt(0))) countU++;
    }

    System.out.println(countU);

















  }
}