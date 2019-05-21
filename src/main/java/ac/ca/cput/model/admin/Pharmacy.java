package ac.ca.cput.model.admin;

import java.util.Objects;

public class Pharmacy {
    private String pharmacyId, pharmacyName;

    private Pharmacy() {
    }

    private Pharmacy(Builder builder) {
        this.pharmacyId = builder.pharmacyId;
        this.pharmacyName = builder.pharmacyName;
    }

    public String getPharmacyId() {
        return pharmacyId;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public static class Builder {
        private String pharmacyId, pharmacyName;

        public Builder pharmacyId(String pharmacyId) {
            this.pharmacyId = pharmacyId;
            return this;
        }

        public Builder pharmacyName(String pharmacyName) {
            this.pharmacyName = pharmacyName;
            return this;
        }

        public Builder copy(Pharmacy pharmacy){
            this.pharmacyId = pharmacy.pharmacyId;
            this.pharmacyName = pharmacy.pharmacyName;

            return this;
        }

        public Pharmacy build() {
            return new Pharmacy(this);

        }

    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "pharmacyId='" + pharmacyId + '\'' +
                ", pharmacyName='" + pharmacyName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(pharmacyId, pharmacy.pharmacyId) &&
                Objects.equals(pharmacyName, pharmacy.pharmacyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pharmacyId, pharmacyName);
    }
}
