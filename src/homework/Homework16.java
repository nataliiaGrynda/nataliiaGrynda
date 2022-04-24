package homework;

import java.util.ArrayList;

public class Homework16 {
  public static void main(String[] args) {

    System.out.println(countWords("      Java is fun       "));
   String num = "TechGlobal is a QA bootcamp";
    System.out.println(countA(num));

    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(-23);
    nums.add(-4);
    nums.add(0);
    nums.add(2);
    nums.add(5);
    nums.add(90);
    nums.add(123);
    System.out.println(countPos(nums));

  ArrayList<Integer> numbers =new ArrayList<>();
  numbers.add(10);
  numbers.add(20);
  numbers.add(35);
  numbers.add(20);
  numbers.add(35);
  numbers.add(60);
  numbers.add(70);
  numbers.add(60);
    System.out.println(removeDuplicateNumbers(numbers));
    
    ArrayList<String> elements = new ArrayList<>();
    elements.add("java");
    elements.add("C#");
    elements.add("ruby");
    elements.add("JAVA");
    elements.add("ruby");
    elements.add("C#");
    elements.add("C++");
    System.out.println(removeDuplicateElements(elements));

    int[] numbers1 = {10, -13, 8, 12, 15, -20};
    System.out.println(findClosestTo10(numbers1));
    System.out.println(removeExtraSpaces("  I   am      learning     Java      "));
  }


  public static int countWords(String str) {
    String str1 = str.trim();
    int count = 0;
    if (str1.contains(" ")){
      for (int i = 0; i < str1.length(); i++) {
        if (Character.isWhitespace(str1.charAt(i))) {
          count++;
        }
      }
    }
    return (count + 1);
  }
  //return str.trim().split(" "),length;



  public static int countA(String str){
    int count = 0;
  for (int i = 0; i <= str.length()-1; i++) {
    if(str.charAt(i) == 'a' || str.charAt(i) == 'A'){
      count++;
    }
  }
  return count;
  }


  public static int countPos(ArrayList<Integer> elements ) {
   int positive = 0;
    for (Integer element : elements) {
     if(element > 0){ positive++;
    }
  }
  return positive;
 }



 public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> nums){
  ArrayList<Integer> removeDuplicates = new ArrayList<>();

  for (Integer num : nums) {
    if(!removeDuplicates.contains(num)){
      removeDuplicates.add(num);
    }
  }

   return removeDuplicates;

  }


    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str){

    ArrayList<String> removedDuplicates = new ArrayList<>();
    for (String s : str) {
    if(!removedDuplicates.contains(s)){
     removedDuplicates.add(s);
    }
  }
    return removedDuplicates;
  }

     public static String removeExtraSpaces(String str){
     str = str.trim().replaceAll(" +", " ");
    return str;
  }



    public static int[] add(int[] a, int[]b){

    int[] addingTwoArrays = new int[Math.max(a.length,b.length)];
    for (int i = 0; i < addingTwoArrays.length; i++) {
      if(a.length > i){
        addingTwoArrays[i] += a[i];
      }if(b.length > i){
        addingTwoArrays[i] += b[i];
      }
    }
   return addingTwoArrays;


  }


    public static int findClosestTo10(int[] arr) {

      int index = 0;
      int distance = Math.abs(arr[0] - index);

      for (int i = 0; i < arr.length; i++) {
        int dist = Math.abs(arr[i] - index);
        if (dist < distance) {
          index = i;
          distance = dist;
        }
      }
      int num = arr[index];
      return num;
    }


  
}
































