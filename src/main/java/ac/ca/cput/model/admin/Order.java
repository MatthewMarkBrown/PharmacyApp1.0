package ac.ca.cput.model.admin;

import java.util.Objects;

public class Order {
private String orderId,orderName,orderType;

    private Order() {
    }

    private Order(Builder builder) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderType = orderType;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public String getOrderType() {
        return orderType;
    }

    public static class Builder{
        private String orderId,orderName,orderType;

        public Order.Builder orderId(String orderId){
            this.orderId = orderId;
            return this;
        }

        public Order.Builder orderName(String orderName){
            this.orderName = orderName;
            return this;
        }


        public Order.Builder orderType(String orderType ){
            this.orderType = orderType;
            return this;
        }

        public Order.Builder copy(Order order){
            this.orderId = order.orderId;
            this.orderName = order.orderName;
            this.orderType = orderType;
            return this;
        }

        public Order build() {
        return new Order(this);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderName='" + orderName + '\'' +
                ", orderType='" + orderType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId) &&
                Objects.equals(orderName, order.orderName) &&
                Objects.equals(orderType, order.orderType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderName, orderType);
    }
}
