package collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UnderstandingArrayList {
  public static void main(String[] args) {

    // declaring an Array vs ArrayList
    String[] names = new String[5];

    ArrayList<String> nameList = new ArrayList<>();


    // how to print the size of array vs arrayList

    System.out.println("printing size of array vs arrayList");
    System.out.println("size of the array = " + names.length);
    System.out.println("size of the arrayList = " + nameList.size());


   //how to add elements to array vs arrayList

    names[0]="Aba";
    names[4]="data";
    //names[7]="john";//arrayIndexOutOfBOUND

    nameList.add("abe");// add method that takes object
    nameList.add(1,"data");// add object to a specific index[abe, data]
    nameList.add(1,"john");//abe john data
    nameList.add("alona");// if it is not specifiad it will go to the back
    nameList.add("max");//abe john, data, alona, max
    nameList.add(0,"james");//


    nameList.set(3, "lianal"); // abe, john, lionel //to update

 // how to print array an array vs arrayList

    System.out.println(Arrays.toString(names));
    System.out.println(nameList);


    nameList.add("andrey");// returns true
    nameList.add(5, "taylor");

    System.out.println(nameList);

    nameList.set(3,"daria");
    System.out.println(nameList.size());

    //how to remove elements
    //nameList.remove ("jamas")
    nameList.remove(7);


    //nameList.removeAll(colectionsOfElementsToBeRemove)this will remove all the elemnts from the givan coleections

    nameList.remove(0);//james
    System.out.println(nameList);


  nameList.remove(2);
    System.out.println(nameList);// daria remove

//nameList.remove(20);
      nameList.remove("alona");

    System.out.println(nameList);

   //  nameList.remove("john");
    System.out.println(nameList.remove("john"));
    System.out.println(nameList);


    //how to remove 3 names regina at the same time
    nameList.add(0,"Regina");

    System.out.println(nameList);
nameList.remove("Regina");
    System.out.println(nameList);

// get specific element
    System.out.println(nameList.get(2));//
    System.out.println(nameList.indexOf("regina"));
    System.out.println( nameList.contains("max"));
    System.out.println(nameList.contains("Kaly"));

   nameList.removeAll(nameList);
    System.out.println(nameList.size());


    String[] oneA = new String[6];
    oneA[4] = "Lisa";
    System.out.println(Arrays.toString(oneA));
    ArrayList<String> oneAL = new ArrayList<>();
    oneAL.add("Lisa");
    System.out.println(oneAL);










  }
}
