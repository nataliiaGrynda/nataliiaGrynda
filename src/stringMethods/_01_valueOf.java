package stringMethods;

public class _01_valueOf {
  public static void main(String[] args) {
/*
method task convert given variable to a string
it is static  -- you can call it with class name
it is a return type ---- string
it takes differ argumnts as it is overload method and coverts given args to a string
 */

    int i = 5;
    String num = String.valueOf(i);

    System.out.println(i + i);// 10

    System.out.println(num + num);//55

  }
}
