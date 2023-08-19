package exceptions;

public class UncheckedException {

    public static void main(String[] args) {
        String name = null;
        printLength(name);
    }

    private static void printLength(String myString) {
        // No error from Java there
        // NullPointerException is being thrown
        // You should add some try catch block
        System.out.println(myString.length());
    }
}
