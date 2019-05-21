package ac.ca.cput.Repository.admin;


import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.admin.Adjustment;

import java.util.Set;

public interface AdjustmentRepository extends IRepository<Adjustment,String> {
Set<Adjustment> getAll();
}
