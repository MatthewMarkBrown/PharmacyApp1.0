package ac.ca.cput.factory.admin;

import ac.ca.cput.model.admin.Consumption;

public class ConsumptionFactory {
    public static Consumption getConsumption(String quantity) {
        return new Consumption.Builder().quantity(quantity)
                .build();
    }
}
