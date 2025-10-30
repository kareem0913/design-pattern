package decoratorPattern;

public class PlainCoffee implements Coffee {
    @Override
    public String description() {
        return "plain coffee";
    }

    @Override
    public double price() {
        return 5.3;
    }
}
