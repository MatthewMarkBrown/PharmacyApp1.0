package ac.ca.cput.factory.admin;

import ac.ca.cput.model.admin.Adjustment;

public class AdjustmentFactory {
    public static Adjustment getExpectedCount(String expectedCount) {
        return new Adjustment.Builder().expectedCount(expectedCount)
                .build();
    }
}