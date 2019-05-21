package ac.ca.cput.factory.admin;

import ac.ca.cput.model.admin.Payment;

public class PaymentFactory {
    public static Payment getPayment(String paymentId) {
        return new Payment.Builder().paymentId(paymentId)
                .build();
    }
}