package abstractClassAndMethods;

public class AbstractClasses {
    // You can't instantiate abstract class

    public static void main(String[] args) {
        Cat cat = new Cat();
    }

    // What is the difference between abstract class and interface?
    // - one class can be inherited, but many interfaces can be implemented
    // - fields in interfaces are static and final
}
