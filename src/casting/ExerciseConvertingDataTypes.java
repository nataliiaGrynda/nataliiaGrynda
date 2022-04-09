package casting;

public class ExerciseConvertingDataTypes {

    public static void main(String[] args){

        String num1 = "23";
        String num2 = "25";

        int num1Int = Integer.parseInt(num1);
        int num2Int = Integer.parseInt(num2);

        Integer num1Integer = Integer.valueOf(num1);
        Integer num2Integer = Integer.valueOf(num2);


        System.out.println("Avg with int is = " + (num1Int + num2Int) / 2);
        System.out.println("Avg with Integer is = " + (num1Integer + num2Integer) / 2);



        String save = "390";
        String day = "15.60";

        double saveDouble = Double.parseDouble(save);
        double dayDouble = Double.parseDouble(day);

        System.out.println((int)(saveDouble / dayDouble) );









    }
}
