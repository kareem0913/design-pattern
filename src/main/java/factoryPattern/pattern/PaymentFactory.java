package factoryPattern.pattern;

import factoryPattern.payment.PaymentStrategy;

public interface PaymentFactory {
    PaymentStrategy create();
}