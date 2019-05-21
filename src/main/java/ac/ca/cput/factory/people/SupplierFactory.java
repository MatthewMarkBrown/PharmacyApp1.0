package ac.ca.cput.factory.people;

import ac.ca.cput.model.people.Supplier;

public class SupplierFactory {
    public static Supplier getSupplier(String supplierId, String supplierName) {
        return new Supplier.Builder().supplierId(supplierId)
                .supplierName(supplierName)
                .build();
    }
}
