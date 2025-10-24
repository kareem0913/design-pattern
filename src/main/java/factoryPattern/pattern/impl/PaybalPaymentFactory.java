package factoryPattern.pattern.impl;

import factoryPattern.pattern.PaymentFactory;
import factoryPattern.payment.PaymentStrategy;
import factoryPattern.payment.impl.PayPal;

public class PaybalPaymentFactory implements PaymentFactory {
    @Override
    public PaymentStrategy create() {
        return new PayPal();
    }
}
