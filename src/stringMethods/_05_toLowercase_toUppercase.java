package stringMethods;

public class _05_toLowercase_toUppercase {
  public static void main(String[] args) {
/*
method task: this methods are used to convert letters of string into upercase or lowercase
-they are non stutic methods that you can call them with objects of string class
they are return type methods, they are retun a modified string object back
they do not take any arguments
 */


    String s1 = "Hello world";
    System.out.println(s1.toLowerCase());// hello world
    System.out.println(s1.toUpperCase());//HELLO WORLD


    System.out.println("cndklshgieuoJIOjiojojOIJI".toLowerCase());



    String sentance = "I paid $100.99 to buy airpods";
    String s2 = sentance.toLowerCase();
    String  s3 = sentance.toUpperCase();

    System.out.println(s3.toLowerCase().toUpperCase());
  }
}
