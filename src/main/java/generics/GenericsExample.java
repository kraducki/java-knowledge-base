package generics;

import java.util.ArrayList;

public class GenericsExample {

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> printerD = new Printer<>(2.3);
        printerD.print();

        // The most popular usage of generics is Collection framework
        ArrayList<String> arrayList = new ArrayList<>();

        // Use method as well
        shout("Boo!");
    }

    // There can also be generic methods
    private static <T> void shout (T thingToShout) {
        System.out.println(thingToShout);
    }
}
