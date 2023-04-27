package multithreading;

public class Multithreading {

    // Multithreading is the ability to execute multiple different paths of code in the same time.
    // Normally programs run with one thread
    // If any of threads blows any exception, it does not affect other threads. Demonstration - Thread 3

    public static void main(String[] args) {
        MultithreadThing myThing = new MultithreadThing(1);
        MultithreadThing myThing2= new MultithreadThing(2);
        MultithreadThing myThing3= new MultithreadThing(3);
        myThing.start();
        myThing2.start();
        myThing3.start();
    }
}
