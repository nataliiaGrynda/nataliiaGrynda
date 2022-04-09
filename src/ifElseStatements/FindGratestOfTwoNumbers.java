package ifElseStatements;

public class FindGratestOfTwoNumbers {
    public static void main(String[] args){

        //how to get random number between 0 and 10
        //math. random returnes numbers 0.0 and 1.0
        //012345678910
        //betwen 23 to 37 big - small + 1  ho

        int num1 = (int)(Math.random() * 11);
                int num2 =(int)(Math.random() * 11);

        System.out.println(num1);
        System.out.println(num2);
        if(num1 >= num2){
            System.out.println("The greatest of " + num1 + " and " + num2 + " is + " + num1);



        }
    }
}
