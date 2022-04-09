package loops.forLoops;

import utilities.MathHelper;

public class PrintEvenNumbers {
  public static void main(String[] args) {



    for(int i = 0; i <=10; i++){
      if(i%2==0)
      System.out.println(i);
      if(MathHelper.isEven(i)) System.out.println(i);
    }

    for(int i = 0; i<= 10; i++){
      System.out.println(i++);

    }





  }
}
