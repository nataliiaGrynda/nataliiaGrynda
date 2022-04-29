package src.exceptions;

public class Example03_CheckedException {

  public static void main(String[] args) throws InterruptedException {
/*
checked exception immediately require a handling mechanism even before you run the code
they are also known as compile time exemption
 */
    //first way using try catch block
   try{
    for (int i = 0; i < 10; i++) {
      Thread.sleep(2000);
      System.out.println(i);
      }
    }catch(Exception e){
  e.printStackTrace();
     }
//second way is adding exception to the method signature
    for (int i = 0; i < 10; i++) {
      Thread.sleep(2000);
      System.out.println(i);

    }







  }
}
