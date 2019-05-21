package ac.ca.cput.model.admin;

import java.util.Objects;

public class OrderLine {
    private String quantity;

    private OrderLine() {
    }

    private OrderLine(OrderLine.Builder builder) {
        this.quantity = builder.quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public static class Builder {
        private String quantity;

        public OrderLine.Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder copy(OrderLine orderLine){
            this.quantity = orderLine.quantity;
            return this;
        }


        public OrderLine build() {
            return new OrderLine(this);
        }

    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderLine orderLine = (OrderLine) o;
        return quantity == orderLine.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }
}
