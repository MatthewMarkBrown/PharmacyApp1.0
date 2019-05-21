package ac.ca.cput.factory.admin;

import ac.ca.cput.model.admin.Shipment;

public class ShipmentFactory {
    public static Shipment getShipment(String shipmentId) {
        return new Shipment.Builder().shipmentId(shipmentId)
                .build();
    }
}
