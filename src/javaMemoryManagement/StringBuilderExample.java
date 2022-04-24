package javaMemoryManagement;

public class StringBuilderExample {
  public static void main(String[] args) {


    StringBuilder sb = new StringBuilder("John");// add few move values
    sb.append("athan");
    System.out.println(sb);

    sb.append(123);
    System.out.println(sb);
    sb.insert(2, "$$$");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);


    System.out.println(sb.toString());
  }


public static boolean isPolindrome(String s){
    return s.equals(new StringBuffer(s).reverse().toString());
}

}
