package methods;

import utilities.MathHelper;

public class FindGreatestOrSmallestOf3Numbers {
  public static void main(String[] args){


    ///System.out.println(Math.max(5,1, 8));// compiler error

    System.out.println(Math.max(1, 2));

   int max =  MathHelper.maxOfThree(5,1,10);
    System.out.println("max of three numbers = " + max);

    MathHelper.maxOfThree(1.1, 1.2, 1.3);
    System.out.println();



byte b1 = (byte)(Math.random()* 10);
    byte b2 = (byte)(Math.random()* 10);
    byte b3 = (byte)(Math.random()* 10);

    System.out.println(MathHelper.minOfThree(b1, b2,b3));
    System.out.println("Random 1 = " + b1);
    System.out.println("Random 2 = " + b2);
    System.out.println("Random 3 = " + b3);


  }
}
