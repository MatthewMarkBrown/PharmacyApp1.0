package ac.ca.cput.service.people;

import ac.ca.cput.model.people.Administrator;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface AdministratorService extends IService<Administrator, String> {
    Set<Administrator> getAll();
}
