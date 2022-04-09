package projects;

import java.util.Arrays;

public class Project07 {
  public static void main(String[] args) {
    String[]arr = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
    String[]arr6 = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
    int[] arr1 = {10, 7, 7, 10 -3, 10, -3};
    int[] arr4 = {10, 7, 7, 10 -3, 10, -3};
    int[] arr3 = {10, 5, 6, 7, 8, 5, 15, 15};
    int[] arr2 = {10, 5, 6, 7, 8, 5, 15, 15};
   findSecondGreatestAndSmallest(arr2);
    findGreatestAndSmallestWithSort1(arr3);
    findGreatestAndSmallest(arr4);
   findGreatestAndSmallestWithSort(arr1);
    findDuplicatedElementsInAnArray(arr6);
    findMostRepeatedElementInAnArray( arr);

    }

  public static void findGreatestAndSmallestWithSort(int[] args) {
    Arrays.sort(args);
    System.out.println("Smallest = " + args[0]);
    System.out.println("Greatest = " + args[args.length - 1]);



  }

  public static void findGreatestAndSmallest(int[] num) {
    int max = 0;
    int min = 0;
    for (int i=0; i < num.length; i++) {
      if (num[i] > max) {
        max = num[i];
      } if (min > num[i]) {
        min = num[i];
      }
    }
      System.out.println("Smallest = " + min);
      System.out.println("Greatest = " + max);



  }
    public static void findGreatestAndSmallestWithSort1 ( int[] numbers){
//      Arrays.sort(numbers);
//      int secondSmallest = 0;
//      int secondBiggest = 0;
//      for (int number : numbers) {
//        if (number != secondSmallest && number < secondSmallest) secondSmallest = number;
//        if (number != secondBiggest && number > secondBiggest) secondBiggest = number;
//      }
//      System.out.println(secondBiggest);
//      System.out.println(secondSmallest);
      int secondSmall = 0;
      int Big = 0;
      Arrays.sort(numbers);
      for(int i=0; i <= numbers.length; i++){
        if(numbers[numbers.length-1] != Big ){

        }

      }
      System.out.println("Smallest = " + numbers[1]);
      System.out.println("Greatest = " + numbers[numbers.length - 2]);



    }

      public static void findSecondGreatestAndSmallest ( int[] arr) {
        int minN = 0;
        int maxN = 0;
        for (int i : arr) {
          minN = Math.min(i + 1, minN);
        }
        for (int i : arr) {
          maxN = Math.max(i - 1, maxN);
        }
        System.out.println(maxN);
        System.out.println(minN);


        System.out.println();
      }


  public static void findDuplicatedElementsInAnArray(String[] str) {
    for (int i = 0; i < str.length; i++) {
      for (int j = i + 1; j < str.length; j++) {
        if (str[i].equals(str[j])) {
          System.out.println(str[j]);
        }
      }

    }

  }

    public static void  findMostRepeatedElementInAnArray(String[] str){
    Arrays.sort(str);
      int max = 0;
      int count = 1;
      String word = str[0];
      String word1 = str[0];
      for(int i=1; i<str.length; i++){
        if(str[i].equals(word1)){
          count++;
        }else{
          count=1;
          word1 = str[i];
        }
        if(max < count){
          max = count;
          word = str[i];
        }
      }
      System.out.println(word);

      /*

 public static void findMostRepeatedElementInAnArray(String[] arr){
        String mostCountedWord = "";
        int mostCountedTimes = 0;

        ArrayList<String> countedElements = new ArrayList<>();

        for (int i = 0; i <= arr.length-1; i++) {
            String word = arr[i];
            int countOfWord = 0;

            if(!countedElements.contains(word)){
                for (String w : arr) {
                    if(word.equals(w)) countOfWord++;
                }

                if(countOfWord > mostCountedTimes){
                    mostCountedWord = word;
                    mostCountedTimes = countOfWord;
                }
                countedElements.add(word);
            }
        }

        System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");
    }



      */




    }
    }



