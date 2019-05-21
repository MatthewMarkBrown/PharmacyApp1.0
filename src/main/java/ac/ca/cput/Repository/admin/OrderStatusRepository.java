package ac.ca.cput.Repository.admin;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.admin.OrderStatus;

import java.util.Set;

public interface OrderStatusRepository extends IRepository<OrderStatus, String> {
Set<OrderStatus> getAll();
}
