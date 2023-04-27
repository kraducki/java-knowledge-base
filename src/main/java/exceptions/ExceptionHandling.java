package exceptions;

public class ExceptionHandling {

    // Usually try to have try/catch block when calling the method that throws an exception

    public static void main(String[] args) {
        try {
            getInt();
            System.out.println("After parsing int - this will not be shown");
        }
        catch (NumberFormatException | NullPointerException e) {
            System.out.println("Integer spotted!");
        }
        finally {
            // Finally is ALWAYS executed
            System.out.println("Finally block");
        }
        System.out.println("End here");
    }

    private static void getInt() {
        int myInt = Integer.parseInt("pants");
    }
}
