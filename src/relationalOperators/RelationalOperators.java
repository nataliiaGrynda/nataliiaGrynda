package relationalOperators;

public class RelationalOperators {
    public static void main(String[] args){



        int a = 4;
        int b = 10;

        boolean isAEqualToB = a == b; // a is not
        boolean isANotEqualToB = a != b;

        System.out.println("a = b : " +isAEqualToB );
        System.out.println("a != b " + isANotEqualToB);


        boolean isAGreaterThenB = a > b;
        boolean isASmallerThenB = a < b;
        boolean isAGreaterOrEqualThanB = a >= b;
        boolean IsASmallerOrEqualThenB =  a <=b;


        System.out.println(" a>b : "+ isAGreaterThenB);
        System.out.println(" a< b : "+ isASmallerThenB);
        System.out.println(" a >=b : "+ isAGreaterOrEqualThanB);
        System.out.println(" a <=b : "+ IsASmallerOrEqualThenB);








    }
}
