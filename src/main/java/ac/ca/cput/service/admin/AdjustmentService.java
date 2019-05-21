package ac.ca.cput.service.admin;

import ac.ca.cput.model.admin.Adjustment;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface AdjustmentService extends IService<Adjustment, String> {
Set<Adjustment> getAll();
}
