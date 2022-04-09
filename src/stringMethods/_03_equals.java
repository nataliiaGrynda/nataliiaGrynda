package stringMethods;

public class _03_equals {
  public static void main(String[] args) {
/*
method task :  it compares 2 string together tells if they are equal
it is non static , and we call it with anuther string object
it is a return type -- returns a boolean
note: this comparasment is case sensative
it takes a string as an argument

 */

    System.out.println("Melda".equals("Melda"));
    System.out.println("Melda".equals("melda"));

    String name1 = "John";
    String name2 = "James";
    String name3 = "James";
    System.out.println(name1.equals(name2));
    System.out.println(name2.equals(name3));

    System.out.println();

    String str1 = "Hello";
    String str2 = str1;
    boolean b = !(str1.equals(str2));
    System.out.println(b);


  }
}
