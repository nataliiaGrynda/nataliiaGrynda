package src.exceptions;

public class UnderstandingExceptions {
  public static void main(String[] args) {
/*
unchecked exception the one you get when you run the program. known as runtime exceptions
 */

    String name  = "John";
    //how to handle the exception
    try {
      System.out.println(name.charAt(10));//StringIndexOutOfBoundException
    }catch(Exception e){
      System.out.println("An exception is caught");
    }
    System.out.println("End of the program");


  }
}
