package stringMethods;
import java.util.Scanner;
public class PracticeComparison {
  public static void main(String[] args) {

Scanner input = new Scanner(System.in);
    System.out.println("please enter 1 string");
    String s1 = input.nextLine();

    System.out.println("Please enter anuther string");
    String s2 = input.nextLine();
if(s1.equals(s2)){
  System.out.println("These strings are equal");
}
   else System.out.println("these strings are not equal");



  }
}
