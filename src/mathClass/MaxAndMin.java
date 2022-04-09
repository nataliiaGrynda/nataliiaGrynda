package mathClass;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args){



        int x = 4, y= 67, z= -54;

        Math.max(x, y);// 67


        System.out.println("max of every number is = " +
                Math.max(Math.max(x, y), z));


      //  int num1 = 4;
       // int num2 = 56;
       // int num3 = 23;

       // Math.max(num1, num2);
       // Math.max(Math.max(num1, num2), num3);
        System.out.println("Max of given 3 numbers = " + Math.max(23, Math.max(4, 56)));


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 4 numbers");
        int num1 = scan.nextInt(), num2 = scan.nextInt(),num3 = scan.nextInt(),num4 = scan.nextInt();

       // int n1= 23;
      //  int n2 = 45;
      //  int n3 = 56;
      //  int n4 = 67;

       // Math.max(num1, num2);
       // Math.max(num3, num4);

        Math.max(Math.max(num1, num2),Math.max(num3, num4));

        System.out.println("The biggest number you entered is = " +
                Math.max(Math.max(num1, num2),Math.max(num3, num4)));



       // Math.min(num1, num2);
      //  Math.min(num3, num4);
        Math.min(Math.min(num1, num2),Math.min(num3, num4));

        System.out.println("Please print the lowest number you entered is = " +
                Math.min(Math.min(num1, num2),Math.min(num3, num4)));






    }
}
