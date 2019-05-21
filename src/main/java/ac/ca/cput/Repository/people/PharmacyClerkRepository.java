package ac.ca.cput.Repository.people;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.people.PharmacyClerk;

import java.util.Set;

public interface PharmacyClerkRepository extends IRepository<PharmacyClerk,String> {
Set<PharmacyClerk> getAll();
}
