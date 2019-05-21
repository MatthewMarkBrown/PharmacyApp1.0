package ac.ca.cput.service.people;

import ac.ca.cput.model.people.Owner;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface OwnerService extends IService<Owner,String> {
Set<Owner> getAll();
}
