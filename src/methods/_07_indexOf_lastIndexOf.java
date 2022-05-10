package methods;

public class _07_indexOf_lastIndexOf {
  public static void main(String[] args) {
    /*
    method task : used to fiend the index or last index of some char or String values
    non static methods and called with anuther string object
    they are return type they return int as index
    they take eather string or char as arguments

    note: if the given char or string doesnt exist then it returns -1
    note: if yuore are looking for a index of string  and it exist it will return the first index finding the match

     */


    String sentense = "I like Chicago and Miami more than any other cities";
    System.out.println(sentense.indexOf('C'));
    System.out.println(sentense.indexOf('c'));
    System.out.println(sentense.lastIndexOf('c'));

    sentense.indexOf("Chicago");//7
    sentense.indexOf("Miami");//19
sentense.indexOf("chicago"); //-1 ---> because it doesn't exist in our string
  }
}
