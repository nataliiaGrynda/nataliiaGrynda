package oop_principles.class_objects;

public class Student {

// we built a template......


  //please call default constructor here
 public Student(){

  }

  //define instants variable of student class as below

  public String firstName;
  public String lastName;
  public int age;
  public String dateOfBirth;
  public String gender;
  public String address;
  public double weight;
  public double height;
  public String email;
  public int id;

//define some student behavior some - functions
  //study, eat, sleep

  public void study(){
    System.out.println("students study");
  }
public void eat(){
  System.out.println("Student eats");
}
public void sleep(){
  System.out.println("Student sleeps");
}
//override toString() method from object class


  @Override
  public String toString() {
    return "Student{" +
      "firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", age=" + age +
      ", dateOfBirth='" + dateOfBirth + '\'' +
      ", gender='" + gender + '\'' +
      ", address='" + address + '\'' +
      ", weight=" + weight +
      ", height=" + height +
      ", email='" + email + '\'' +
      ", id=" + id +
      '}';
  }
}
