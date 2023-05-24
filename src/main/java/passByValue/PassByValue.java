package passByValue;

public class PassByValue {
    public static void main(String[] args) {
        Cheese myCheese = new Cheese();
        myCheese.setLevelOfStinkiness(10);
        increaseLevel(myCheese);

        System.out.println(myCheese.getLevelOfStinkiness());

        // myCheese variable does not hold the object, just a reference to this object
        // it holds a place in a memory where the cheese object is stored

    }

    private static void increaseLevel(Cheese cheese) {
        cheese.setLevelOfStinkiness(cheese.getLevelOfStinkiness() + 1);
    }

    // here basically this method passes the place in a memory to cheese object
    // it looks like we passed a reference to that object
    // but no, we passed a value which is a place in a memory of that object
}
