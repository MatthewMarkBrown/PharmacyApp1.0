package ac.ca.cput.Repository.people;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.people.Administrator;

import java.util.Set;

public interface AdministratorRepository extends IRepository<Administrator, String> {
    Set<Administrator> getAll();
}
