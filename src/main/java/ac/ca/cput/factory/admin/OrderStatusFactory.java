package ac.ca.cput.factory.admin;

import ac.ca.cput.model.admin.OrderStatus;

public class OrderStatusFactory {
    public static OrderStatus statusId(String statusId) {
        return new OrderStatus.Builder().statusId(statusId)
                .build();
    }
}
