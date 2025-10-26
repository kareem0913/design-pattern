package strategyPattern.duckExample;

import strategyPattern.duckExample.fly.impl.FlyNoWay;
import strategyPattern.duckExample.fly.impl.FlyWithWings;
import strategyPattern.duckExample.quack.impl.MuteQuack;
import strategyPattern.duckExample.quack.impl.Quack;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        System.out.println("=".repeat(25));

        Duck rubberDuck = new RubberDuck(new FlyNoWay(), new MuteQuack());
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
    }
}
