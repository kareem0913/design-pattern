package strategyPattern.duckExample.quack.impl;

import strategyPattern.duckExample.quack.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking");
    }
}
