package collectionsFramework;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map_Methods {
  public static void main(String[] args) {


    HashMap<String, String> favorites = new HashMap<>();// doesn't sort
    favorites.put("Day", "Friday");
    favorites.put("Color", "Black");
    favorites.put("City", "Chicago");
    favorites.put("Car", "Lexus");
    favorites.put("Pet", "Turtle");
    //keys: Day, color, city...
    //values:friday, black....


    Set<String> keys = favorites.keySet();// getting keys... set because uniques
    System.out.println(keys);

    Collection<String> values = favorites.values();// getting the value
    System.out.println(values);

    System.out.println(values.stream().filter(element -> element.length()> 5).count());//3
    System.out.println(values.stream().filter(element -> element.toLowerCase().startsWith("c")).count());// 1

  /*
  entry = key-value

   */








  }
}
