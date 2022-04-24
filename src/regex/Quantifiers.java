package regex;

import java.util.regex.Pattern;

public class Quantifiers {
  public static void main(String[] args) {


    System.out.println(Pattern.matches("[a-z]+", "hello"));
    System.out.println(Pattern.matches("[a-zA-Z ]{3,}","hello class"));


    System.out.println(Pattern.matches("[A-Za-z0-9_-]{8,15}", "TechGlobal" ));

    System.out.println(Pattern.matches("\\([1-9]{3}\\)-[\\d]{3}-[\\d]{4}", "(788)-456-7890"));
    System.out.println(Pattern.matches("\\([0-9]{3}\\)-[\\d]{3}-[\\d]{4}","(806)-551-3112"));
    System.out.println(Pattern.matches("\\([1-9][0-9]{2}\\)-[1-9][0-9]{2}-[\\d]{4}", "(708)-456-7890"));




  }
}
