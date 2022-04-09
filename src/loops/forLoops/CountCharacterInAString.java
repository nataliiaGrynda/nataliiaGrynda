package loops.forLoops;

public class CountCharacterInAString {
  public static void main(String[] args) {


    String str = "TechGlobal School";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'o') count++;


      }
      System.out.println(count);



          /*
    METHOD-3 countDigits
    Write a method that takes a String argument and returns the total occurrences of digits in the String as an int
    TEST DATA:
    "123 Java, JavaScript, C# 456"
    EXPECTED OUTPUT:
    6
     */
    String occurencesOfDigits = "123 Java, JavaScript, C# 456";
    int count1 = 0;
    for(int i = 0; i <=occurencesOfDigits.length()-1; i++){
      if(Character.isDigit(occurencesOfDigits.charAt(i))) count1++;
    }
    System.out.println(count1);


    String name = "data $%& data #@";
    int charS = 0;
    for (int i = 0; i <= name.length()-1;i++) {
      char c = name.charAt(i);
      if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) charS++;

    }
      System.out.println(charS);


   int a = 6;
   int b = 7;
   int c = 8;
   int max = Math.max(a, Math.max(b,c));
   int min = Math.min(a, Math.min(b,c));
    System.out.println("Max of " + a + "and" + b + " and " + c + " = " + max);
    System.out.println("Min of "+ a + " and ");


    }
  }
