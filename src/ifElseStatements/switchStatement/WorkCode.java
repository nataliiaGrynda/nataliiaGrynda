package ifElseStatements.switchStatement;

import java.util.Scanner;

public class WorkCode {

    public static void main(String[] args){

        /*write a program that asks user whta day it is
        based on the answer print what collor will be selected
       1 monday ---blk
        2tuesday---red
        3wednesday ----purple
        4thuers ---yellow
        5friday ---orange
         */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the day");
        int day1 = input.nextInt();

/*
        if (day1 ==1){
            System.out.println("blue");
        }else if(day1 == 2){
            System.out.println("red");
        }else if(day1 == 3){
            System.out.println("purple");
        }else if (day1 == 4){
            System.out.println("yeelow");
        }else if (day1 == 5){
            System.out.println("orange");
        }
        System.out.println("End of program");
        */

        switch (day1){
            case 1:
                System.out.println("blue");
                break;
                case 2:
                System.out.println("red");
                break;
            case 3 :
                System.out.println("purple");
                break;
            case 4:
                System.out.println("yellow");
                break;
            case 5:
                System.out.println("orange");
                break;
            case 6:
            case 7:
                System.out.println("it the weekend");
                break;
            default:
                System.out.println("this is not representing any day");





        }






    }
}
