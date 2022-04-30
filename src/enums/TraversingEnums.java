package src.enums;

public class TraversingEnums {
  public static void main(String[] args) {


    for(Day day: Day.values()){
      System.out.println(day);
    }


// traverse the month

   for(Constants.Month month: Constants.Month.values()){
     System.out.println(month);
   }


   for(Day days: Day.values()){
     System.out.println(days);
   }



  }
}
