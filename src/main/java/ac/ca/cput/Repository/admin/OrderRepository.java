package ac.ca.cput.Repository.admin;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.admin.Order;

import java.util.Set;

public interface OrderRepository extends IRepository<Order, String> {
Set<Order> getAll();
}
