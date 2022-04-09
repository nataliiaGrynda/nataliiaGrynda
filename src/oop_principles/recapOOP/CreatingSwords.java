package oop_principles.recapOOP;

public class CreatingSwords {
  public static void main(String[] args) {



    CurvedSword goldenSword = new CurvedSword();
    goldenSword.color = "Yellow";
    goldenSword.material = "Gold";
    goldenSword.sharpness = "Blunt";
    goldenSword.price = 500.00;
    goldenSword.weight = 15.5;



    CurvedSword ironSword = new CurvedSword("Silver", "Iron",
      "Sharp",7.3,5.8);

    System.out.println("goldenSworn"  + "\n" + ironSword);






    goldenSword.slash();
    goldenSword.cut();
    goldenSword.cut(goldenSword.sharpness.endsWith("Sharp"));

ironSword.slash();
ironSword.cut();
ironSword.cut(ironSword.sharpness.endsWith("Sharp"));

  }
}
