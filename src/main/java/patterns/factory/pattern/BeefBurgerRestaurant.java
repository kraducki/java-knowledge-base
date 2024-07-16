package patterns.factory.pattern;

import patterns.factory.antipattern.BeefBurger;
import patterns.factory.antipattern.Burger;

public class BeefBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
