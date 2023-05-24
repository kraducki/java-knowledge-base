package superKeyword;

public class Animal {
    int age;
    String name;

    public Animal() {};

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("I am Animal!");

    }

    public void eat() {
        System.out.println("munch munch");
    }
}
