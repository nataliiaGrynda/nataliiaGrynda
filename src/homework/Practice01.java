package homework;

import utilities.ScannerHelper;


import java.util.Scanner;

public class Practice01 {
  public static void main(String[] args) {


/*
Assume that you are given a String as below;
String str = ”SDLC is step by step procedure to create an application”;
Write a program to find length of given String and the indexes of “SDLC” and “application” words
 */


String str = "SDLC is step-by-step procedure to create an application";

    System.out.println("The length of the string" + str.length());
    System.out.println("The index os sdlc is " + str.indexOf("SDLC"));
    System.out.println("The index of application is = " + str.indexOf("application"));

/*
Assume that you are given a String as below;
String str = “  I know how to code with Python  ”;
•
Write a program to manipulate given String and convert it to be:
“I KNOW HOW TO CODE WITH JAVA”
 */

String str1 = " I know how to code with Python  ";
str1 = str1.trim();
    System.out.println(str1.toUpperCase().replace("PYTHON", "JAVA"));

/*
Assume that you are given a String as below;
String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
1.Find the first character of given String which is not white space
2.Find the last character of given String which is not white space


String str3 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim();
    System.out.println(str3.charAt(0));
    System.out.println(str3.charAt(str3.length()-1));




    String s1 = " TECH ".trim().toLowerCase().replace("t", "T");
    String s2 = " glo  ".trim().replace("g", "G");
    String s3 = " BAL       ".trim().toLowerCase();

    System.out.println(s1 + s2 + s3);
*/
/*
Write a program that asks user to enter their favorite color.
Then, print the first and last characters of the color
Also, print the first and last 3 characters of the color
Test data:
green
Expected output:
1st character is = g
2nd character is = n
First 3 characters are = gre
Last 3 characters are = een
 */
    System.out.println("Please enter your favorite color");

    Scanner input = new Scanner(System.in);
 /*   String color = input.nextLine();
    System.out.println("First char in the color is  = " + color.charAt(0));
    System.out.println("Last char in the color is = " + color.charAt(color.length()-1));
    System.out.println("First 3 char in the is = " + color.substring(0,3));
    System.out.println("Last 3 char in the is = " + color.substring(color.length()-3));

*/
/*
Write a program that asks user to enter a full sentence
Then, convert all sentence to lower case and print the first and last words in the given sentence
Test data:
JavA is an object-oriented programming LanguAGE
Expected output:
1st word is = java
2nd word is = language

    System.out.println("Please enter a full sentence");
String sentence = input.nextLine();
    System.out.println(sentence.toLowerCase());
    System.out.println(sentence.substring(0, sentence.indexOf(' ')).toLowerCase());
    System.out.println(sentence.substring(sentence.lastIndexOf(' ')+1).toLowerCase());
*/
/*
Write a program that asks user to enter a full sentence
Then, check if given sentence contains $ character
If it contains $ character, then find the index of the $ character and print a proper message for the found index
Test data 1:
I saved $100 to buy new airpods
Expected output 1:
This sentence contains $ character
$ character’s index is = 8
Test data 2:
I’ll become a Software Engineer in Test
Expected output 2:
This sentence does not contain $ character
 */
    System.out.println("Please enter a full sentence");
String sentence1 = input.nextLine();

    if(sentence1.contains("$")){
      System.out.println("This sentence contains $ sign " + "\n$ characters index is = " + sentence1.indexOf('$'));
    }
else{
      System.out.println("this sentence does not contain $ sign");
    }
    //System.out.println(s7.contains("$") ?
    //  "This sentence contains $ character" + "\n$ character's index is = " + s7.indexOf('$') :
    //  "This sentence does not contain $ character");


  }
}
