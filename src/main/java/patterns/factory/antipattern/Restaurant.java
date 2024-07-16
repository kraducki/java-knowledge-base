package patterns.factory.antipattern;

public class Restaurant {
    public Burger orderBurger(String request) {
        Burger burger = null;
        if ("BEEF".equals(request)) {
            burger = new BeefBurger();
        } else if ("VEGGIE".equals(request)) {
            burger = new VeggieBurger();
        }
        burger.prepare();
        return burger;
    }
}
