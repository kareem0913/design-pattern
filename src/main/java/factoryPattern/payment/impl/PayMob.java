package factoryPattern.payment.impl;

import factoryPattern.payment.PaymentStrategy;

public class PayMob implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid with PayMob : " + amount);
    }
}
