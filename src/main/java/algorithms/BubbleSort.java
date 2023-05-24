package algorithms;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[1000000];

        for(int i = 0; i < numbers.length ; i++) {
            numbers[i] = rand.nextInt(10000);
        }

        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));

        // Sorting algorithm here
        boolean swappedSomething = true;

        while (swappedSomething) {

            swappedSomething = false;
            for(int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i] > numbers[i + 1]) {
                    swappedSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));
    }
}
