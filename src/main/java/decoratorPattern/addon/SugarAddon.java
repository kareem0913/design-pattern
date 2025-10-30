package decoratorPattern.addon;

import decoratorPattern.Coffee;

public class SugarAddon extends Addon{
    public SugarAddon(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return super.description() + ", sugar";
    }

    @Override
    public double price() {
        return super.price() + 0.5;
    }
}
