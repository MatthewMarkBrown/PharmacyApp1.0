package ac.ca.cput.service.people;

import ac.ca.cput.model.people.PharmacyClerk;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface PharmacyClerkService extends IService<PharmacyClerk,String> {
Set<PharmacyClerk> getAll();
}
