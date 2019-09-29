package ac.ca.cput.service.people.impl;

import ac.ca.cput.Repository.admin.OrderLineRepository;
import ac.ca.cput.Repository.admin.OrderRepository;
import ac.ca.cput.Repository.admin.OrderStatusRepository;
import ac.ca.cput.Repository.admin.PaymentRepository;
import ac.ca.cput.Repository.admin.impl.OrderLineRepositoryImp;
import ac.ca.cput.Repository.admin.impl.OrderRepositoryImp;
import ac.ca.cput.Repository.admin.impl.OrderStatusRepositoryImp;
import ac.ca.cput.Repository.admin.impl.PaymentRepositoryImp;
import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
import ac.ca.cput.model.admin.Order;
import ac.ca.cput.model.admin.OrderLine;
import ac.ca.cput.model.admin.OrderStatus;
import ac.ca.cput.model.admin.Payment;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.service.admin.OrderLineService;
import ac.ca.cput.service.admin.OrderService;
import ac.ca.cput.service.admin.OrderStatusService;
import ac.ca.cput.service.admin.PaymentService;
import ac.ca.cput.service.people.CustomerService;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository("PaymentServiceImp")
public class PaymentServiceImp implements PaymentService {

    private PaymentServiceImp service = null;
    private PaymentRepository repository;

    public PaymentServiceImp() {
        repository = PaymentRepositoryImp.getRepo();
    }

    public PaymentServiceImp getService(){

        if(service == null){
            return new PaymentServiceImp();
        }
        return service;
    }

    @Override
    public Payment create(Payment payment) {
        return repository.create(payment);
    }

    @Override
    public Payment read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Payment update(Payment payment) {
        return repository.update(payment);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }

    @Override
    public Set<Payment> getAll() {
        return this.repository.getAll();
    }
}