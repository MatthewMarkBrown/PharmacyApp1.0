package ac.ca.cput.service.people;

import ac.ca.cput.model.people.Supplier;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface SupplierService extends IService<Supplier,String> {
Set<Supplier> getAll();
}
