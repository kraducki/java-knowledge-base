package constructors;

public class Dog {
    String name;
    int age;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // create a private constructor to make a class not be abled to create new object!
}
