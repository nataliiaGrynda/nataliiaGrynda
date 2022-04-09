package homework;

public class ExtraPractice {



    public static String luckyUnluckyGame ( int num){
      if (num == -11) return "You have hit the unlucky number";
      else if (num == 9) return "You hava hit the unlucky number";
      else if (num > -50 && num < 0) {
        return "The number is negative and more than -50";
      } else if (num == 0) {
        return "The number is 0";
      } else if (num > 0 && num < 50) {

        return "The number is positive and less than 50";
      }
      return "The number you provided is not good for this game";
    }



    public static void main(String[] args){
      System.out.println(luckyUnluckyGame(-11));

    }
  }

