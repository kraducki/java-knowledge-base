package algorithms;

import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(599);
        }

        System.out.println("Before: ");

    }

    private static void quickSort(int[] array, int lowIndex, int highIndex) {
        int pivot = highIndex;

//        for(int i = 0; )
    }
}
