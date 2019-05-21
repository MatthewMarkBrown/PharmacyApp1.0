package ac.ca.cput.model.admin;

import java.util.Objects;

public class Return {
    private String quantity;

    private Return() {
    }

    private Return(Return.Builder builder) {
        this.quantity = builder.quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public static class Builder {
        private String quantity;

        public Return.Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder copy(Return return1){
            this.quantity = return1.quantity;
            return this;
        }


        public Return build() {
            return new Return(this);
        }

    }

    @Override
    public String toString() {
        return "Return{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Return aReturn = (Return) o;
        return quantity == aReturn.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }
}