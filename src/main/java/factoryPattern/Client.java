package factoryPattern;

import factoryPattern.pattern.PaymentFactory;
import factoryPattern.payment.PaymentStrategy;

public class Client {
    PaymentStrategy paymentStrategy;

    public Client(PaymentFactory paymentFactory) {
        this.paymentStrategy = paymentFactory.create();
    }

    public void pay(int amount){
        this.paymentStrategy.pay(amount);
    }
}
