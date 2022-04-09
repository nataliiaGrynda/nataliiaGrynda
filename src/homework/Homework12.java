package homework;

import java.util.Arrays;

public class Homework12 {
  public static void main(String[] args) {


    System.out.println("____Task1____");
    int[] numbers = new int[10];
    numbers[2] = 23;
    numbers[4] = 12;
    numbers[7] = 34;
    numbers[9] = 7;
    numbers[6] = 15;
    numbers[0] = 89;

    System.out.println(numbers[3]);
    System.out.println(numbers[0]);
    System.out.println(numbers[9]);
    System.out.println(Arrays.toString(numbers));

    System.out.println("_____Task2_____");

    String[] str = new String[5];
    str[1] = "abc";
    str[4] = "xyz";
    System.out.println(str[3]);
    System.out.println(str[0]);
    System.out.println(str[4]);
    System.out.println(Arrays.toString(str));

    System.out.println("____Task3____");

    int[] num = {23, -34, -56, 0, 89, 100};
    System.out.println(Arrays.toString(num));
    Arrays.sort(num);
    System.out.println(Arrays.toString(num));

    System.out.println("____Task4____");


    String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
    System.out.println(Arrays.toString(countries));
    Arrays.sort(countries);
    System.out.println(Arrays.toString(countries));

    System.out.println("____Task5____");

    String[] storeCartoon = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
    System.out.println(Arrays.toString(storeCartoon));
    boolean checkCartoon = false;
    for (String s : storeCartoon) {
      if (s.contains("Pluto")) {
        checkCartoon = true;
        break;
      }
    }
    System.out.println(checkCartoon);

    System.out.println("____Task6____");

    String[] cartoons = {"Garfield", "Tom", "Sylvester", "Azrael"};
    Arrays.sort(cartoons);
    System.out.println(Arrays.toString(cartoons));

    boolean checkCartoons = false;
    for (String cartoon : cartoons) {
      if (cartoon.equals("Garfield") && cartoon.equals("Felix")) {
        checkCartoons = true;
        break;
      }
    }
    System.out.println(checkCartoons);


    System.out.println("_____Task7_____");


    double[] storeNumbers = {10.05, 20.75, 70.0, 80.0, 15.75};

    System.out.println(Arrays.toString(storeNumbers));
    System.out.println(storeNumbers[0]);
    System.out.println(storeNumbers[1]);
    System.out.println(storeNumbers[2]);
    System.out.println(storeNumbers[3]);
    System.out.println(storeNumbers[4]);

    System.out.println("_____Task8_____");

    char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
    System.out.println(Arrays.toString(characters));
    int letters = 0, upperLetter = 0, lowerLetter = 0, digit = 0, sChar = 0;

    for (char character : characters) {
      if (Character.isLetter(character)) {
        letters++;
      }
      if (Character.isLowerCase(character)) {
        lowerLetter++;
      } else if (Character.isUpperCase(character)) {
        upperLetter++;

      } else if (Character.isDigit(character)) {
        digit++;
      } else sChar++;
    }
    System.out.println("Letters = " + letters);
    System.out.println("Uppercase letters = " + upperLetter);
    System.out.println("Lowercase letters = " + lowerLetter);
    System.out.println("Digits = " + digit);
    System.out.println("Special characters = " + sChar);

    System.out.println("____Task9_____");

    String[] str1 = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
    System.out.println(Arrays.toString(str1));
    int uppercase = 0, lowercase = 0, startWithBOrP = 0, elementsInclude = 0;
    for (String strTask10 : str1) {

      if (Character.isLowerCase(strTask10.charAt(0))) {
        lowercase++;

      } else if (Character.isUpperCase(strTask10.charAt(0))) {
        uppercase++;

      }
      if (strTask10.startsWith("b") || strTask10.startsWith("B") || strTask10.startsWith("p") ||
        strTask10.startsWith("P")) {
        startWithBOrP++;

      } else if (strTask10.contains("book") || strTask10.contains("pen")) {
        elementsInclude++;
      }

    }
    System.out.println("Elements starts with uppercase = " + uppercase);
    System.out.println("Elements starts with lowercase = " + lowercase);
    System.out.println("Elements starting with B or P = " + startWithBOrP);
    System.out.println("Elements having \"book\" or \"pen\" = " + elementsInclude);

    System.out.println("_____Task10____");


    int moreThen10 = 0, lessThen10 = 0, equalTo10 = 0;
    int[] numTask10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
    System.out.println(Arrays.toString(numTask10));
    for (int element : numTask10) {
      if (element > 10) {
        moreThen10++;

      } else if (element < 10) {
        lessThen10++;

      } else equalTo10++;
    }
    System.out.println("Elements that are more than 10 = " + moreThen10);
    System.out.println("Elements that are less than 10 = " + lessThen10);
    System.out.println("Elements that are 10 = " + equalTo10);


    System.out.println("____Task11_____");

    int[] arr1 = {5, 8, 13, 1, 2};
    int[] arr2 = {9, 3, 67, 1, 0};
    int[] findMax = new int[5];
    System.out.println("1st array is = " + Arrays.toString(arr1));
    System.out.println("2nd array is = " + Arrays.toString(arr2));

    for (int i = 0; i < findMax.length; i++) {
      findMax[i] = Math.max(arr1[i], arr2[i]);
    }
      System.out.println("3rd array is = " + Arrays.toString(findMax));



  }


    }

