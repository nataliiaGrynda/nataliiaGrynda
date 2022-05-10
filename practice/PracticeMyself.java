package practice;
public class PracticeMyself {
  public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
//    System.out.println("Please enter 3 numbers");
//     int num = input.nextInt();
//     int num1 = input.nextInt();
//     int num2 = input.nextInt();
//    System.out.println("The product of the numbers entered is = " + num * num1 * num2);

    String str = "James";
    if(str.length() < 2 ){
      System.out.println("Invalid input");
    }else if(str.length() % 2 == 1){
      System.out.println(str.substring(str.length()/2).substring(str.length()-1));
    }else if (str.length() % 2 == 2){
      System.out.println(str.substring(str.length()/ 2 -1 ));
    }







  }
}
