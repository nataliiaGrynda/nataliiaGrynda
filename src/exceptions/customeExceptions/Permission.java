package src.exceptions.customeExceptions;

import java.util.Scanner;

public class Permission {
  /*
    create a method that checks the age of the user, takes an argument int age
    if age if moe then 16 "it is allowed to have driver license"
    if the age if less then 16 the method will throw an exception
    age og {age} is not allowed to have driver license
     */

     public static void checkAge(int age){
       if(age >= 16) System.out.println("it is allowed to have driver license");
       else throw new RuntimeException("age of " + age + " is not allowed to have driver license");
     }

    /*
        create a method that , takes an int as an argument to state the day if the week
        1- sunday
        2 - monday
        7- saturday
        method name = check in
        if it is weekday user is allowed to check in from 10 am to 5 pm
        if it is a weekend user is allowed to check in 10 am to 3 pm
        if the input is not in the range of 1-7 then throw an exertion with massage
        "the input does not represent the day"
 */
     public static void checkIn(int day){
  if(day == 1 || day ==7) System.out.println("user is allowed to check in 10 am to 3 pm");
else if(day < 1|| day > 7) throw new RuntimeException("the input does not represent the day");
else System.out.println("user is allowed to check in from 10 am to 5 pm");
     }
/*
switch statement
   switch(day){
    case 1:
    case 2:
      System.out.println("eser is allowed to check in 10 am to 3 pm");
    case 3:
    case 4:
      case5:
      case6:
      System.out.println("user is allowed to check in 10am to 5 pm");
      break;
    default:
      throw new RuntimeException("the input does not represent any day");
  }
*/

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Hey user please enter your name");
    int age = scan.nextInt();

try {
  checkAge(age);
}catch(Exception e){
  e.printStackTrace();
}finally {
  System.out.println("Your age is = " + age);
}
    System.out.println("End of the program");
    System.out.println("\n___________\n");
   checkIn(6);


  }


}
