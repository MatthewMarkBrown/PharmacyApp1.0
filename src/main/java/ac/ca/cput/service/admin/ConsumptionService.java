package ac.ca.cput.service.admin;

import ac.ca.cput.model.admin.Consumption;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface ConsumptionService extends IService<Consumption,String> {
     Set<Consumption> getAll();
}
