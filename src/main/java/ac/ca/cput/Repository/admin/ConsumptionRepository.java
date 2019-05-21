package ac.ca.cput.Repository.admin;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.admin.Consumption;

import java.util.Set;

public interface ConsumptionRepository extends IRepository<Consumption, String> {
Set<Consumption> getAll();
}
