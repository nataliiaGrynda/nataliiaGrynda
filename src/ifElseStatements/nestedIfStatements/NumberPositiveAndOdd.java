package ifElseStatements.nestedIfStatements;

public class NumberPositiveAndOdd {

    public static void main(String[] args){



        int n = (int)(Math.random()* 101) -50;
        System.out.println(n);
        if(n > 0){// checking the number if positive only

            System.out.println("number is positive");
if(n % 2 != 0){// checking the number is odd or not
    System.out.println("number is positive and odd");


}
        }
        else{
            System.out.println("number is positive and even");

        }


    }
}
