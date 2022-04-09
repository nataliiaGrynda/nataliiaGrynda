package logicalOperators;

public class LogicalOperators {
    public static void main(String[] args){



        boolean isInteriewQustionsSent = true;
        boolean isJavaHomeworkSent = true;

        // send me InteriewQustionsSentn or JavaHomeworkSent

        System.out.println(" The student is okay: " +
                ( isInteriewQustionsSent || isJavaHomeworkSent));

        // if there is single true for or it is true

        System.out.println( "The student is okay: " +
                (isInteriewQustionsSent && isJavaHomeworkSent));
        //if there is single true for or it is true


        System.out.println("the student did not send the homework" + isInteriewQustionsSent);


    }
}
