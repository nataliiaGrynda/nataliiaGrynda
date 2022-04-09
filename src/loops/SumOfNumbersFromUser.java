package loops;



import java.util.Scanner;

public class SumOfNumbersFromUser {
  public static void main(String[] args) {


    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter how many numbers");
    //int num = userInput.nextInt();
   // int num1 = userInput.nextInt();
   // int num2 = userInput.nextInt();
/*
    int totalNumber = userInput.nextInt();
int sum = 0;
for(int i = 1; i <= totalNumber; i++){
  System.out.println("Please enter number "  + i);
  sum += userInput.nextInt();
}
    System.out.println(sum);*/



    System.out.println("\n-----while solution-----\n");
    System.out.println("Please enter how many number you want to enter?");
    int times = userInput.nextInt(); // 3

    int count = 1;
    int sum2 = 0;

    while(count <= times){
      System.out.println("Please enter number " + count);
      sum2 += userInput.nextInt();
      count++;
    }

    System.out.println(sum2);
















  }
}
