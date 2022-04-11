package javaMemoryManagement;

public class UnderstandingStackAndHeap {
  public static void main(String[] args) {

    int age = 45;
    System.out.println(age);





//reference - object... but object is going to be stored in a heap.
    Dog dog1 = new Dog(); //dog1 is reference to the object and it is going to be stored in a stack
    System.out.println(dog1);

   dog1.bread = "puppy";
     dog1.age = 4;

  }
}
