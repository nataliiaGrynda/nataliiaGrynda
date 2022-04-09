package stringMethods;

public class _11_startsWith_endWith {
  public static void main(String[] args) {

    /*
    method task: they are used to find out if the string starts with or ends with anuther letter or string
    they are non stutic as we call them with objects
    return boolean true or false
    they take one string as a argument

     */

    String str = "Today is Sunday";
    System.out.println(str.startsWith("Today"));// true
    System.out.println(str.startsWith("today"));//false
    System.out.println(str.startsWith("day"));//true
    System.out.println(str.toUpperCase().endsWith("SUNDAY"));//TRUE





  }
}
