package ac.ca.cput.Repository.admin;

import ac.ca.cput.Repository.IRepository;
import ac.ca.cput.model.admin.Payment;

import java.util.Set;

public interface PaymentRepository extends IRepository<Payment, String> {
Set<Payment> getAll();
}
