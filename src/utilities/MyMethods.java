package utilities;
public class MyMethods {

  // WRITE A METHOD TO FIND THE MAX OF 4 INT NUMBERS AND PRINTS IT OUT ONLY.
  public static void printMaxOf4(int n1, int n2, int n3, int n4){
    System.out.println(Math.max(Math.max(Math.max(n1, n2), n3), n4));
  }

  // WRITE A METHOD TO FIND THE MAX OF 4 INT NUMBERS AND RETURNS IT.
  public static int findMaxOf4(int n1, int n2, int n3, int n4){ // --> void is replaced with int to return int value
    return (Math.max(Math.max(Math.max(n1, n2), n3), n4));
  }

  // CREATE A METHOD THAT GENERATES A NUMBER BETWEEN 10 AND 25 (BOTH INCLUDED) AND PRINT IT
  public static void isNumberBetween10And25(int num){
    System.out.println(num >= 10 && num <= 25);
  }

  //
  public static void printHalfAndQuarter(int num){
    if (num <= 50){
      System.out.println(num + " is in 1st half");

      if (num <= 25){System.out.println(num + " is in 1st quarter");}
      else{System.out.println(num + " is in 2nd quarter");}

    }else System.out.println(num + " is in the 2nd half");

    if (num <= 75){
      System.out.println(num + " is in the 3rd quarter");
    }else{
      System.out.println(num + " is in the 4th quarter");
    }



  }





}






