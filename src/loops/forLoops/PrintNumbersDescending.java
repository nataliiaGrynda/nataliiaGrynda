package loops.forLoops;

public class PrintNumbersDescending {
  public static void main(String[] args) {


    for (int i = 100; i >= 0; i--) {
      System.out.println(i);

    }
      String str = "rrrgggssshhh";
      String reversed = "";
      for (int ii = str.length() - 1; ii >= 0; ii--) {
        reversed = str.charAt(ii) + "";
        System.out.print(reversed);




    }
  }
}