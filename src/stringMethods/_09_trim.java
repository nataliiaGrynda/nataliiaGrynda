package stringMethods;

public class _09_trim {
  public static void main(String[] args) {
    /*
    method task : remove whitespaces from both ends of a string
    it is non static , we call it with object
    it is return type   and return a string
    it does not tKE ANY AArguments
trim method will not remove any extra space between the words, it only removes extra space before and after end word
     */

    String str = "    Hello   ";
    System.out.println(str);    //   Hello
    System.out.println(str.length());//12
    System.out.println(str.trim());// Hello
    System.out.println(str.trim().length());// 5

    String str2 = "   Good    Morning   ";// it doesnt tuch the middle spase...
    String str3 = str2.trim();
    System.out.println(str3);



  }




}
