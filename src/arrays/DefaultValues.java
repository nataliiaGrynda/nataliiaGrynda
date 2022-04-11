package arrays;

import java.util.Arrays;

public class DefaultValues {
  public static void main(String[] args) {


    String [] s = new String[5];
    System.out.println(Arrays.toString(s));// nul nul nlu

    int[] ints = new int[5];
    System.out.println(Arrays.toString(ints));

    double[]  doubles = new double[5];
    System.out.println(Arrays.toString(doubles));

    boolean[] booleans = new boolean[5];
    System.out.println(Arrays.toString(booleans));




    char[] chars = new char[5];
    System.out.println(Arrays.toString(chars));

    boolean[] bolliens = {true, false,true};
    System.out.println(Arrays.toString(bolliens));



  }
}
