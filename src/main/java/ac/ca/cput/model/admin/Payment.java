package ac.ca.cput.model.admin;

import java.util.Objects;

public class Payment {
    private String paymentId;

    private Payment() {
    }

    private Payment(Payment.Builder builder) {
        this.paymentId = builder.paymentId;
    }

    public String  getPaymentId() {
        return paymentId;
    }

    public static class Builder {
        private String paymentId;

        public Payment.Builder paymentId(String paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder copy(Payment payment){
            this.paymentId = payment.paymentId;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }

    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return paymentId == payment.paymentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId);
    }
}
