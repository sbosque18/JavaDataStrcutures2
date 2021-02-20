package dataStrutctures2;

public class Methods {
    //Write a program to sum all the values of a given Array in Java.
    public static double sumDouble(double[] numbers){
        double d = 0;
        for(int i=0; i < numbers.length; i++){
            d+=numbers[i];
        }
        return d;
    }

    //Write a public static method called "toPower" that takes in as parameters two integers called size and power.
    // The method should return an array of size "size" with each array index raised to the value of "power."
    // So, for example, if we passed in "size = 4" and "power = 2" to the "toPower,"
    // the method should return the following result: [0,1,4,9].
    public static int[] toPower(int size, int power){
        int[] numbers = new int[size];
        for(int i=0; i<numbers.length; i++){
            numbers[i]=(int)Math.pow((double)i, (double)power);
        }
        return numbers;
    }
}