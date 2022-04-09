package oop_principles.recapOOP;

public class CurvedSword {

  static {
    System.out.println("Starting to furnace...");
  }
  {
    System.out.println("heating up the materials");
  }



  public CurvedSword(){
  }
  public  CurvedSword(String material){
    this.material = material;
  }

  public  CurvedSword(String color, String  material, String sharpness,
                      double weight, double price){
    this.color = color;
    this.material = material;
    this.sharpness = sharpness;
    this.price = price;
    this.weight = weight;
  }


  public String color;
  public String material;
  public static String handle = "Regular";
  public String sharpness;
  public static String size = "Mediem";
  public double price;
  public double weight;




  public  void slash(){
    System.out.println("Sword slashes");
  }


  public void cut(){
    System.out.println("Sword cuts");
  }

  public void cut(boolean isSharp){
    if(isSharp){
      System.out.println("The cut is sharp");
    }else{
      System.out.println("There is no cut");
    }
  }


  public static CurvedSword creatingSword(String material){
    CurvedSword sword = new CurvedSword();
    sword.material = material;
    return sword;
  }





}
