package stringMethods;

public class _10_substring {
  public static void main(String[] args) {

    /*
    mathod task: they are used to extract substing from a larger string
    they are non static and we call qthem with object
    they return type and they return anuther string (substring)
there are 2 overlodad methods
1. substring(int beginIndex)
this method takes begin index as an argument and it extract a substring starting from givan index to the end
2. substring(int beginIndex int endIndex)
-this method will take two arguments to define which index to start and which index to stop to extract a substring
note: beginIndex is inclusive but endIndex is exclusive
note: if you begin index is equal to endIndex, then it will return empty string
note: if your beginIndex is less than endIndex, then it will throw StringIndexOutOfBoundsException.
     */




    String result = "About 3,520,000,000 results (0.82 seconds)";
   // result.substring(6,18);
    String num = result.substring(6,19);
    System.out.println(num);


String num1 = "About 3,520,000,000 results (0.82 seconds)";
String num2 = num1.substring(28);
    System.out.println(num2);
    System.out.println("----be creative------");
    System.out.println(result.substring(result.indexOf('(')));
    System.out.println(result.substring(result.lastIndexOf('0')-1));
    System.out.println(result.substring(result.length()-14));
    System.out.println(result.substring(result.indexOf("results" +8)));
  }
}
