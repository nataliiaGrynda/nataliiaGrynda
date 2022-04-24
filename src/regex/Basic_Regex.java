package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
  public static void main(String[] args) {


    Pattern pattern = Pattern.compile("o");
    Matcher matcher = pattern.matcher("i love techGlobal");

    System.out.println(matcher.matches());// checks if given string matches the given pattern

    while(matcher.find()){//find the next matched pattern in the given string
      System.out.println(matcher.group());//print out the next pattern in the given string
      System.out.println("start index: " + matcher.start());// returns int ..> prints out where found pattern starts
      System.out.println("end index: " + matcher.end());// returns int ..> prints out where found pattern ends

    }



    System.out.println(Pattern.matches("[xyz]", "xyz"));
    System.out.println(Pattern.matches("[xyz]", "xxxx"));
    System.out.println(Pattern.matches("[xyz]", "x"));
    System.out.println(Pattern.matches("[^xyz]", "y"));





  }
}
