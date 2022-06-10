package homework;

public class Homework21 {

  public static void main(String[] args) {

    System.out.println( fizzBuzz1(18));
    System.out.println(fizzBuzz2(15));
    System.out.println(findSumNumbers("b110c045d"));
    System.out.println(findBiggestNumber("ab110c045d"));
    System.out.println(countSequenceOfCharacters("abbcca"));
  }
/*
Requirement:
-Create a method called fizzBuzz1()
-This method will take an int argument, and it will print
numbers starting from 1 to given argument. BUT, it will print
“Fizz” for the numbers divided by 3, “Buzz” for the numbers
divided by 5, and “FizzBuzz” for the numbers divided both by 3
and 5.
Test Data 1: 3
Expected Result 1:
1
2
Fizz
Test Data 2: 5
Expected Result 2:
1
2
Fizz
4
Buzz
Test Data 3: 18
Expected Result 3:
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
 */

  public static int fizzBuzz1(int number) {
    for (int i = 1; i <= number; i++) {
      if (i % 3 == 0) System.out.println("Fizz");
      else if (i % 5 == 0) System.out.println("Buzz");
      else if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
      else System.out.println(i);
    }
    return number;
  }

  /*
  -Create a method called fizzBuzz2()
  -This method will take an int argument, and it will return
  a String. BUT it will return “Fizz” if the given number is
  divided by 3, “Buzz” if the number is divided by 5, and
  “FizzBuzz” if the number is divided both by 3 and 5.
  Otherwise, it will return number itself.
  Test Data 1: 0
  Expected Result 1: FizzBuzz
  Test Data 2: 1
  Expected Result 2: 1
  Test Data 3: 3
  Expected Result 3: Fizz
  Test Data 4: 5
  Expected Result 4: Buzz
  Test Data 5: 15
  Expected Result 5: FizzBuzz
   */
  public static String fizzBuzz2(int number) {
    if (number % 3 == 0 && number % 5 == 0) {
      return "FizzBuzz";
    } else if (number % 3 == 0) {
      return "Fizz";
    } else if (number % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(number);
  }
/*
Create a method called findSumNumbers()
-This method will take a String argument and it will return
an int which is the sum of all numbers presented in the String.
NOTE: If there are no numbers represented in the String,
return 0.
Test Data 1: “abc$”
Expected Result 1: 0
Test Data 2: “a1b4c  6#”
Expected Result 2: 11
Test Data 3: “ab110c045d”
Expected Result 3: 155
Test Data 4: “525”
Expected Result 4: 525
 */

  public static int findSumNumbers(String str) {
    int sum = 0;
    String temp = "0";
    for (int i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) temp += str.charAt(i);
      else {
        sum += Integer.parseInt(temp);
        temp = "0";
      }
    }
    return sum + Integer.parseInt(temp);
  }

  /*
  Create a method called findBiggestNumber()
  -This method will take a String argument and it will
  return an int which is the number presented in the
  String.
  NOTE: If there are no numbers represented in the String,
  return 0.
  Test Data 1: “abc$”
  Expected Result 1: 0
  Test Data 2: “a1b4c  6#”
  Expected Result 2: 6
  Test Data 3: “ab110c045d”
  Expected Result 3: 110
  Test Data 4: “525”
  Expected Result 4: 525
   */
  public static int findBiggestNumber(String str) {
    int num = 0;
    int biggest = 0;
    for (int i = 0; i < str.length(); i++) {//start looping through
      if (Character.isDigit(str.charAt(i)))//we are checking if the character is digit
        num = num * 10 + (str.charAt(i) - '0');
         else {
        biggest = Math.max(biggest, num);//updating the maximum value
        num = 0;//reset the number
      }
    }
    return Math.max(biggest, num);
  }

/*
Create a method called
countSequenceOfCharacters()
-This method will take a String argument and it will
return a String which is the count of repeated
characters in a sequence in the String.
NOTE: If given String is empty, then return empty String.
NOTE: It is case sensitive!!!
Test Data 1: “”
Expected Result 1: “”
Test Data 2: “abc”
Expected Result 2: “1a1b1c”
Test Data 3: “abbcca”
Expected Result 3: “1a2b2ca”
Test Data 4: “aaAAa”
Expected Result 4: “2a2A1a”
*/
   public static String countSequenceOfCharacters(String str) {
     String sequence = "";
     int count = 1;
     for (int i = 0; i < str.length(); i++) {
       for (int j = i + 1; j < str.length(); j++) {
         if (str.charAt(i) == str.charAt(j))
           count++;
          }
           if (!sequence.contains(str.charAt(i) + "")) {
         sequence += str.charAt(i);
         sequence += count;
         count = 1;
       }
     }
     return sequence;
   }
   }