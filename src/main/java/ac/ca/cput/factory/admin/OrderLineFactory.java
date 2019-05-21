package ac.ca.cput.factory.admin;

import ac.ca.cput.model.admin.OrderLine;

public class OrderLineFactory {
    public static OrderLine getOrderLine(String quantity) {
        return new OrderLine.Builder().quantity(quantity)
                .build();
    }
}