package ifElseStatements.switchStatement;
import java.util.Scanner;
public class StringExample {
  public static void main(String[] args){


    Scanner scan = new Scanner(System.in);
    System.out.println("helle tell me the greeting fot the curent time");
    String greeting = scan.nextLine();



    switch(greeting){
      case "Good morning":
        System.out.println("Then it is morning");
        break;
      case "good afternoon":
        System.out.println("then it is afternoon");
        break;
      case "doog evening":
          System.out.println("then it is evening");
          break;
      default:
        System.out.println("well i need to study more");






    }

  }}
