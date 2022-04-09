package scanner;
import java.util.Scanner;

public class LearningScannerMultipleLines {
    public static void main(String[] args){

        // dataType variableName =data/value
        //dataType/ClassName variableName = new dataType/ClassName(if it is needed)
        // creating an object

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Where is your address?");
        String userAddress = inputReader.nextLine(); // variableName. methodName();

        System.out.println(" User address is = ".concat("\"" + userAddress) + "\"");
    }
}
