package projects;

public class Project03 {
  public static void main(String[] args) {
    System.out.println("_____Task1____");
/*
   String s1 = "24";
   String s2 = "5";

   int s1IntValue = Integer.parseInt(s1), s2IntValue = Integer.parseInt(s2);
    System.out.println("The sum of " + s1IntValue + " and " + s2IntValue + " = " + (s1IntValue + s2IntValue));
    System.out.println("The subtraction of " + s1IntValue + " and " + s2IntValue + " = " + (s1IntValue - s2IntValue));
    System.out.println("The division of " + s1IntValue + " and " + s2IntValue + " = " + (double)(s1IntValue / (double)s2IntValue));
    System.out.println("The multiplication of " + s1IntValue + " and " + s2IntValue + " = " + (s1IntValue * s2IntValue));
    System.out.println("The remainder of " + s1IntValue + " and " + s2IntValue + " = " + (s1IntValue % s2IntValue));


    System.out.println("_____task2_____");


int randomNumber = (int)(Math.random() * 36);
    System.out.println("Random number = " + randomNumber);
    if(randomNumber == 2 && randomNumber == 3 && randomNumber == 5 && randomNumber == 7 & randomNumber == 11
    && randomNumber == 13 && randomNumber == 17 && randomNumber == 19 && randomNumber == 23 &&
    randomNumber == 29 && randomNumber == 31){
      System.out.println("THE NUMBER IS A PRIME NUMBER " + randomNumber);
    }
    else{
      System.out.println("THE NUMBER IS NOT A PRIME NUMBER " + randomNumber);
    }

    System.out.println("____Task3____");

int num1 = (int)(Math.random() * 51);
int num2 = (int)(Math.random() * 51);
int num3 = (int)(Math.random() * 51);
int max = Math.max(Math.max(num1, num2), num3);
int min = Math.min(Math.min(num1, num2), num3);

  System.out.println("Lowest number is = " + min);

  if(num1 != max && num1 != min){
    System.out.println("Middle number is = " + num1);
  }
  else if(num2 != max && num2 != min){
    System.out.println("Middle number is = " + num2);
  }
  else{
    System.out.println("Middle number is = " + num3);
  }

  System.out.println("Greatest number is " + max);


    System.out.println("______Task4______");


    char cLetter = '5';
char cLetter1 = 'a';
char cLetter2 = 'R';
    if((cLetter >= 65 && cLetter <=90) || (cLetter >= 97 && cLetter <= 122)){

    }
    else{
      System.out.println("Invalid character detected!!!");
    }

       if ((cLetter1 >= 65 && cLetter1 <= 90) || (cLetter1 >= 97 && cLetter1 <= 122)) {

        System.out.println("This letter is lowercase");
      } else {
        System.out.println("This letter is uppercase");
      }
if((cLetter2 >=65 && cLetter2 <= 90) || (cLetter2 >= 97 && cLetter2 <= 122)){
  System.out.println("The letter is uppercase");
}else{
  System.out.println("The letter is lowercase");
}

    System.out.println("_____Task5_____");

char task_c5 = '#';
    char c = 'E';
char task_c2 = 'R';
if(task_c5 >+ 65 && task_c5 <= 90 || task_c5 >= 97 && task_c5 <= 122){
  System.out.println();
}
else{
  System.out.println("Invalid character detected !!!");
}
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' || c == 'A' || c == 'E' || c == 'I' ||
      c == 'O' || c == 'U' || c == 'Y') {
      System.out.println("The letter is vowel");
    } else if (c == 'B' || c == 'C' || c == 'D' || c == 'F' || c == 'G' || c == 'H' || c == 'J' || c == 'K' || c == 'L' || c == 'M'
      || c == 'N' || c == 'P' || c == 'Q' || c == 'R' || c == 'S' || c == 'T' || c == 'V' || c == 'W' || c == 'X' || c == 'Z' ||
      c == 'b' || c == 'c' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'g' || c == 'k' || c == 'l' || c == 'm' || c == 'n' ||
      c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't' || c == 'v' || c == 'w' || c == 'x' || c == 'z') {
      System.out.println("The letter is consonant");
    }
    if(task_c2 >= 66 && task_c2 <= 68 || task_c2 >=70 && task_c2 <= 72 || task_c2 >= 74 && task_c2 <= 78 || task_c2 >= 80
      && task_c2 <=84 || task_c2 >=86 && task_c2 <= 88 || task_c2 == 90 || task_c2 >= 98 && task_c2 <=100 || task_c2 >=102 &&
    task_c2 <= 104 || task_c2 >=106 && task_c2 <= 110 || task_c2 >= 112 && task_c2 <= 116 || task_c2 >= 118 && task_c2 <= 120 ||
    task_c2 ==122){
      System.out.println("The letter is consonant");
    }
    System.out.println();


    System.out.println("_____Task5_____");







   char ifCharIsSpecialChar = '8';
char ifCharIsSpecialChar1 = '*';

   if(ifCharIsSpecialChar >= 33 && ifCharIsSpecialChar <= 47 || ifCharIsSpecialChar >= 58 && ifCharIsSpecialChar <= 64
     || ifCharIsSpecialChar >= 91 && ifCharIsSpecialChar <= 96 || ifCharIsSpecialChar >=123 && ifCharIsSpecialChar <=126){
     System.out.println("Invalid character detected !!!");
   }
 if(ifCharIsSpecialChar >= 48 && ifCharIsSpecialChar <= 57 ){

   }
   else {
   }
if(ifCharIsSpecialChar1 >= 33 && ifCharIsSpecialChar1 <= 47 || ifCharIsSpecialChar1 >= 58 && ifCharIsSpecialChar1 <= 64
  || ifCharIsSpecialChar1 >= 91 && ifCharIsSpecialChar1 <= 96 || ifCharIsSpecialChar1 >=123 && ifCharIsSpecialChar1 <=126){
  System.out.println("Special character is = " + ifCharIsSpecialChar1);
}
else{

}



    TASK-7 (Find if given char is a letter or digit or special character)
    -Assume you are given a single character. (It will be hard-coded)
    -If given char is a letter, then print “Character is a letter”
    -If given char is a digit, then print “Character is a digit”
    -Otherwise, print “Character is a special character”
    Test data 1: Assume you are given g
    char c = ‘g’;
    Expected result 1:
    Character is a letter
    Test data 2: Assume you are given 5
    char c = ‘5’;
    Expected result 2:
    Character is a digit
    Test data 3: Assume you are given 5
    char c = ‘@’;
    Expected result 3:
    Character is a special character     */


    System.out.println("_____Task7_____");
char cChar = 'g';
if(cChar >= 65 && cChar <=90 || cChar >= 97 && cChar <=122){
  System.out.println("Character is a letter");
}
else if(cChar >= 48 || cChar <= 57){
  System.out.println("Character is a digit");
}
else if
  (cChar >= 33 && cChar <=47 || cChar >= 58 && cChar <=64 || cChar >= 91 && cChar <=96 || cChar >=123 && cChar <=126);{
}
    System.out.println("Character is special character");

  }

}













