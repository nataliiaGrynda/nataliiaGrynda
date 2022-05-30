package homework;

import java.util.Arrays;

public class Homework19 {
  public static void main(String[] args) {
    System.out.println(noDigit(""));
    System.out.println(noVowels("TechGlobal"));
    System.out.println(hasUpperCase("Techlo"));
    System.out.println(middleInt(13, 5, 88));
    System.out.println(no13(new int[]{13, 2, 3}));
  }
//  public static String noDigit(String str){
//    return str.replaceAll("[0-9]", "");
//  }
  public static String noDigit(String str){
      String removed = "";
    for(int i = 0; i < str.length(); i++){
      if(!Character.isDigit(str.charAt(i))) removed += str.charAt(i);
    }
    return removed;
    }
  /*
Requirement:
-Create a method called noVowel()
-This method will take one String argument and it will
return a new String with all vowels removed from the
original String
*/
//   public static String noVowels(String str){
//      return str.replaceAll("[aeuioAEUIO]", "");
//   }
    public static String noVowels(String str){
      String removed = "";
    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'i'
      || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'O'|| str.charAt(i) == 'U' || str.charAt(i) == 'I');
      removed += str.charAt(i);
    }
    return removed;
  }
  /*
     Requirement:
     -Create a method called sumOfDigits()
     -This method will take one String argument and it will return an int sum
     of all digits from the original String.
     NOTE: Return zero if there is no digits in the String
      */

     public static int sumOfDigit(String str){
    int number = 0;
    for(int i = 0; i < str.length();i++){
      if(Character.isDigit(str.charAt(i)))
        number += Integer.parseInt("" + str.charAt(i));
    }
    return number;
     }

     /*
    Requirement:
-Create a method called hasUpperCase()
-This method will take one String argument and it will return boolean
true if there is an uppercase letter and false otherwise.
     */

     public static boolean hasUpperCase(String str){
      boolean ifHasUpperCase = false;
      for(int i = 0; i < str.length(); i++ ){
        if(Character.isUpperCase(str.charAt(i))) ifHasUpperCase = true;{
        }
      }
      return ifHasUpperCase;
  }

  /*
Requirement:
-Create a method called middleInt()
-This method will take three int arguments and it will return the middle
int.
 */
    public static int middleInt(int a, int b, int c) {
      int[] findMiddle = {a, b, c};
      Arrays.sort(findMiddle);
      return findMiddle[1];
    }




  /*
      Requirement:
  -Create a method called no13()
  -This method will take an int array as argument and it will return a new
  array with all 13 replaced with 0.
  NOTE: Assume length will always be more than zero.
  Test Data 1: [1, 2, 3 ,4]
  Expected Result 1: [1, 2, 3 ,4]
  Test Data 2: [13, 2, 3 ]
  Expected Result 2: [0, 2, 3 ]
  Test Data 3:[13, 13, 13 , 13, 13]
  Expected Result 3: [0, 0, 0, 0, 0]
       */

     public static int[] no13(int[] arr){

      for(int i = 0; i < arr.length; i++){
        if(arr[i] == 13) arr[i] = 0;{
        }
      }
      return arr;
     }
/*
Create a method called arrFactorial()
-This method will take an int array as argument and it will return the
array with every number replaced with their factorials.
NOTE: Assume length will always be more than zero.
NOTE: 0! is equals to 1
Test Data 1: [1, 2, 3, 4]
Expected Result 1: [1, 2, 6, 24]
Test Data 2: [0, 2, 4 , 1]
Expected Result 2: [1, 2, 24, 1]
Test Data 3:[5 , 0, 6]
Expected Result 3: [120, 1, 720]
 */

   public static int[] arrFactorial(int[] arr){
     for(int i = 0; i < arr.length;i++){
       if(arr[i] == 0 || arr[i] == 1) arr[i] = 1;
       else{
         int number = arr[i];
         for(int j = 2; j < number; j++){// 2 is the number that will make some change... 1 will not make any change
           arr[i] *= j;
         }

       }
     }
     return arr;
   }
    /*
    Requirement:
-Create a method called categorizeCharacters()
-This method will take String as an argument and return a String array as
letters at index of 0, digits at index of 1 and specials at index of 2.
NOTE: IGNORE SPACES
NOTE: Assume length will always be more than zero.
    */

  public static String[] categorizeCharacters(String str) {
    String letters = "";
    String specials = "";
    String digits = "";
    for (int i = 0; i < str.length(); i++) {
      if (Character.isLetter(str.charAt(i))) letters += str.charAt(i);
      else if (Character.isDigit(str.charAt(i))) digits += str.charAt(i);
      else if (!(Character.isLetterOrDigit(str.charAt(i)) && Character.isWhitespace(str.charAt(i))))
        specials += str.charAt(i);
    }
    String[] arr = new String[3];
    arr[0] = letters;
    arr[1] = digits;
    arr[2] = specials;
    return arr;
  }
/*
public static String[] categorizeCharacters(String str){
    String[] catg = {"", "", ""};

    for (char character : str.toCharArray()) {
        if (Character.isLetter(character)) catg[0] += character + "";
        else if (Character.isDigit(character)) catg[1] += character + "";
        else catg[2] += character + "";
    }

    return catg;
}
 */

}
