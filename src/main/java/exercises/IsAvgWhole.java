package exercises;

public class IsAvgWhole {

    // Create a function that takes an array as an argument
    // and returns true or false depending on whether the average of all elements in the array is a whole number or not.

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int sum = 0;

        for (int i : arr) {
            sum = sum + i;
        }

        double avg = (double) sum / arr.length;


        // return avg % 1 == 0;

    }
}
