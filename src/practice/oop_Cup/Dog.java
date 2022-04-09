package practice.oop_Cup;

public class Dog {



  public Dog(){

  }
  public String name;
  public String eyesColor;
  public int age;
  public String address;

  public void eat(){

  }

  public void sleep(){

  }
  public void live(){

  }

  @Override
  public String toString() {
    return "Dog{" +
      "name='" + name + '\'' +
      ", eyesColor='" + eyesColor + '\'' +
      ", age=" + age +
      ", address='" + address + '\'' +
      '}';
  }
}
