package ac.ca.cput.Repository.people;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.people.Owner;

import java.util.Set;

public interface OwnerRepository extends IRepository<Owner,String> {
Set <Owner> getAll();
}
