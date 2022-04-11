package arrays;

import java.util.Arrays;

public class FruitsCollections {
  public static void main(String[] args) {


    String[]  nameFruit = new String[4];
    System.out.println(Arrays.toString(nameFruit));


    String[] fruits = new String[4];
    fruits[0] = "apples";
     fruits[3] = "bananas";
    System.out.println(Arrays.toString(fruits));

    System.out.println(fruits.length);

    System.out.println(fruits[0] + " " + fruits[3]);

    System.out.println(fruits[0].toUpperCase());//apples
    System.out.println(fruits.length);//6
    System.out.println(fruits[0].charAt(0));//A
    System.out.println(fruits[3].startsWith("B"));//TRUE




  }
}
