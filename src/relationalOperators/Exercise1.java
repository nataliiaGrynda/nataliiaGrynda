package relationalOperators;

public class Exercise1 {

    public static void main(String[] arg)
    {


        int x = 10, y = 20, z = 10;

        boolean bi = y < z;// false
        boolean b2 = x <= y;//true
        boolean b3 = x >= z;//true
        boolean b4 = y > x;//true
        boolean b5 = x >= y;//false
         //boolean b6 = ((x >= z)) < y);

        System.out.println(bi);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);


    }
}
