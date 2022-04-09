package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args) {
// write a program that generates a random number bt -50 and 50


        int number = (int) (Math.random() * 101) - 50;
//if the cannot be present at the sema time they are linked (use if elseif else)
        System.out.println(number);

        if (number > 0)//positive
        {
            System.out.println("we will win 10 point");
            if (number > 25) {
            } else if (number == 7) {

            }

        } else if (number < 0) {//negative
            if (number < -25) {
            } else if (number == -7) {


            }


        } else {}        //zero

        }

    }

