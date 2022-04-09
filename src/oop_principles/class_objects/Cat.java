package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Cat {

public Cat(){

}

public Cat(String name, int age, boolean isBig, String color){
  //i should assign this local variables into
  this.age = age;
   this.isBig = isBig;
   this.color = color;

}
public static int numberOfCats = 0;
  public final static String name = "baby";
  public static int age;
  public boolean isBig;
  public String color;


  @Override
  public String toString() {
    return "Cat{" +
      "name='" + name + '\'' +
      ", age=" + age +
      ", isBig=" + isBig +
      ", color='" + color + '\'' +
      '}';
  }
  public static void main(String[] args){

    Cat cat1 = new Cat("Lisa", 3, true, "Black");
    System.out.println(cat1);


  }


}
