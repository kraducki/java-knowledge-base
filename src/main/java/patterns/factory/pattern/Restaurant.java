package patterns.factory.pattern;

import patterns.factory.antipattern.Burger;

public abstract class Restaurant {
    public patterns.factory.antipattern.Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();
}
