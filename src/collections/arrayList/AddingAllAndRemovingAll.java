package collections.arrayList;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
  public static void main(String[] args) {
/*
create an list of german cars and add below items
 */
    ArrayList<String> germanCars = new ArrayList<>();
    germanCars.add("BMW");
    germanCars.add("Mercedes");
    germanCars.add("Volkswagen");
    System.out.println("German cars = " + germanCars);

/*
japanice cars list
 */
   ArrayList<String> japaneseCars = new ArrayList<>();
   japaneseCars.add("Honda");
   japaneseCars.add("Toyota");
   japaneseCars.add("Lexus");
    System.out.println("Japanese cars = " + japaneseCars);


/*
 create luxary cars list
 */

  ArrayList<String> luxuryCars = new ArrayList<>();
  luxuryCars.add("Maserati");
  luxuryCars.add("Tesla");
  luxuryCars.add("Range Rover");
  luxuryCars.add("Jaguar");
    System.out.println("Luxury cars = " + luxuryCars);


       ArrayList<String> inventory = new ArrayList<>();
    System.out.println("Inventory at the bigining = " + inventory);
       inventory.addAll(germanCars);
// adding all german cars to the inventiry collection
    System.out.println("Inventory after adding german cars = " + inventory);
// adding all laxurry cars to the inventory collactiins
    inventory.addAll(luxuryCars);
    System.out.println("Inventory after adding all the luxary cars = " + inventory);
    inventory.addAll(japaneseCars);
    System.out.println("Inventory after adding all the japenise cars = " + inventory);


    //removing all japenise cars from he inventory
    inventory.remove(japaneseCars);
    System.out.println(japaneseCars);



    //remove tesla audi, and BMW

    inventory.remove("Tesla");
    inventory.remove("Audi");
    inventory.remove("BMW");
    System.out.println(inventory);


    ArrayList<String> carsToBeRemoved = new ArrayList<>();



  }
}
