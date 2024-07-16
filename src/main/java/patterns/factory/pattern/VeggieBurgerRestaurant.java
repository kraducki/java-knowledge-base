package patterns.factory.pattern;

import patterns.factory.antipattern.Burger;
import patterns.factory.antipattern.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
