package errays;

import java.util.Arrays;

public class _Practice_String_Array {
  public static void main(String[] args)  {

    /*
    create a string array and store below data
    name will be students
     */
    String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
    System.out.println("Unsorted arrays = " + Arrays.toString(students));
    Arrays.sort(students);
    System.out.println("Sorted arrays = " + Arrays.toString(students));

    /*
    print the first and last names after it is sorted
     */
    System.out.println("First name is = " + students[0] + " " + students[students.length - 1]);
    System.out.println("last name = " + students[students.length - 1]);


    /*
    task 3
    count how many name stars with A
     */
    int count = 0;
    for (int i = 0; i < students.length; i++) {
      if (students[i].charAt(0) == 'A') count++;
      {

      }
      System.out.println(count);
    }
    int count1 = 0;
    for (String student : students) {/// for each loop
      if (student.charAt(0) == 'A') count1++;

    }
    System.out.println(count1);


    System.out.println("---task4----");

    int count5 = 0;
    for (String student : students) {
      //  if(student.contains("a") || student.contains("A")|| student.contains("e") || student.contains("E")){
      // if(student.toUpperCase().contains("A") || student.toUpperCase().contains("E")) count5++;
    }
    System.out.println(count5);


      /*
      count how many names contains a-A OR e-E
       */

    int count3 = 0;
    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i].toUpperCase().contains("A") || students[i].toUpperCase().contains("E"));
      count3++;
    }
    System.out.println(count3);

    System.out.println("task5 ______");
/*
count how many characters has at least 5 characters
 */
    int countLength5 = 0;
    for (String student : students) {
      if (student.length() >= 5) countLength5++;
    }
    System.out.println(countLength5);


    System.out.println("____Task6_____");
    /*
    check if this arrey has a element that is equal to jennifer

   boolean hasJennifer = false;
    for(String student : students){
      if(student.equalsIgnoreCase("Jennifer"))  {
     hasJennifer= true;break;
      }
    }
    System.out.println(hasJennifer);


     */
    int count7 = 0;
    for (String student : students) {
      if (student.equalsIgnoreCase("Jennifer")) count7++;
    }
    System.out.println(count > 0);
  }
}