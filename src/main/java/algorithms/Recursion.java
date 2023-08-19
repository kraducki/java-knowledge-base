package algorithms;

public class Recursion {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println(recursionArr(arr, arr.length - 1));
    }

    private static int recursionArr(int[] arr, int pivot) {

        if (pivot < 0) {
            return 0;
        } else {
            return recursionArr(arr, pivot - 1) + arr[pivot];
        }
    }
}
