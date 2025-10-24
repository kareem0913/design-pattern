package strategyPattern.paymentExample;

import strategyPattern.paymentExample.strategy.impl.PaymobStrategy;
import strategyPattern.paymentExample.strategy.impl.PaypalStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new PaymobStrategy());
        paymentContext.pay(100);

        paymentContext.setPaymentStrategy(new PaypalStrategy());
        paymentContext.pay(100);
    }
}
