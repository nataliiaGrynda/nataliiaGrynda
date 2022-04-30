package src.date_practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {
  public static void main(String[] args) {


    Date currentDate = new Date();
    System.out.println(currentDate);// 1gives the current timing

    //MM/dd/yyyy

    SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");
    System.out.println("Today is = " + sdf.format(currentDate));

   // print date in the format of Sat hh:mm PM


    SimpleDateFormat date = new SimpleDateFormat("EEEE, hh:mm a");
    System.out.println(date.format(currentDate));

    System.out.println(new SimpleDateFormat("EEEE").format(currentDate));
    System.out.println(new SimpleDateFormat("yyyy").format(currentDate));




  }
}
