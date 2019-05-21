package ac.ca.cput.model.admin;

import java.util.Objects;

public class OrderStatus {
    private String statusId;

    private OrderStatus() {
    }

    private OrderStatus(OrderStatus.Builder builder) {
        this.statusId = builder.statusId;
    }

    public String getStatusId() {
        return statusId;
    }

    public static class Builder {
        private String statusId;

        public OrderStatus.Builder statusId(String statusId) {
            this.statusId = statusId;
            return this;
        }

        public Builder copy(OrderStatus orderStatus){
            this.statusId = orderStatus.statusId;
            return this;
        }

        public OrderStatus build() {
            return new OrderStatus(this);

        }

    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "statusId=" + statusId +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderStatus that = (OrderStatus) o;
        return statusId == that.statusId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusId);
    }
}