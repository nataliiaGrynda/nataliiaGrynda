package projects;


import java.util.Scanner;

public class Project05 {
  public static void main(String[] args) {

    System.out.println("_____Task1____");
    System.out.println("Please enter a string");
    Scanner userInput = new Scanner(System.in);
    String str = userInput.nextLine();
    if (str.length() < 8) {
      System.out.println("This string does not have 8 characters");
    } else {

    }
    String endFour = str.substring(str.length() - 4);
    String begin = str.substring(0, str.length() / 2 - 1);
    String middle = str.substring(str.length() / 2 - 1, str.length() - 4);
    System.out.println(endFour + middle + begin);


    System.out.println("____Task2____");
    System.out.println("Please enter a sentence");

    String str_2 = userInput.nextLine();
    if (str_2.length() <= 2) {
      System.out.println("This sentence does not have 2 or more words to swap");
    } else {
    }
    String end = str_2.substring(str_2.lastIndexOf(' ') + 1);
    String beginS = str_2.substring(0, str_2.indexOf(' '));
    String middleS = str_2.substring(str_2.indexOf(' '), str_2.lastIndexOf(' '));
    System.out.println(end + middleS + " " + beginS);


    System.out.println("____Task3____");

    String rWord = "These book are so stupid";
    String rWord1 = "I like idiot behaviors";
    String rWord2 = "I had some stupid t-shirts in the past and also some idiot look shoes";
    System.out.println(rWord.replace("stupid", "nice"));
    System.out.println(rWord1.replace("idiot", "nice"));
    System.out.println(rWord2.replace("stupid", "nice").replace("idiot", "nice"));


    System.out.println("____Task5____");

    System.out.println("Please enter a country");
    String country = userInput.nextLine();
    if (country.length() < 5) {
      System.out.println("Invalid input");
    } else {

      System.out.println(country.substring(country.length() - 2).substring(0, 2));

    }

    System.out.println("____Task4____");

    System.out.println("Please enter your name");
    String name = userInput.nextLine();
    int name1 = name.length();
    if (name1 < 2) {
      System.out.println("Invalid input!!!");
    } else if (name.length() % 2 == 1) {
      System.out.println(name.substring(0, name.length() / 2).substring(name.length() - 1));
    } else if (name.length() % 2 == 0) {
      System.out.println(name.substring(0, name.length() / 2 - 1));
    }

    System.out.println("____Task6____");

    System.out.println("Please enter full address");
    String address = userInput.nextLine();
    System.out.println(address.replace("a", "*").replace("A", "*").replace('e',
      '#').replace('E', '#').replace('i', '+').replace('I',
      '+').replace('u', '$').replace('U', '$').replace('o', '@')
      .replace('O', '@'));

    System.out.println("____Task7____");
    int randomNum = 0;
    int randomNum2 = 0;
    for (int i = 0; i <= 25; i++) {
      if (i % 5 == 0) {
        System.out.println(randomNum + randomNum2);

      }

    }
  }

}

