package operator.shortHandAssignmentOperators;

public class Exercise1 {
    public static void main(String[] args){
/*
1create varible
2use short and assignment
print them our
 */

        int a= 8;
        int b= 3;

        System.out.println("a += b -> " + (a += b));//a=11
        System.out.println("a -= b -> " + (a -= b));  // a=8
        System.out.println("a *= b -> " + (a *= b));// a= 24
        System.out.println("a /= b -> " + (a /= b));// a= 8
        System.out.println("a %= b -> " + (a %= b));// a=2


        a += b;// 11




    }
}
