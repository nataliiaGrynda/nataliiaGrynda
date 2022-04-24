package homework;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Homework17 {


/*
Write a method that takes a String sentence as an
argument a returns the String with the ‘_’ instead
of spaces between words.
NOTE: You must use regex
Example program1:
String str = “   hello  ”;
Program: hello
Example program2:
String str = “java is fun”;
Program: java_is_fun
Example program3:
String str = “   hello nice to meet you   ”;
 */
   public static String changeSpaces(String str){
     return str.trim().replaceAll("[ ]","_");
   }

/*
Write a method that takes a String as an
argument a returns how many vowels are in the
String.
NOTE: You must use regex
Example program1:
String str = “hello”;
Program: 2
Example program2:
String str = “JAVA”;
Program: 2
Example program2:
String str = “”;
Program: 0
 */
   public static int howManyVowel(String str) {
     str = str.replaceAll("[^oieuAOIEU]", "");
     return str.length();

   }
/*
Write a method that takes a String as an argument
and returns a String array with all the words in the
String.
NOTE: Make as dynamic as possible.
NOTE: You must use regex
Example program1:
String str = “hello”;
Program: [hello]
Example program2:
String str = “java  is    fun”;
Program: [java, is, fun]
Example program2:
String str = “Hello, nice to meet you!!”;
Program: [Hello, nice, to, meet, you]
 */

  public static String[] arrayInTheString(String str){
    str.trim().replaceAll("[^!,]", " ");
    String[] s1 = str.split(" ");
    return s1;
  }
  /*
  Task 4
    Write a method that takes a String email as an argument and checks if the
     given email matches the given email requirements.
    This method would return a true or false boolean
    A valid email consists of no spaces, must include one @ symbol.
    Format: <2+chars>@<2+chars>.<2+chars>
    NOTE: Do not use any type of loop. Use Regex

    Example program1:
    String email = "abc@gmail.com";
    Program: true
   */

  public static boolean email(String email){
    return Pattern.matches("[a-zA-Z]{3}@[a-zA-Z]{5}.[a-zA-Z]{3}", email);

  }

  /*
 Write a method that takes a String that contains numbers and letters as an argument.
     This method should separate the numbers and letters into two String arrays and prints them out.
    NOTE: Do not use any type of loop. Use Regex

    Example program1:
    String str = "abc123";
    Program:  Numbers: [a,b,c]
           Letters: [1,2,3]
*/



   public static void containsNumbersAndLetters(String str){
    str = str.replaceAll("[a-zA-Z]", "");
    String[] l1 = str.split(" ");

      str = str.replaceAll("[0-9]", " ");
      String[] d1 = str.split(" ");
    }


  public static void main(String[] args) {

    System.out.println(changeSpaces("java is fun"));
    System.out.println(howManyVowel("JAVA"));
    System.out.println(Arrays.toString(arrayInTheString("Hello, nice to meet you!!")));
    System.out.println(email("abc@gmail.com"));


  }



}
