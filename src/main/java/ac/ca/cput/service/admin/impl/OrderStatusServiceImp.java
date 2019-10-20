//package ac.ca.cput.service.people.impl;
//
//import ac.ca.cput.Repository.admin.OrderLineRepository;
//import ac.ca.cput.Repository.admin.OrderRepository;
//import ac.ca.cput.Repository.admin.OrderStatusRepository;
//import ac.ca.cput.Repository.admin.impl.OrderLineRepositoryImp;
//import ac.ca.cput.Repository.admin.impl.OrderRepositoryImp;
//import ac.ca.cput.Repository.admin.impl.OrderStatusRepositoryImp;
//import ac.ca.cput.Repository.people.CustomerRepository;
//import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
//import ac.ca.cput.model.admin.Order;
//import ac.ca.cput.model.admin.OrderLine;
//import ac.ca.cput.model.admin.OrderStatus;
//import ac.ca.cput.model.people.Customer;
//import ac.ca.cput.service.admin.OrderLineService;
//import ac.ca.cput.service.admin.OrderService;
//import ac.ca.cput.service.admin.OrderStatusService;
//import ac.ca.cput.service.people.CustomerService;
//import org.springframework.stereotype.Repository;
//
//import java.util.Set;
//
//@Repository("OrderStatusServiceImp")
//public class OrderStatusServiceImp implements OrderStatusService {
//
//    private OrderStatusServiceImp service = null;
//    private OrderStatusRepository repository;
//
//    public OrderStatusServiceImp() {
//        repository = OrderStatusRepositoryImp.getRepo();
//    }
//
//    public OrderStatusServiceImp getService(){
//
//        if(service == null){
//            return new OrderStatusServiceImp();
//        }
//        return service;
//    }
//
//    @Override
//    public OrderStatus create(OrderStatus orderStatus) {
//        return repository.create(orderStatus);
//    }
//
//    @Override
//    public OrderStatus read(String integer) {
//        return repository.read(integer);
//    }
//
//    @Override
//    public OrderStatus update(OrderStatus orderStatus) {
//        return repository.update(orderStatus);
//    }
//
//    @Override
//    public void delete(String integer) {
//
//        repository.delete(integer);
//    }
//
//    @Override
//    public Set<OrderStatus> getAll() {
//        return this.repository.getAll();
//    }
//}