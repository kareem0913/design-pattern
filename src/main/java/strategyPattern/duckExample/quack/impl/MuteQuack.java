package strategyPattern.duckExample.quack.impl;

import strategyPattern.duckExample.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute quack");
    }
}
