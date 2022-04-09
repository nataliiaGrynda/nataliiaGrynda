package loops.forLoops;

import utilities.ScannerHelper;

public class PrintAddNumbersUsingScanner {
  public static void main(String[] args) {




    System.out.println("Please enter a number");
    int givenNumber = ScannerHelper.getNumberFromUser();

    for(int i = 0; i <= givenNumber; i++){
     if(i % 2 == 1) System.out.println(i);
    }



  }
}
