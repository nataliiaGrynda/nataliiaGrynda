package src.exceptions;


import java.util.ArrayList;

public class FinallyBlock {
  public static void main(String[] args) {


  try {
    ArrayList<String> objects = new ArrayList<>();
    objects.add("Computer");
    objects.add("Mouse");
    objects.add("MousePad");

    for (String object : objects) {
      objects.remove(object);
    }
    }catch(Exception e){

  }finally{//it will not catch the exemption, it will run the block of code even though there an Exception or not
    System.out.println("Here is the report, we report the exception here");
  }
    System.out.println("The end of the program");






}
}
