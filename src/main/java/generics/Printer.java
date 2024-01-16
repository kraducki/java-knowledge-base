package generics;

import superKeyword.Animal;

// Generis offer ability to have one class, which is flexible for many different types
public class Printer <T>{

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    void print() {
        System.out.println(thingToPrint);
    }
}
