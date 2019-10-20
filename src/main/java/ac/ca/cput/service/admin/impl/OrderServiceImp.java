//package ac.ca.cput.service.admin.impl;
//
//import ac.ca.cput.Repository.admin.OrderLineRepository;
//import ac.ca.cput.Repository.admin.OrderRepository;
//import ac.ca.cput.Repository.admin.impl.OrderLineRepositoryImp;
//import ac.ca.cput.Repository.admin.impl.OrderRepositoryImp;
//import ac.ca.cput.Repository.people.CustomerRepository;
//import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
//import ac.ca.cput.model.admin.Order;
//import ac.ca.cput.model.admin.OrderLine;
//import ac.ca.cput.model.people.Customer;
//import ac.ca.cput.service.admin.OrderLineService;
//import ac.ca.cput.service.admin.OrderService;
//import ac.ca.cput.service.people.CustomerService;
//import org.springframework.stereotype.Repository;
//
//import java.util.Set;
//
//@Repository("OrderServiceImp")
//public class OrderServiceImp implements OrderService {
//
//    private OrderServiceImp service = null;
//    private OrderRepository repository;
//
//    public OrderServiceImp() {
//        repository = OrderRepositoryImp.getRepo();
//    }
//
//    public OrderServiceImp getService(){
//
//        if(service == null){
//            return new OrderServiceImp();
//        }
//        return service;
//    }
//
//    @Override
//    public ac.ca.cput.model.admin.Order create(Order order) {
//        return repository.create(order);
//    }
//
//    @Override
//    public ac.ca.cput.model.admin.Order read(String integer) {
//        return repository.read(integer);
//    }
//
//    @Override
//    public ac.ca.cput.model.admin.Order update(ac.ca.cput.model.admin.Order order) {
//        return repository.update(order);
//    }
//
//    @Override
//    public void delete(String integer) {
//
//        repository.delete(integer);
//    }
//
//    @Override
//    public Set<ac.ca.cput.model.admin.Order> getAll() {
//        return this.repository.getAll();
//    }
//}