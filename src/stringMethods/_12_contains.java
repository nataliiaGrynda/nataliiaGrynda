package stringMethods;

import utilities.ScannerHelper;

public class _12_contains {
  public static void main(String[] args) {
    /*
    method task : it is used to find out if a string contains another string or char
    it is non static and we can call it with an object
    it return type it returns boolean
    it take s a string argument

    //////
Ask user to enter an address
If address contains "chicago" in any way, then print "You are in the club"
else, print "You are not in the club"

Chicago, CHICAGO, cHIcaGO
     */

    String s = "Good morning";
    System.out.println(s.contains("Good"));//true
    System.out.println(s.contains("")); //true
    System.out.println(s.contains("123"));//false



    System.out.println("please enter an address");
    String address = ScannerHelper.getANameFromUser();
    if(address.toLowerCase().contains("chicago")){
      System.out.println("You are in the club");
    }
else {
      System.out.println("you are not in the club");
    }

  }
}
