package ac.ca.cput.model.admin;

import java.util.Objects;

public class Shipment {
    private String shipmentId;

    private Shipment() {
    }

    private Shipment(Shipment.Builder builder) {
        this.shipmentId = builder.shipmentId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public static class Builder {
        private String shipmentId;

        public Shipment.Builder shipmentId(String shipmentId) {
            this.shipmentId = shipmentId;
            return this;
        }

        public Builder copy(Shipment shipment){
            this.shipmentId = shipment.shipmentId;
            return this;
        }

        public Shipment build() {
            return new Shipment(this);

        }


    }

    @Override
    public String toString() {
        return "Shipment{" +
                "shipmentId=" + shipmentId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shipment shipment = (Shipment) o;
        return shipmentId == shipment.shipmentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentId);
    }
}