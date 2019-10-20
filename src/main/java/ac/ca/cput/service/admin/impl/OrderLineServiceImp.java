//package ac.ca.cput.service.admin.impl;
//
//import ac.ca.cput.Repository.admin.OrderLineRepository;
//import ac.ca.cput.Repository.admin.impl.OrderLineRepositoryImp;
//import ac.ca.cput.Repository.people.CustomerRepository;
//import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
//import ac.ca.cput.model.admin.OrderLine;
//import ac.ca.cput.model.people.Customer;
//import ac.ca.cput.service.admin.OrderLineService;
//import ac.ca.cput.service.people.CustomerService;
//import org.springframework.stereotype.Repository;
//
//import java.util.Set;
//
//@Repository("OrderLineServiceImp")
//public class OrderLineServiceImp implements OrderLineService {
//
//    private OrderLineServiceImp service = null;
//    private OrderLineRepository repository;
//
//    public OrderLineServiceImp() {
//        repository = OrderLineRepositoryImp.getRepo();
//    }
//
//    public OrderLineServiceImp getService(){
//
//        if(service == null){
//            return new OrderLineServiceImp();
//        }
//        return service;
//    }
//
//    @Override
//    public OrderLine create(OrderLine orderLine) {
//        return repository.create(orderLine);
//    }
//
//    @Override
//    public OrderLine read(String integer) {
//        return repository.read(integer);
//    }
//
//    @Override
//    public OrderLine update(OrderLine orderLine) {
//        return repository.update(orderLine);
//    }
//
//    @Override
//    public void delete(String integer) {
//
//        repository.delete(integer);
//    }
//
//    @Override
//    public Set<OrderLine> gerAll() {
//        return this.repository.getAll();
//    }
//}