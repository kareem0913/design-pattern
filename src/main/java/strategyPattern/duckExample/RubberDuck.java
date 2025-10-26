package strategyPattern.duckExample;

import strategyPattern.duckExample.fly.FlayBehavior;
import strategyPattern.duckExample.quack.QuackBehavior;

public class RubberDuck extends Duck{
    public RubberDuck(FlayBehavior flayBehavior, QuackBehavior quackBehavior) {
        super(flayBehavior, quackBehavior);
    }

    @Override
    void display() {
        System.out.println("Rubber duck");
    }
}
