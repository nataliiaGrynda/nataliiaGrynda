package stringMethods;
import utilities.ScannerHelper;

public class PracticeStartsWithAndEndsWith {
  public static void main(String[] args) {



    String name = ScannerHelper.getANameFromUser();
    if (name.startsWith("a") || name.startsWith("A")) {
      System.out.println("you are in the club");
    } else {
      System.out.println("you are not in the club a");




    }


   //System.out.println(name.toLowerCase().startsWith("a"))? "you are in the club A": "you are not in the club A";
  }
}