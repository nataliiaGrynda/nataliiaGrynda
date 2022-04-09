package oop_principles.class_objects;

import java.util.ArrayList;

public class Animal {




  // defoult constractor
  public Animal(){

  }
  // create custom constractor that takes 6 arguments- name age,

  public Animal(String name, String color, int age, boolean isHerbivore,boolean  isCarnivore , boolean isOmnivore){
    //i should assign local variables into instant variable
   this.name = name;
   this.age = age;
   this.isHerbivore = isHerbivore;
   this.color = color;
   this.isCarnivore = isCarnivore;
   this.isOmnivore = isOmnivore;

  }




  //fields of animal instance
  public static final boolean hasEyes = true;// static means belongs to an object , final means cannot be changed
  public String name;
  public int age;
  public String color;
  public boolean isCarnivore;
  public boolean isHerbivore;
  public boolean isOmnivore;

  @Override
  public String toString() {
    return "Animal{" +
      "name='" + name + '\'' +
      ", age=" + age +
      ", color='" + color + '\'' +
      ", isCarnivore=" + isCarnivore +
      ", isHerbivore=" + isHerbivore +
      ", isOmnivore=" + isOmnivore +
      '}';
  }

  //testing animal
  public static void main(String[] args){
    System.out.println(Animal.hasEyes);//true

    /*
   creawte an animal object called a1 and define thae info as below

Animal a1 = new Animal();
    a1.name = "Cow";
   a1.age = 3;
   a1.color = "Black";
   a1.isHerbivore = true;

    System.out.println(a1);
*/

Animal a1 = new Animal("Cow", "Black", 3, true, false, false);
    System.out.println(a1);

/*
create a2 object
 */

Animal a2 = new Animal("Cat","Grey", 1, false,false, true);

    System.out.println(a2);


       Animal a3 = new Animal("Parrot", "White", 2, false, true, false);
    System.out.println(a3);


    Animal a4 = new Animal("Lion", "Beige", 4, true, false,false);
    System.out.println(a4);


    /*
 TASK-1
Store your animal object in a collection
Count how many herbivore, omnivore and carnivore animal object you have

RESULT:
Herbivore = 2
Carnivore = 1
Omnivore = 1
     */


    ArrayList<Animal> animalList = new ArrayList<>();
    animalList.add(a1);
    animalList.add(a2);
    animalList.add(a3);
    animalList.add(a4);

int om = 0; int he = 0; int ca= 0;
    for (Animal animal : animalList) {
     if(animal.isHerbivore) he++;
     else if(animal.isCarnivore) ca++;
     else om++;
    }

    System.out.println(he);
    System.out.println(om);
    System.out.println(ca);




  }
}
