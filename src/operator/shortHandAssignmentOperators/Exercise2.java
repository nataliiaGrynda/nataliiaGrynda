package operator.shortHandAssignmentOperators;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){

        Scanner transaction = new Scanner(System.in);

        System.out.println("Please enter your balance");
        double balance = transaction.nextDouble();


        System.out.println("Enter your first transaction");
        double firstTran = transaction.nextDouble();
        balance -= firstTran;
        System.out.println("Balance after 1st transaction = $" + balance);

        System.out.println("Enter your second transaction");
        double secondTran = transaction.nextDouble();
        balance -= secondTran;
        System.out.println("balance after 2nd transaction $="+ balance);

        System.out.println("Enter your third transaction");
        double thirdTran = transaction.nextDouble();
        balance -= thirdTran;
        System.out.println("Balance after 3rd transaction = $"+ balance);



    }


}
