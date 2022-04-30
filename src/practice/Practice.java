package src.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class Practice {


  public static ArrayList<String> removeDuplicates(ArrayList<String> arr){
    return new ArrayList<>(new HashSet<>(arr));
  }

  public static int[] duplicate(int[] arr){
    HashSet<Integer> removedD = new HashSet<>();
    for(int num: arr){
      removedD.add(num);
    }
    int[] collect = new int[removedD.size()];
    for(Integer n: removedD){
      collect[n] = n;
    }
    return collect;
  }

 public static int prime(int[] num){
    int prime = 0;
  for(int n: num){
    if(n > 1 && n % 2 !=0 || n == 2)prime++;
  }
   return prime;
   }




  public static void main(String[] args) {
    System.out.println(removeDuplicates(new ArrayList(Arrays.asList("foo", "bar", "foo", " 123"))));



    String str = "David";
    String reverse = "";
    for (int i = str.length()-1; i >= 0 ; i--) {
      reverse += str.charAt(i);
    }
    System.out.println(reverse);
  }
}




