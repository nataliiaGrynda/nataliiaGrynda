package src.exceptions;

public class Example02 {
  public static void main(String[] args) {

    int number = 45;
      try {
  System.out.println(number / 3);
  System.out.println(number / 0);//ArithmeticException
  System.out.println("abc".charAt(15));// if we have two exception it will print print only one the first one
} catch (Exception e) {
  e.printStackTrace();
}
    System.out.println("End of the program");













  }
}
