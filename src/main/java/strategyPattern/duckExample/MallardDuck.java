package strategyPattern.duckExample;

import strategyPattern.duckExample.fly.FlayBehavior;
import strategyPattern.duckExample.quack.QuackBehavior;

public class MallardDuck extends Duck{
    public MallardDuck(FlayBehavior flayBehavior, QuackBehavior quackBehavior) {
        super(flayBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Mallard duck");
    }
}
