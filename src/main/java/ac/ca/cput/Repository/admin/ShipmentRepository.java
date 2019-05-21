package ac.ca.cput.Repository.admin;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.admin.Shipment;

import java.util.Set;

public interface ShipmentRepository extends IRepository<Shipment,String> {
Set<Shipment> getAll();
}
