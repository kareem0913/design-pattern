package factoryPattern;

import factoryPattern.pattern.impl.PaybalPaymentFactory;
import factoryPattern.pattern.impl.PaymobPaymentFactory;
import factoryPattern.payment.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new PaymobPaymentFactory());
        client.pay(100);

        client = new Client(new PaybalPaymentFactory());
        client.pay(100);

        // Simple Factory
        PaymentSimpleFactory paymentSimpleFactory = new PaymentSimpleFactory();
        PaymentStrategy paymob = paymentSimpleFactory.create("paymob");
        paymob.pay(9000);

        PaymentStrategy payPal = paymentSimpleFactory.create("paybal");
        payPal.pay(9000);
    }
}
