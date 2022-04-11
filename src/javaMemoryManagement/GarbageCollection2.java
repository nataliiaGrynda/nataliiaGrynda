package javaMemoryManagement;

public class GarbageCollection2 {
  public static void main(String[] args){


    Dog dog1 = new Dog();

    System.out.println(dog1);

    dog1 = null;// dog reference is lost
    System.gc();

  }
}
