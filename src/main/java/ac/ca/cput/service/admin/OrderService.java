package ac.ca.cput.service.admin;

import ac.ca.cput.model.admin.Order;
import ac.ca.cput.service.IService;

import java.util.Set;

public interface OrderService extends IService<Order,String> {
Set<Order> getAll();
}
