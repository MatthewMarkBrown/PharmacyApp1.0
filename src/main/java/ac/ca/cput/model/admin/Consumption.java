package ac.ca.cput.model.admin;

import java.util.Objects;

public class Consumption {
    private String quantity;

    private Consumption() {
    }

    private Consumption(Consumption.Builder builder) {
        this.quantity = builder.quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public static class Builder {
        private String quantity;

        public Consumption.Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public Consumption.Builder copy(Consumption consumption){
            this.quantity = consumption.quantity;
            return this;
        }
        public Consumption build() {
            return new Consumption(this);
        }
    }

    @Override
    public String toString() {
        return "Consumption{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumption that = (Consumption) o;
        return quantity == that.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }
}