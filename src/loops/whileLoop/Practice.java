package loops.whileLoop;

public class Practice {
  public static void main(String[] args) {

                                System.out.println(" i loop");

    for (int i = 1; i <= 100; i++) {
      if (i % 2 != 0 && i % 3 != 0) {
        System.out.println(i);
      }
    }
                               System.out.println("while");
    int start = 1;
    while (start < 101) {
      if (!(start % 2 != 0 || start % 3 == 0)) {
        start++;
      }
    }
                               System.out.println("do while");

    int count = 1;
    do {
      if (count % 2 != 0 && count % 3 != 0) System.out.println(count);
      count++;
    } while (count <= 100);









  }
}
