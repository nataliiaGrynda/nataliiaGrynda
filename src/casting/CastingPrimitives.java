package casting;

public class CastingPrimitives {
    public static void main(String[] args){

        int myInt = 32;
        long myLong = myInt;  // implicit casting

        myInt = (int) myLong;// explicit casting




        int mySecondInt = 'b';  // implicit
        char myChar = (char) 56;// you don't have to cast because they are equal


        char mySecondChar = 56;

        int myThirtInt = (int) 45.4; // say the data type you want to convert to the other one

        short myShort = (short) myChar;
        char myThirdChar = (char) myShort;

        byte num1 = 45;
        int num2 = num1; // implicit

        //double num3 = 13,6;
       // float num4 = (float) num3;

        int num5 = 45;
        short num6 = 34;
        char c = (char)num5;// we have to cast for both cuz char should be positive everytime

        c = (char)num6;








    }



}
