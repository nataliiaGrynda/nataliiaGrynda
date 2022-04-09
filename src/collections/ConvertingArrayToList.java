package collections;

import java.util.*;

public class ConvertingArrayToList {
  public static void main(String[] args) {

    /*
    create a list and store below data list is a futher arrayList
     */


    ArrayList<String> countries = new ArrayList<>();
    countries.add("USA");
    countries.add("Brasilia");
    countries.add("Argentina");
    countries.add("France");
    countries.add("Belgium");
    countries.add("Germany");
    countries.add("Portugal");

    System.out.println(countries);

    System.out.println("___way to convert array to list______");


    String[] countrie = {"USA", "Argentina", "Brasilia"};
    Arrays.asList(countrie);
    List<String> countries1 = new ArrayList<>(Arrays.asList(countrie));
    System.out.println(countries1);

    System.out.println("___way to convert array to list______");
    List<String> countries3 = new ArrayList<>();
    List<String> countries4 = new LinkedList<>();

    Collections.addAll(countries3, countrie);// this method adds all arey elements to
    Collections.addAll(countries4, countrie);

    System.out.println(countries3);
    System.out.println(countries4);


    Integer[] numbers = {1, 2, 3, 4, 5};
    List<Integer> numbersList = new ArrayList<>();

    for (int i : numbers) {
      numbersList.add(i);

    }
    System.out.println(numbersList);







  }}