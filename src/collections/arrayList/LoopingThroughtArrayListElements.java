package collections.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LoopingThroughtArrayListElements {
  public static void main(String[] args) {


    List<Character> chars = new ArrayList<>();
    chars.add('D');
    chars.add('A');
    chars.add('B');
    chars.add('C');

    Collections.sort(chars);
    System.out.println(chars);


    for (int i = 0; i < chars.size(); i++) {
      System.out.println(chars.get(i));
    }

    for (Character element : chars) {
      System.out.println(element);
    }






  }
}
