package projects;

import java.util.ArrayList;
import java.util.Iterator;

public class Project08 {
  public static void main(String[] args) {
    String[] arr = {"foo",""," ","foo bar","java is fun"," ruby"};
    System.out.println(countMultipleWords(arr));
     ArrayList<Integer> arr1 = new ArrayList<>();
     arr1.add(2);
     arr1.add(-5);
     arr1.add(6);
     arr1.add(7);
     arr1.add(-10);
     arr1.add(-78);
     arr1.add(0);
     arr1.add(15);
    System.out.println(removeNegatives(arr1));
    String validate = "abcd@gmail.com";
    System.out.println(validatePassword(validate));
    String email = "abcd@gmail.com";
    System.out.println(validateEmailAddress(email));

  }

      public static int countMultipleWords(String[] arr ){
        int count = 0;
         for (String s : arr) {
        if(s.trim().contains(" ")) count++;
       }
       return count;
     }



    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){
      Iterator<Integer> removeNegativeWords = numbers.iterator();
      while (removeNegativeWords.hasNext()) {
       Integer element = removeNegativeWords.next();
       if(element < 0){
         removeNegativeWords.remove();
          }
        }
      return numbers;
      }


  public static boolean validatePassword(String password){
       boolean check = false;
       if(!password.isEmpty() && password.length() <= 16 && password.length() >= 8){
       for (int i = 0; i < password.length(); i++) {
         if(!(Character.isWhitespace(password.charAt(i)) && Character.isDigit(password.charAt(i))) &&
           (! Character.isLowerCase(password.charAt(i)) && Character.isUpperCase(password.charAt(i)))  &&
         (!Character.isLetterOrDigit(password.charAt(i)))) check = true;
        }
         return  check;
       }
       return false;
     }


  
  public static boolean validateEmailAddress(String email) {

    if(email.contains("@") && email.contains(".")){
       String[] validate = email.split("@");
         String[] validate1 = validate[1].split("\\.");
       return validate[0].length() > 2 && validate1[0].length() > 2 && validate1[1].length() > 2;
    }
  return false;

  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }





















