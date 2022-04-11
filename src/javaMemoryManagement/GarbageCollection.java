package javaMemoryManagement;

public class GarbageCollection {
  public static void main(String[] args) {

    //is imported

    Dog dog1 = new Dog();
    Dog dog2 = new Dog();

    //object reference before losing reference
    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println(dog1.equals(dog2));

    //object reference after losing reference
    dog1 = dog2;// losing reference here and garbage collected!
    //explicitly doing garbage collections
    System.gc();
    Runtime.getRuntime().gc();
    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println(dog1.equals(dog2));






  }
}
