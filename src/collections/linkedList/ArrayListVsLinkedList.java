package collections.linkedList;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
  public static void main(String[] args) {

    LinkedList<Double> numbers = new LinkedList<>();
    //when remove an element it doesnt shift. we jast have to remove update 2 element one is on the left one is on the right
    numbers.add(10.5);
    numbers.add(12.5);
    numbers.add(13.3);
    numbers.add(17.7);
    System.out.println(numbers);

    for (Double d : numbers) {
      System.out.println(d);
    }

    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }




    System.out.println(numbers.get(0));
    System.out.println(numbers.getFirst());
    System.out.println(numbers.getLast());


    System.out.println("_____ some additions methods of linked list______");

    System.out.println(numbers.peek()); // get the first element 10.5
    System.out.println(numbers.peekFirst()); // get the first element 10.5
    System.out.println(numbers.peekLast());// gets the last number

    System.out.println(" _____ poll method _____");

    System.out.println(numbers.poll());// retrieves the first element and removes it
    System.out.println(numbers.pollFirst());
    System.out.println(numbers.pollLast());
    System.out.println(numbers);


    System.out.println("______push void method");

  numbers.push(5.7);// adds the object to the first index(0)
    numbers.push(8.9);
    System.out.println(numbers.pop());// removes the first element like poll()
    System.out.println(numbers);





  }
}
