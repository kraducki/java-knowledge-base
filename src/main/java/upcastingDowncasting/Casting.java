package upcastingDowncasting;

public class Casting {

    // What is upcasting / downcasting?
    // Upcasting is when you take an object and cast it to its superclass type (parent type)
    // Downcasting is when you take on object and you cast it to child class object

    public static void main(String[] args) {

        // Java will automatically upcast Dog to Animal
        // Upcasting will always work :) - there will be no issues with it
        Animal myAnimal = new Dog();

        // This won't work:
        // myAnimal.grown();

        // But it will work: (and this is why upcasting is useful)
        doAnimalStuff(myAnimal);
        // It also works:
        Dog myDog = new Dog();
        doAnimalStuff(myDog);
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();

        // Downcasting is different. It does not happen automatically
        Dog myDog = (Dog)animal;
        // It will work:
        myDog.growl();
        // But this is dangerous. When the object won't be a dog, an exception will be thrown
        // We can secure ourselves by using instanceof:
        if (animal instanceof Dog) {
            Dog mySecuredDog = (Dog)animal;
            mySecuredDog.growl();
        }

    }
}
