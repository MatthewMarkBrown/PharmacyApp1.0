package ac.ca.cput.model.people;

import java.util.Objects;

public class Supplier {
    private String supplierId,supplierName;

    private Supplier() {
    }

    private Supplier(Supplier.Builder builder) {
        this.supplierId = builder.supplierId;
        this.supplierName = builder.supplierName;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public static class Builder {
        private String supplierId, supplierName;

        public Supplier.Builder supplierId(String supplierId) {
            this.supplierId = supplierId;
            return this;
        }

        public Supplier.Builder supplierName(String supplierName) {
            this.supplierName= supplierName;
            return this;
        }

        public Supplier.Builder copy(Supplier supplier){
            this.supplierId = supplier.supplierId;
            this.supplierName = supplier.supplierName;
            return this;
        }

        public Supplier build() {
            return new Supplier(this);

        }

    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(supplierId, supplier.supplierId) &&
                Objects.equals(supplierName, supplier.supplierName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId, supplierName);
    }
}
