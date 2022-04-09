package operator.incrementAndDdecrementOperators;

public class Exercise1 {

    public static void main(String[] args) {


        int i = 5;
        int age = 10 * i++; //10*5// post increment waits and adds next time we print
        System.out.println(age);//50

        age = 10 * i;   //10*6
        System.out.println(age);//60



        age = 10 * ++i; // adds one number to the existing one vrightavay
    }
}
