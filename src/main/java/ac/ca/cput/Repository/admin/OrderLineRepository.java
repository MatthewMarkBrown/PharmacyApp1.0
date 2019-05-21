package ac.ca.cput.Repository.admin;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.admin.OrderLine;

import java.util.Set;

public interface OrderLineRepository extends IRepository<OrderLine, String> {
Set<OrderLine> getAll();
}
