package ac.ca.cput.factory.admin;

import ac.ca.cput.model.admin.Order;

public class OrderFactory {
    public static Order getOrder(String orderId, String orderName, String orderType) {
        return new Order.Builder().orderId(orderId)
                .orderName(orderName)
                .orderType(orderType)
                .build();
    }
}