package src.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeworkR4 {


//  public static String noSpace(String str) {
//   return str.replaceAll(" ", "");
//  }
    public static String noSpace(String str) {
      StringBuilder space = new StringBuilder();
      for (Character s : str.toCharArray()) {
        if (!Character.isWhitespace(s)) {
          space.append(s);
        }
      }
      return space.toString();
    }


    public static String replaceFirstLast(String str){
      if(str.trim().length() < 2 ){
        return "";
      }
      return str.substring(str.length()-1) + str.substring(str.length()/2-1,str.length()-1) + str.substring(0,1);
    }

     public static boolean hasVowel(String str){
    boolean count = false;
       for (int i = 0; i < str.length(); i++) {
         if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'o' || str.toLowerCase().charAt(i) == 'u' ||
           str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'e')
            count = true;
        }
       return count;
     }


     public static void checkAge(int yearOfBirth){
      Date date = new Date();
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy") ;
       int currentYear = Integer.parseInt(dateFormat.format(date));
       System.out.println(currentYear - yearOfBirth);
       if(yearOfBirth < 16){
        System.out.println("Age is not allowed");
      }else if(yearOfBirth >= 16 && yearOfBirth <=100 ){
        System.out.println("Age is allowed");
      }else if( yearOfBirth > 100){
        System.out.println("The age is not valid");
      }
    }



    public static int averageOfEdges(int a, int b, int c){
      return (a + b + c) / 2;
    }



  public static void main(String[] args) {
    System.out.println(HomeworkR4.noSpace("i like java and"));
    System.out.println(HomeworkR4.replaceFirstLast("Hello"));
    System.out.println(HomeworkR4.hasVowel("java"));
    //System.out.println(HomeworkR4.checkAge(1000));
    System.out.println(HomeworkR4.averageOfEdges(-2, -2, 10));
  }
}
