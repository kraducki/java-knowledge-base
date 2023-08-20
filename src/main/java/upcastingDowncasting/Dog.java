package upcastingDowncasting;

public class Dog extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Dog noise");
    }

    public void growl() {
        System.out.println("grrrr");
    }
}
