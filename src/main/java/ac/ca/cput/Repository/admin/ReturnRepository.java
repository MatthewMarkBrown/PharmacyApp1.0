package ac.ca.cput.Repository.admin;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.admin.Return;

import java.util.Set;

public interface ReturnRepository extends IRepository<Return, String> {
Set<Return> getAll();
}
