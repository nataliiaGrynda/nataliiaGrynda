package ifElseStatements.ifStatements;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class MathGradeExample {

    public static void main(String[] args){
// create an scanner
        //ask questions
        //store the grade
        //if statement with proper action

Scanner inputUser = new Scanner(System.in);

        System.out.println("Hey David! Please enter your math grade?");

        int mathGrade = inputUser.nextInt();

        if(mathGrade >= 60){
            System.out.println("Awesome! You have passed the math class!");

        } else {
            System.out.println(" Go back to school");
        }






    }
}
