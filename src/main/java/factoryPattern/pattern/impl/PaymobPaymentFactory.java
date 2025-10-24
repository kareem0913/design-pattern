package factoryPattern.pattern.impl;

import factoryPattern.pattern.PaymentFactory;
import factoryPattern.payment.PaymentStrategy;
import factoryPattern.payment.impl.PayMob;

public class PaymobPaymentFactory implements PaymentFactory {
    @Override
    public PaymentStrategy create() {
        return new PayMob();
    }
}
