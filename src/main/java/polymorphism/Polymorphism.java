package polymorphism;

public class Polymorphism {

    // Polymorphism means many forms = classes can do many things in different ways
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        // Dog inherits eat method, because it extends Animal class.
        Dog dog = new Dog();
        dog.eat();
        // We can override it and this is a form of polymorphism - same thing in different form. Dog eats in different form

        // There is also something like method overloading (not overriding, like above).
        // Methods in a class can have same name, but different parameters
        // Method overloading is also a part of Java polymorphism
    }
}
