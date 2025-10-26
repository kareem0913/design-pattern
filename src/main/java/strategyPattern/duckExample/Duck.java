package strategyPattern.duckExample;

import strategyPattern.duckExample.fly.FlayBehavior;
import strategyPattern.duckExample.quack.QuackBehavior;

public abstract class Duck {
    private final FlayBehavior flayBehavior;
    private final QuackBehavior quackBehavior;

    public Duck(FlayBehavior flayBehavior, QuackBehavior quackBehavior) {
        this.flayBehavior = flayBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        flayBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    abstract void display();
}
