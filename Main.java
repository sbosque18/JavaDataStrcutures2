package dataStrutctures2;

public class Main {
    public static void main(String[] args) {
        //2, What is the output?
        //Technically true answer: does not compile b/c of syntax errors
        //The real answer; returns the position of the largest element
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

            if (exampleArray[ i ] > maximum) {

                maximum = exampleArray[ i ];

                index = i;

            }

        }

        System.out.println(index);

        //testing for sum
        System.out.println(Methods.sumDouble(exampleArray) +"\n\n\n=====");

        //testing for topowers
        int[] array = Methods.toPower(4, 3);
        for(int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }

    }
}