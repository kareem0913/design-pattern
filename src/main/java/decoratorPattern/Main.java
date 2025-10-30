package decoratorPattern;

import decoratorPattern.addon.MilkAddon;
import decoratorPattern.addon.SugarAddon;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new MilkAddon(new SugarAddon(new PlainCoffee()));
        System.out.println(coffee.description() + " " + coffee.price());
    }
}
