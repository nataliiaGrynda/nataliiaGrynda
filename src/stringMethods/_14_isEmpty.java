package stringMethods;

public class _14_isEmpty {
  public static void main(String[] args) {
    /*
    method task: it is used to check if given strieng is empty or not
    it is non static we call it with an object
    it returns boolean, return type
    it does not take any arguments

     */

    String name = "John";
    System.out.println(name.isEmpty());// false

    System.out.println(name.replace(name, "").isEmpty());//true

   // System.out.println("Hello".toLowerCase().replace("Hello, "").isEmpty());



  }
}
