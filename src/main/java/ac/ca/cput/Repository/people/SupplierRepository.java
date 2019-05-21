package ac.ca.cput.Repository.people;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.people.Supplier;

import java.util.Set;

public interface SupplierRepository extends IRepository<Supplier,String> {
Set<Supplier> getAll();
}
