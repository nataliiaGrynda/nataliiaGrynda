package arrays;

import java.util.Arrays;

public class _01_Practice_Char_Array {
  public static void main(String[] args) {

    /*
CREATE A CHAR ARRAY AND STORE VALUE AND PRINT
     */

    char[] charValues = {'#', '$', '5', 'A', 'b', 'H'};

      System.out.println(Arrays.toString(charValues));

    /*PRINT THE SIZE OF THE ARRAY
    */
    System.out.println("The size of the array is = " + charValues.length);


/*
print each element element using for i loop
 */
    for(int i = 0; i < charValues.length; i++){
      System.out.println(charValues[i]);
    }
    /*
    print each element using for each loop
     */

    for(char element: charValues){
      System.out.println(element);
    }

    /*
    print each element that are letters
     */

    for(int i = 0; i < charValues.length; i++){
      if(Character.isLetter(charValues[i]) ) {

        System.out.println(charValues[i]);
      }
    }

/*
count how many uppercase character we have
 */
  int count = 0;
    for(int i = 0; i < charValues.length; i++) {
      if (Character.isUpperCase(charValues[i]))
        count++;
    } System.out.println(count);



    int countUpper = 0;
    for(char element: charValues){
      if(Character.isUpperCase(element)) countUpper++;

      }
      System.out.println(countUpper);
    }



  }

