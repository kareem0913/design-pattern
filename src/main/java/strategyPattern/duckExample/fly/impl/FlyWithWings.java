package strategyPattern.duckExample.fly.impl;

import strategyPattern.duckExample.fly.FlayBehavior;

public class FlyWithWings implements FlayBehavior {
    @Override
    public void fly() {
        System.out.println("Flaying with wings");
    }
}
