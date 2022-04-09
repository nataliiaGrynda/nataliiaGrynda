package stringMethods;

public class _08_lenght {
  public static void main(String[] args) {
    /*
    method task : counts the total num of characters in a string and returns it as int
    it is non static and can be called with an object name
    return type methods
    and it returns an int (total number of characters),
    it dosent any arguments
    note: it is like human thinking , we start count from 1 not zero...
    note : space is also a character
     */




    String  city = "Chicago";
    System.out.println(city.length());
    System.out.println(city.length() + 3);


    String company = "TechGlobal";
    int size = company.length(); // 10 returns as an int
    System.out.println(size);



  }
}
