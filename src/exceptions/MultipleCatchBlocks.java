package src.exceptions;

public class MultipleCatchBlocks {
  public static void main(String[] args) {



    try{
      System.out.println("hallo".charAt(1000));
      System.out.println(3/0);
    }catch (Exception e){
      e.printStackTrace();
    }


    System.out.println("End of the program");

  }
}
