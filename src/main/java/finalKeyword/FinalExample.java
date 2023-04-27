package finalKeyword;

public class FinalExample {

    // you can create a static final variable to hold some constant and access it from anywhere
    public static final double PI = 3.14;

    public static void main(String[] args) {

        // when a variable is final, it can be assigned only once!
        final Dog myDog = new Dog();
        myDog.eat();

        // so it won't work
//        Dog myDog = new Dog();
    }
}
