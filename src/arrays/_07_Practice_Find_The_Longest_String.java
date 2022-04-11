package arrays;

public class _07_Practice_Find_The_Longest_String {
  public static void main(String[] args) {
    
    /*
    find the string that has the most characters and print it
     */
    
    String[] colors = {"red","blue","yellow","white"};
   String findTheLongest = "";
    for (String color : colors) {
      if(color.length() > findTheLongest.length())findTheLongest=color;

      }

    System.out.println(findTheLongest);
    
    
    
    
    
    
    
  }
}
