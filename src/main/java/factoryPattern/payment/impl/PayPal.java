package factoryPattern.payment.impl;

import factoryPattern.payment.PaymentStrategy;

public class PayPal implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid with PayPal : " + amount);
    }
}
