package regex;

public class ReplaceAllMethod {
  public static void main(String[] args) {
    String str = "Hello world";
    System.out.println(str);
    str = str.replaceAll("[aeiouAEIOU]", "\\$");
    System.out.println(str);

//removing digit

    String str2 = "Hello123world";
    str2 = str2.replaceAll("[0-9]","" );
    System.out.println(str2);

String str3 = " abc 123 $#^ ";
    System.out.println(str3.replaceAll("[^a-zA-Z0-9]", ""));




  }
}
