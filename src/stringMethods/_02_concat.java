package stringMethods;

public class _02_concat {
  public static void main(String[] args) {
    /*
    Method task yoused to combine multiple strings and form and new ones
    - it is non static, and we can call it with an object created
    it is return method and returns a string  that is combination of the other
it takes string as an argument
     */


    String s1 = "Tech";// string object
    String s2 = "Global";
    String s3 = s1.concat(s2);// string s3 = s1 +s2; // techGlobal... ---s1 non static , becouse call ed with an object name
    System.out.println(s3.concat(" School"));
    System.out.println("Hello ".concat((" World!")));
    System.out.println("Hello ".concat(" ").concat(("World!")));
    System.out.println("Hello ".concat((" ") + "World!"));


    String str = "rrrgggssshhh";
    String reversed = "";
    for (int i = str.length()-1; i >= 0; i--) {
    reversed = str.charAt(i)+"";
      System.out.print(reversed);

     //(String out, String word)








    }
  }
}
