package exercises;

public class WhiteBoardQuestions {
  public static void main(String[] args) {

    /*
    find max and second max from the array
     */

    int[] nums = {4,5,64,345,36,74,32};



    int max = Integer.MIN_VALUE;
    int secoundMax = Integer.MIN_VALUE;

    for(int i = 0; i <nums.length;i++){
      if(max < nums[i]) max = nums[i];

          }for(int i = 0; i < nums.length;i++){
      if(nums[i] != max && secoundMax < nums[i]) secoundMax = nums[i];
    }
    System.out.println(max);
    System.out.println(secoundMax);


  }
}
