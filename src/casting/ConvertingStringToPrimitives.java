package casting;

public class ConvertingStringToPrimitives {

    public static void main(String[] args){





        String num1 = "23";
        String num2 = "12";

        int num1Int = Integer.parseInt(num1);// string converted into int
        int num2Int = Integer.parseInt(num2);// returns primitive

        System.out.println(num1 + num2);
        System.out.println(num1Int + num2Int);


        Integer num1Integer= Integer.valueOf(num1);// returns wrapper class
        Integer num2Integer = Integer.valueOf(num2);// string into integer

        System.out.println(num1 + num2);
        System.out.println(num1Int + num2Int);
        System.out.println(num1Integer + num2Integer);

        int num1IntValueOf = Integer.valueOf(num1);



       // String string = "";
        //WrapperClass varioableName = WrapperClass.valueOf(string);
    }



}
