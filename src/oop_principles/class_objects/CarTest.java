package oop_principles.class_objects;

import java.util.ArrayList;

public class CarTest {
  public static void main(String[] args) {


    Car car1 = new Car();
    System.out.println(car1);// print locations of defoult

    System.out.println(car1.getClass().getName());
    System.out.println(car1.equals(car1));
car1.make = "Tesla";
car1.model = "S";
car1.year = 2022;
car1.color = "Red";
    System.out.println(car1.make);
    System.out.println(car1.model);
    System.out.println(car1.year);
    System.out.println(car1.color);


    System.out.println(car1);
    System.out.println(car1);
  Car cars2 = new Car();
  cars2.make = "Toyote";
  cars2.model = "Camry";
  cars2.year = 1999;
  cars2.color = "blue";




    car1.drives();//this car drives

    car1.honks();//this car honks


    ArrayList<Car> myCars = new ArrayList<>();
    myCars.add(car1);
    myCars.add(cars2);
    for (Car myCar : myCars) {
     // System.out.println(myCar);
      System.out.println(myCar.make.equals("Tesla"));
    }

  }
}
