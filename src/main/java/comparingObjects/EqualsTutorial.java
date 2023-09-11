package comparingObjects;

public class EqualsTutorial {

    public static void main(String[] args) {
        // This is the easiest solution to compare primitives:
        int int1 = 1;
        int int2 = 2;

        if(int1 == int2) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }

        // But when it comes to Objects, for example Strings, things are getting not so easy:
        // These Strings are not identical, however they look like they are:
        String str1 = new String("hello");
        String str2 = new String("hello");

        // Java is checking memory location of these objects, not their value
        if(str1 == str2) {
            System.out.println("Strings are equal!");
        } else {
            System.out.println("Strings are not equal!");
        }

        // For objects, use .equals method
        if(str1.equals(str2)) {
            System.out.println("Strings are equal!");
        } else {
            System.out.println("Strings are not equal!");
        }

        // For your own Objects, each must implement its own .equals method!!

        // Funny fact, comparing these Strings by "==" will work:
        String str3 = "hello";
        String str4  = "hello";
    }
}
