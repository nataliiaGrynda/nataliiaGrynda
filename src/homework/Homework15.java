package homework;

import java.util.ArrayList;
import java.util.Collections;

public class Homework15 {
  public static void main(String[] args) {


    System.out.println("_____Task1_____");

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(23);
    numbers.add(67);
    numbers.add(23);
    numbers.add(78);
    System.out.println(numbers.get(1));
    System.out.println(numbers.get(0));
    System.out.println(numbers.get(2));
    System.out.println(numbers);


    System.out.println("_____Task2____");

    ArrayList<String> colors = new ArrayList<>();
    colors.add("Blue");
    colors.add("Brown");
    colors.add("Red");
    colors.add("White");
    colors.add("Black");
    colors.add("Purple");
    System.out.println(colors.get(1));
    System.out.println(colors.get(3));
    System.out.println(colors.get(5));
    System.out.println(colors);

    System.out.println("_____Task3_____");

    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(23);
    nums.add(-34);
    nums.add(-56);
    nums.add(0);
    nums.add(89);
    nums.add(100);
    System.out.println(nums);
    Collections.sort(nums);
    System.out.println(nums);

    System.out.println("____Task4____");

    ArrayList<String> cities = new ArrayList<>();
    cities.add("Istanbul");
    cities.add("Berlin");
    cities.add("Madrid");
    cities.add("Paris");
    System.out.println(cities);
  Collections.sort(cities);
    System.out.println(cities);


    System.out.println("_____Task5_____");


    ArrayList<String> characters = new ArrayList<>();
    characters.add("Spider Man");
    characters.add("Iron Man");
    characters.add("Black Panther");
    characters.add("Deadpool");
    characters.add("Captain America");
    System.out.println(characters);

    boolean containsWolwerine = false;
    for (String character : characters) {
      if (character.equals("Wolwerine"))
        containsWolwerine = true;
    }
        System.out.println(containsWolwerine);


    System.out.println("_____Task6_____");

    ArrayList<String> avengersCharacters = new ArrayList<>();
    avengersCharacters.add("Hulk");
    avengersCharacters.add("Black Widow");
    avengersCharacters.add("Captain America");
    avengersCharacters.add("Iron Man");
    Collections.sort(avengersCharacters);
    System.out.println(avengersCharacters);

    String containsHulkAndIronMan = "";
    for (String avengersCharacter : avengersCharacters) {
      if (avengersCharacter.contains("Hulk") || avengersCharacter.contains("Iron Man"))
         containsHulkAndIronMan += avengersCharacter;
    }
    System.out.println(containsHulkAndIronMan.contains("Hulk") && containsHulkAndIronMan.contains("Iron Man"));


    System.out.println("____Task7____");

    ArrayList<Character> charactersTask7 = new ArrayList<>();
    charactersTask7.add('A');
    charactersTask7.add('x');
    charactersTask7.add('$');
    charactersTask7.add('%');
    charactersTask7.add('9');
    charactersTask7.add('*');
    charactersTask7.add('+');
    charactersTask7.add('F');
    charactersTask7.add('G');

    System.out.println(charactersTask7);
    for (Character character : charactersTask7) {
      System.out.println(character);
    }

    System.out.println("____Task8____");

     ArrayList<String> objects = new ArrayList<>();
     objects.add("Desk");
     objects.add("Laptop");
     objects.add("Mouse");
     objects.add("Monitor");
     objects.add("Mouse-Pad");
     objects.add("Adapter");
    System.out.println(objects);
    Collections.sort(objects);
    System.out.println(objects);


   int count = 0;// create variable to collect objects that start with M and m.
   int count2 = 0;// created container that collects objects that dont have letters A a E e
    for (String object : objects) {  // using loop to check each element and dont write repetitive code
      if(object.startsWith("M") || object.startsWith("m")) count++;// using to write conditions, count to go throught each element and count
      if(!(object.contains("A") || object.contains("a") || object.contains("E") || object.contains("e"))) count2++;
    }


    System.out.println(count);// print out collected elements
    System.out.println(count2);


    System.out.println("____Task9____");


    ArrayList<String> kitchenObjects = new ArrayList<>();
    kitchenObjects.add("Plate");
    kitchenObjects.add("spoon");
    kitchenObjects.add("fork");
    kitchenObjects.add("Knife");
    kitchenObjects.add("cup");
    kitchenObjects.add("Mixer");
    System.out.println(kitchenObjects);


    int countUppercase = 0;// container to store uppercase letters
    int countLowercase = 0;//container to store lowercase letters
    int countPAndp = 0;//container to store Pp
    int countStartsWithPAndEndsWithP = 0;//container to store starts with Pp and ends with Pp letters
    for (String kitchenObject : kitchenObjects) {// using loop to loop throught the elements
      if(Character.isUpperCase(kitchenObject.charAt(0)))// finding all the uppercase letters
      countUppercase++;// counting and adding to container
       else if(Character.isLowerCase(kitchenObject.charAt(0)))
         countLowercase++;

       if(kitchenObject.contains("p") || kitchenObject.contains("P"))
         countPAndp++;
       if(kitchenObject.startsWith("P") || kitchenObject.endsWith("P")|| kitchenObject.startsWith("p") || kitchenObject.endsWith("p"))
         countStartsWithPAndEndsWithP++;
    }

    System.out.println("Elements starts with uppercase = " + countUppercase);
    System.out.println("Elements starts with lowercase = " + countLowercase);
    System.out.println("Elements having P or p = " + countPAndp);
    System.out.println("Elements starting or ending with P or p = " + countStartsWithPAndEndsWithP);


    System.out.println("_____Task10_____");


    ArrayList<Integer> numbersTask10 = new ArrayList<>();
    numbersTask10.add(3);
    numbersTask10.add(5);
    numbersTask10.add(7);
    numbersTask10.add(10);
    numbersTask10.add(0);
    numbersTask10.add(20);
    numbersTask10.add(17);
    numbersTask10.add(10);
    numbersTask10.add(23);
    numbersTask10.add(56);
    numbersTask10.add(78);
    System.out.println(numbersTask10);

    int dividedBy10 = 0;
    int greaterThen15 = 0;
    int oddNumbersAreLessThen20 = 0;
    int lessThen15AndGreaterThen50 = 0;
    for (Integer elements : numbersTask10) {
      if(elements % 10 == 0)dividedBy10++;
      if(elements % 2 == 0 && elements > 15) greaterThen15++;
      if(elements % 2 != 0 && elements < 20)oddNumbersAreLessThen20++;
      if(elements < 15 || elements > 50) lessThen15AndGreaterThen50++;
    }

    System.out.println("Elements that can be divided by 10 = " + dividedBy10);
    System.out.println("Elements that are even and greater than 15 = " + greaterThen15);
    System.out.println("Elements that are odd and less than 20 = " + oddNumbersAreLessThen20);
    System.out.println("Elements that are less than 15 or greater than 50 = " + lessThen15AndGreaterThen50);


  }
}
