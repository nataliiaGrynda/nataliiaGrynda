package arrays;

import java.util.Arrays;

public class _05_Practice_Searching_In_Array {
  public static void main(String[] args) {

    /*
TASK-1
Check the collection you have above and print true if it contains Mouse
Print false otherwise

     */
    String[] objects = {"Remote","Mouse","Mouse","Keyboard","iPad"};
    boolean findObject = false;
    for (String object : objects) {
      if(object.equals("Mouse")){
        findObject = true;
        break;
      }
    }
    System.out.println(findObject);

    System.out.println("____Task2_____");
/*
TASK-2
Check the collection you have above and print true if one of the element is board
Print false otherwise

RESULT:
false
 */   boolean findBoard = false;
    for (String object : objects) {
      if(object.equals("board")){
        findBoard = true;
        break;
      }
    }
    System.out.println(findBoard);

    System.out.println("\n--------TASK-3---------\n");

        Arrays.sort(objects); // My array is sorted "Keyboard", "Mouse","Mouse", "Remote", "iPad"
                                //                       0         1       2        3       4

        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Apple") >= 0); // false
        System.out.println(Arrays.binarySearch(objects, "Keyboard") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Key") >= 0); // false


    System.out.println("____Task5______");
/*
TASK-4
Create an int array to store below data
{5, -2, 0, -7, 0, 5, 8, 45, 53}

Check if collection has 5
Check if collection has 0
Check if collection has 45
Check if collection has 3
Check if collection has -7
RESULT:
true
true
true
false

 */
    int[] arr = {5,02,0,-7,0,5,8,45,53};

     for(int i = 0; i <= arr.length; i++)
      Arrays.sort(arr);

    System.out.println(Arrays.binarySearch(arr, 5)>= 0);
    System.out.println(Arrays.binarySearch(arr, 0)>= 0);
    System.out.println(Arrays.binarySearch(arr, 45)>=0);
    System.out.println(Arrays.binarySearch(arr, 3)>= 0);
    System.out.println(Arrays.binarySearch(arr, -7)>= 0);
  }
}
