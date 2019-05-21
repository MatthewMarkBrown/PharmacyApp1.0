package ac.ca.cput.service.admin;

import ac.ca.cput.model.admin.Pharmacy;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface PharmacyService extends IService<Pharmacy,String> {
Set<Pharmacy> getAll();
}
