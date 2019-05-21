package ac.ca.cput.Repository.admin;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.admin.Pharmacy;

import java.util.Set;

public interface PharmacyRepository extends IRepository<Pharmacy,String> {
Set<Pharmacy> getAll();
}
