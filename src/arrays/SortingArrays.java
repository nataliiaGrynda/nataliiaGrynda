package arrays;


import java.util.Arrays;

public class SortingArrays {
  public static void main(String[] args) {



  /*
  how to sort an array of numbers
  byte short int ling float double
  we will sort these in ascending order
  descending : highets to lowest
   */

    int[] numbers = {10, -5, 0, 0, 3, 0, 7, 9};
// sort numbers in ascending order [-5,0,0,0,3,7,9,10]
    System.out.println("my array is = " + Arrays.toString(numbers));
    Arrays.sort(numbers);
    System.out.println("My array sorted = " + Arrays.toString(numbers));



    char[] character = {'A', 'b', 'z', 'H'};
    System.out.println("My charcter array = " + Arrays.toString(character));

    Arrays.sort(character);
    System.out.println("My character array sorted = " + Arrays.toString(character));


    System.out.println("____sorting words1_____");
     String[] names = {"Adam", "Adame", "Alex", "tom", "ally", "Adele", "terry", "Josh"};// lexicographically
    System.out.println("my name array + " + Arrays.toString(names));
    for (int i = 0; i <= names.length-1; i++){
      names[i] = names[i].toLowerCase().charAt(0) + names[i].toLowerCase().substring(1);
    }
    Arrays.sort(names);
    System.out.println("My namer array = " + Arrays.toString(names));



  }
}
