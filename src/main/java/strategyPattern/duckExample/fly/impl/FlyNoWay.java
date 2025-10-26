package strategyPattern.duckExample.fly.impl;

import strategyPattern.duckExample.fly.FlayBehavior;

public class FlyNoWay implements FlayBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
