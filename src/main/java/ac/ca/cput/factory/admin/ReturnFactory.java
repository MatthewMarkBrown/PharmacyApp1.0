package ac.ca.cput.factory.admin;

import ac.ca.cput.model.admin.Return;

public class ReturnFactory {
    public static Return getReturn(String quantity) {
        return new Return.Builder().quantity(quantity)
                .build();
    }
}
