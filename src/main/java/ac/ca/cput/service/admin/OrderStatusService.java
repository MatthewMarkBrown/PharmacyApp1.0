package ac.ca.cput.service.admin;

import ac.ca.cput.model.admin.OrderStatus;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface OrderStatusService extends IService<OrderStatus,String> {
Set<OrderStatus> getAll();
}
