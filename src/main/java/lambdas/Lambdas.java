package lambdas;

public class Lambdas {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        printThing(myCat);

        //But, it can also be done without an object, but with lambda:
        printThing(
                (suffix) -> {
                    System.out.println("meow" + suffix);
                }
        );
    }
    static void printThing(Printable thing) {
        thing.print("!");
    }
}
