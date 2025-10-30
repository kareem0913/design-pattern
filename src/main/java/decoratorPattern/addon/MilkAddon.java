package decoratorPattern.addon;

import decoratorPattern.Coffee;

public class MilkAddon extends Addon {
    public MilkAddon(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return super.description() + ", milk";
    }

    @Override
    public double price() {
        return super.price() + 1.5;
    }
}
