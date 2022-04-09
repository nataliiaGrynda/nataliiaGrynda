package mathClass;

public class FindMax {
    public static void main(String[] args){


        int x = 8;
        int y = 20;
int z = 12_345;
int a = 34;
int b = 123;

        int maxValueOfXY = Math.max(x, y);// char can be put as well
 int maxValueofXYZ = Math.max(maxValueOfXY, z);

        System.out.println(maxValueOfXY);
        System.out.println(maxValueofXYZ);


        int num1 = 6;
        int num2 = 53;
        int num3 = 23;

        Math.max(num1, num2);// --->53 returnes the max num
        Math.max(Math.max(num1, num2), num3);


        Math.min(num1, num3); // 23
        Math.min(Math.min(num1, num3), num2);











    }
}
