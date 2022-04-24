package homework;

import utilities.ScannerHelper;

public class Homework09 {
  public static void main(String[] args) {

    System.out.println("_____Task1_____\n");


    System.out.println("Please enter your name!");
    String name = ScannerHelper.getANameFromUser();
    System.out.println("The length of the name is = " + name.length());
    System.out.println("The first character in the name is = " + name.charAt(0));
    System.out.println("The last character in the name is = " + name.charAt(name.length()-1));
    System.out.println("The first 3 characters in the name are = " + name.substring(0,3));
    System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));
    if (name.startsWith("a") || name.startsWith("A")) {
      System.out.println("You are in the club");
    } else {
      System.out.println("Sorry, you are not in the club");
    }

    System.out.println("_____Task2_____\n");


    System.out.println("Please enter your full address");
    String getAddress = ScannerHelper.getANameFromUser();
    if (getAddress.contains("chicago") || getAddress.contains("Chicago")) {
      System.out.println("Your are in the club");
    } else {
      System.out.println("You are welcome to join the club");
    }


    System.out.println("_____Task3_____\n");
    System.out.println("Please enter your at least 4 favorite colors");
    String colors = ScannerHelper.getANameFromUser();

    if (colors.toLowerCase().contains("green") && colors.toLowerCase().contains("red")) {
      System.out.println("Green and red are in the list");
    } else if (colors.toLowerCase().contains("green")) {
      System.out.println("Green is on the list");
    } else if (colors.toLowerCase().contains("red")) {
      System.out.println("Red is on the list");
    } else {
      System.out.println("The green and red are not in the list");
    }


    System.out.println("_____Task4_____");


    String str = " Java is FUN and else ";
    //             012345678910
    str = str.trim();
    String str1 = str.substring(0, str.indexOf(" "));
    String str2 = str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" "));
    String str3 = str.substring(str.lastIndexOf(" ") + 1);
    System.out.println("The first word in the str is = " + str1.trim().toLowerCase());
    System.out.println("The second word in the str is = " + str2);
    System.out.println("The third word in the str is = " + str3.trim().toLowerCase());





  }
}