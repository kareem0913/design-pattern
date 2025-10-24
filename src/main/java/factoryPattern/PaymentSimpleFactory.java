package factoryPattern;

import factoryPattern.payment.PaymentStrategy;
import factoryPattern.payment.impl.PayMob;
import factoryPattern.payment.impl.PayPal;

public class PaymentSimpleFactory {
    public PaymentStrategy create(String type){
        return switch (type) {
            case "paymob" -> new PayMob();
            case "paybal" -> new PayPal();
            default -> throw new IllegalArgumentException("Invalid type");
        };
    }
}
