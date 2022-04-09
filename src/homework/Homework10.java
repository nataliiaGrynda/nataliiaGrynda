package homework;

public class Homework10 {
  public static void main(String[] args) {

                                    System.out.println("_____Task1_____");
    String s1 = "JavaScript";
    if(s1.length() <= 1){
      System.out.println("Length is zero");
    }
    else{
      System.out.println("Length is = " + s1.length());
      System.out.println("First char in the string = " + s1.charAt(0));
      System.out.println("Last char is = " + s1.charAt(s1.length()-1));

         if(s1 == "a" || s1 == "e" || s1 == "o" || s1 == "i" || s1 == "u" || s1 == "A" || s1 == "E" ||
      s1 == "O" || s1 == "I" || s1 == "U" ){
        System.out.println("This string has vowel");
      }
      else {
        System.out.println("This string does not have vowel");
      }
    }
                               System.out.println("_____Task2_____");

    String str = "ab";
    if(str.length() < 3){
      System.out.println("Length is less than 3");
    }
    else {
      if (str.length() % 2 == 0) {//formula for the even length
        System.out.println("" + str.charAt(str.length() / 2 - 1) + str.charAt(str.length()/2));
      // without "" it will run as askii table.
      }else {//odd length string
        System.out.println(str.charAt(str.length() / 2)); //odd length
      }
    }

                                  System.out.println("_____Task3_____");

        String str_3 = "python";
        if(str_3.length() < 4){
          System.out.println("INVALID INPUT");
        }
       else{
          System.out.println("First 2 characters are = " + str_3.substring(0,2));
          System.out.println("Last 2 characters are = " + str_3.substring(str_3.length()-2));
          System.out.println("The other characters are = " + str_3.substring(2, str_3.length()-2));
        }

    System.out.println("_____Task4_____");

    String str_4 = "";
    //              0123
    if (str_4.length() < 2) {
      System.out.println("Length is less than 2");
    } else {
      System.out.println(str_4.substring(0,2).equals(str_4.substring(str_4.length()-2)));
    }


    System.out.println("____Task5_____");
    String input1 = "1234";
    String input2 = "6".toLowerCase();

    if (input1.length() < 2 || input2.length() < 2) {
      System.out.println("INVALID INPUT");
    } else {

      System.out.println(input1.substring(1, input1.length()-1) + input2.substring(1 , input2.length()-1));

    }


             System.out.println("_____Task6_____");

    String str_6 = "green";
    if(str_6.length() < 4){
      System.out.println("INVALID INPUT");
    }
      else if(str_6.startsWith("xx") && str_6.endsWith("xx"))
    {
      System.out.println("true");
    }
         else {
      System.out.println("false");
    }



  }
}