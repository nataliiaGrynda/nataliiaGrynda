package src.exceptions;

public class Example01 {
  public static void main(String[] args) {

/*
handle the exception below and report with the nice massage
 */
    String[] names = {"Alex", "John", "Max"};
        try {
         System.out.println(names[1]);
          }catch(Exception e) {
         e.printStackTrace();
        }
    System.out.println("The end of the program");






   }
}
