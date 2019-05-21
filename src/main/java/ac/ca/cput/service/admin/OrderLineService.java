package ac.ca.cput.service.admin;

import ac.ca.cput.model.admin.OrderLine;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface OrderLineService extends IService<OrderLine,String> {
Set<OrderLine> gerAll();
}
