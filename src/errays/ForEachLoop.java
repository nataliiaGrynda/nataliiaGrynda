package errays;

public class ForEachLoop {
  public static void main(String[] args) {

/*
Print each element with a message

EXPECTED OUTPUT:
Element 1 = A
Element 2 =
Element 3 = ,
Element 4 = #
Element 5 = T
Element 6 = 6
Element 7 = 9
 */
    char[] chars = {'A', ' ', ',', '#', 'T', '6', '9'};
    System.out.println(chars.length);


    for(int i = 0; i <= chars.length-1; i++){

      System.out.println("element = " + chars[i] );

    }

    System.out.println("for each loop");
for(char element: chars){
  System.out.println("element = " + element);
}



  }
}
