package errays;

import java.util.Arrays;

public class TwoDimensionalArrays {
  public static void main(String[] args) {


    String[][] studentGroups = {
      {"Kaly","Gulizar","Melda"},
      {"Torrie", "David"},
      {"abe", "Data"}
    };

    System.out.println(studentGroups[0][1]);
    System.out.println(studentGroups[1][0]);
    System.out.println(studentGroups[1][1]);

    //how to get the size of the studentGrope
    System.out.println(studentGroups.length);

    //how to get the size of the secound grope
    System.out.println(studentGroups[1].length);

    //how to print the third grope
    System.out.println(Arrays.toString(studentGroups[2]));

    //how to print all
    System.out.println(Arrays.deepToString(studentGroups));

    //how to print each groupe in seperate lines

    for (int i = 0; i < studentGroups.length; i++) {
      System.out.println(Arrays.toString(studentGroups[i]));
    }
// printing each gropes with with for each loop
    for (String[] studentGroup : studentGroups) {
      System.out.println(Arrays.toString(studentGroup));
    }

    for (int i = 0; i < studentGroups.length; i++) {
      for(int j = 0; j < studentGroups[i].length; j++) {
        System.out.println(studentGroups[i][j]);
      }
    }


    //printing all members with for each loop
    for (String[] group : studentGroups) {
      for(String member : group){
        System.out.println(member);
      }
    }



  }
}
