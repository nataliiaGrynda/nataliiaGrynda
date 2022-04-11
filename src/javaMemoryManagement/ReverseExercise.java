package javaMemoryManagement;

public class ReverseExercise {


    /*
    write a method that takes takes a string and reverses it
     */


  public static String reverse(String s) {
    StringBuilder r = new StringBuilder();
    for (int i = s.length()-1; i >= 0; i--) {
      r.append(s.charAt(i));
    }
    return r.toString();
  }


  public static String reversed2(String str){
    return  new StringBuilder(str).reverse() .toString();
    //StringBuilder sb = new StringBuilder(str);
   // sb.reverse();

 // return sb.toString();
  }

  /*
   create a method thet takes a string and checks if it is a polindrome
   */
  public static boolean isPalindrome(String s){
    return s.equals(new StringBuilder(s).reverse() .toString());
  }



  public static void main(String[] args) {
    System.out.println(reverse("Hello"));


    System.out.println("Civic");
    System.out.println("John");

    System.out.println(isPalindrome("madam"));//true
    System.out.println(isPalindrome("Madam"));// false
  }

}
