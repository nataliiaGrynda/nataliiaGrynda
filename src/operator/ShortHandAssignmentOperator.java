package operator;

public class ShortHandAssignmentOperator {
  public static void main(String[] args) {


    int johnAge = 5;
    //int johnAgeLater = johnAge + 5;
    //  System.out.println(johnAgeLater);


    //johnAge = johnAge + 5;

    johnAge += 5;
    System.out.println(johnAge);

    String name = "Alex";//Alexander
    // String name2 = name + "an";
    // System.out.println(name2);
    name += "an";
    name += "d";
    name += "e";
    name += "r";
    System.out.println(name);

  }
}
