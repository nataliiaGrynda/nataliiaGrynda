package stringMethods;

public class _06_charAt {
  public static void main(String[] args) {
    /*
    method task: it helps to get a charscter at a specific index
    note: index starts with zero
    it is non static as we call it with an object
    it is a return tyepe and returns char primitive
    it takes an argument which is int(index
    note: it will throw StringOutOfBoxExseption when the given index in not in the bounds
     */

    String name = "Alex";
    System.out.println(name.charAt(0));
    System.out.println(name.charAt(1));
    System.out.println(name.charAt(2));
    System.out.println(name.charAt(3));


    char firstName = name.charAt(0);
    if(firstName =='A'){
      System.out.println("this name starts with name");
    }
else{
      System.out.println("this name does not start with A");
    }
  }
}
