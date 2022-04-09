package casting;
import java.util.Scanner;
public class ExersiceRecap {
    public static void main(String[] args){

        //write a program that asks user for 5 of their grades and print their avg


        Scanner userInput = new Scanner(System.in);

      /*  System.out.println("Please print your 5 grades");
        String grade1 = userInput.nextLine(),grade2 = userInput.nextLine(),grade3 = userInput.nextLine(),
                grade4 = userInput.nextLine(),grade5 = userInput.nextLine();

double g1D = Double.parseDouble(grade1);
double g2D = Double.parseDouble(grade1);
        double g3D = Double.parseDouble(grade1);
       double g4D = Double.parseDouble(grade1);
        double g5D = Double.parseDouble(grade1);

        System.out.println((g1D + g2D + g3D + g4D + g5D) / 5);


        System.out.println("What is your balance");
String userBalance = userInput.next();


        System.out.println("What is next 3 transactions");
        String firstTran = userInput.next(), secondTran = userInput.next(),
                thirtTran = userInput.next();

         Double userBalanceD = Double.valueOf(userBalance);
         Double firstTran1 = Double.valueOf(firstTran);
                 Double secondTran1 = Double.valueOf(secondTran);
                 Double thirtTran1 = Double.valueOf(thirtTran);

        System.out.println("userBalance = " + (userBalanceD - firstTran1 - secondTran1 - thirtTran1));

       */
        System.out.println("Please enter your full name");
        String fullName = userInput.nextLine();
        System.out.println("Please enter your age");
        String age = userInput.next();
        userInput.nextLine();

        System.out.println("Please enter your phone number");;
        String phoneNumber = userInput.nextLine();
      //  int age1Int = Integer.parseInt(age1),age2Int = Integer.parseInt(age2),age3Int = Integer.parseInt(age3);


      //  int oldestkid = Math.max(age1Int, Math.max( age3Int, age2Int));
     //   int youngestKid = Math.min(age3Int, Math.min(age1Int, age2Int));
      //  int ageDifference = Math.abs(oldestKid - youngestKid);



        System.out.println("Please enter ages of your kids");
String age1 = userInput.next(), age2 = userInput.next(),age3 = userInput.next();

      //  System.out.println("Your name is " + fullName + " phoneNumber " + phoneNumber +
         //    ", \nYou are " + age + " years OLD, yOUR OLDEST KID IS " + oldestkid +  " years old, your" +
       //                 "\nyoungest is " + youngestKid + " diference beetween oldest and youngest is " +
                        // ageDifference + "years");









    }
}
