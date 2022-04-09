package mathClass;

public class FindRandom {
    public static void main(String[] args ){


       double random =  Math.random();// 0.0 ---- 0.9999
        double random0And10Included = Math.random() * 11; // 0-999

        System.out.println(random);


        int random0And20Included = (int)(Math.random() * 21);
        System.out.println(random0And20Included);

        int random10And20Included = (int)(Math.random() * 11) + 10; //10 -20
        System.out.println(random10And20Included);


        // create a random number between 103 - 346 included take that as an input
        //get the difference--> 346 - 103 = 243 add +1
        //multiply it by 243 +1 = 244
        // add the starting point to the equation
        //random * (end point  - start point +1) + start point --> included

        int random103And246Included = (int) (Math.random()* 244) + 103;
        System.out.println(random103And246Included);


        int random_50And50Included = (int)(Math.random() * 101)  - 50;
        System.out.println(random_50And50Included);





    }
}
