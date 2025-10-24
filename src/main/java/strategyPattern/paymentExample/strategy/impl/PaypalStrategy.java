package strategyPattern.paymentExample.strategy.impl;

import factoryPattern.payment.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid with paypal : " + amount);
    }
}
