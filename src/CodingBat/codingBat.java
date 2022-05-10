package src.CodingBat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class codingBat {

  public String[] mergeTwo(String[] a, String[] b, int n) {
    // ["a", "c", "z"], ["a", "b", "c", "z"], 3) → ["a", "b", "c"]
    // no duplicate, sort
    // TreeSet
    TreeSet<String> ab = new TreeSet<>(Arrays.asList(a));
    ab.addAll(Arrays.asList(b));
    return Arrays.copyOf(ab.toArray(new String[0]), n);
  }


  public int userCompare(String aName, int aId, String bName, int bId) {
    // "aa".compareTo("aa") --> 0
    // aId =5, bId =1;  return 1
    // "aa".compareTo("bb") --> negative
    // "bb".compareTo("zz") --> negative
    if( aName.compareTo(bName) > 0 || aId > bId) return 1;
    else if( aName.compareTo(bName) < 0 || aId < bId) return -1;
    return 0;
  }


  public int scoresAverage(int[] scores) {
    return Math.max(
      average(scores, 0, scores.length/2),
      average(scores, scores.length/2, scores.length)
    );
  }
  int average(int[] scores, int start, int end) {
    //[3, 4, 5, 1, 2, 3] | s = 3, e= 6
    int avg = 0;
    for(int i = start; i < end; i++) avg += scores[i];
    return avg / (end - start);
  }

  public int scoreUp(String[] key, String[] answers) {
    // key                    answers
    //["a", "a", "b", "b"], ["c", "?", "b", "b"]) → 7
    // index,key,value
    // i= 0, "a"|"c" --> -1
    // i= 1, "a"|"?" --> 0
    // i= 2, "b"|"b" --> +4
    // i= 3, "b"|"b" --> +4
    int scores = 0;
    for(int i = 0; i < key.length; i++){
      if(key[i].equals(answers[i])) scores += 4;
      else if(!answers[i].equals("?")) scores--;
    }
    return scores;
  }

  public int sumHeights(int[] heights, int start, int end) {
//i= 0, 1, 2, 3, 4             1 + 5
// ([5, 3, 6, 7, 2], 2, 4) →
//6 > 7 > 2
// sum = 0
// sum += abs(heigths[2] - heights[3])
// sum += abs(heigths[3] - heights[4])
// ([5, 3, 6, 7, 2], 0, 1) → 5 > 3
// ([5, 3, 6, 7, 2], 0, 4) → 5 > 3 > 6 > 7 > 2
    int sum = 0;
    for(int i = start; i < end;i++)sum += Math.abs(heights[i] - heights[i + 1]);
    return sum;
  }

  public int commonTwo(String[] a, String[] b) {
    //(["a", "a", "b", "b", "c"],
    //["b", "b"]) → 1
    HashSet<String> a1 = new HashSet<>();
    for (int i=0; i< a.length; i++){
      for (int j = 0; j<b.length; j++){
        if (a[i]==b[j]) a1.add(a[i]);
      }
    }return a1.size();

//    int count =0;
//    String ans = "";
//    for (int i = 0; i < a.length; i++)
//      for (int j = 0; j<b.length; j++)
//        if (a[i] == b[j] && a[i] != ans){
//          ans = b[j];
//          count++;
//          break;
//        }
//    return count;
  }















}
