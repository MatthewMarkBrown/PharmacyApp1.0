package ac.ca.cput.service.admin;

import ac.ca.cput.model.admin.Shipment;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface ShipmentService extends IService<Shipment,String> {
    Set<Shipment> getAll();
}
