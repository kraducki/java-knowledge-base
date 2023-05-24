package polymorphism;

public class Dog extends Animal{
    private int breed;

    @Override
    public void eat() {
        System.out.println("yummy (as a dog)");
    }

    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }
}
