package utilities;

import java.util.Scanner;

public class ScannerHelper {


  public static int getNumberFromUser(){
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.nextLine();
    return number;
  }




  public static String getANameFromUser(){
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    return name;
  }
}
