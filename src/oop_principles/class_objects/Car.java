package oop_principles.class_objects;

public class Car {


  public Car(){

  }


  public String make;
  public String model;
  public int year;
  public String color;



  //defining some behavior oft the car object
  public void drives(){//third member, behavior methods like stops breark
    System.out.println("this car drives");
  }

public void honks(){
  System.out.println("this car honks");
}




//overide to String method that comes from object class
  //overidding is implementing another body over for the parent meyhod

  @Override
  public String toString() {
    return "Car{" +
      "make='" + make + '\'' +
      ", model='" + model + '\'' +
      ", year=" + year +
      ", color='" + color + '\'' +
      '}';



  }
}








