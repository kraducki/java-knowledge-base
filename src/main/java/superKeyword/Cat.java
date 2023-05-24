package superKeyword;

public class Cat extends Animal{
    String catFoodPreference;

    // Super keyword allows us not to have code duplication with parent constructor
    public Cat(int age, String name, String catFoodPreference) {
        super(age, name);
        this.catFoodPreference = catFoodPreference;
    }

    @Override
    public void makeNoise() {
        // How to access parent's version of that method? Easy:
        super.makeNoise();

        System.out.println("I am cat");
    }
}
