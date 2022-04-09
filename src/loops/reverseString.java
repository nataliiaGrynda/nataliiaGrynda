package loops;

import utilities.ScannerHelper;

public class reverseString {
  public static void main(String[] args) {


    /*
Write a program that reads a name from user
Reverse the name and print it back

Test data:
Kaly

Expected output:
ylaK

Test data:
Abraham

Expected output:
maharbA

String str = "rrrgggssshhh";
      String reversed = "";
      for (int ii = str.length() - 1; ii >= 0; ii--) {
        reversed = str.charAt(ii) + "";
        System.out.print(reversed);
 */
    String name1 = "kaly";
    String reversed ="";


    for(int i = name1.length()-1;i >= 0; i--) {
      reversed = name1.charAt(i)+ "";
      System.out.println(reversed);
    }
      String name2 = "maharbA";
      String reversed1 = "";
      for (int ii = name2.length()-1; ii >= 0; ii--){
        reversed1 += name2.charAt(ii);
        System.out.println(reversed1);


     }

String name = ScannerHelper.getANameFromUser();




  }
}
