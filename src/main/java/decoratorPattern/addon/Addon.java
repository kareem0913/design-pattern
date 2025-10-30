package decoratorPattern.addon;

import decoratorPattern.Coffee;

public abstract class Addon implements Coffee {
    private final Coffee coffee;

    public Addon(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return coffee.description();
    }

    @Override
    public double price() {
        return coffee.price();
    }
}
