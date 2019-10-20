//package ac.ca.cput.Repository.admin.impl;
//
//
//import ac.ca.cput.Repository.admin.*;
//import ac.ca.cput.Repository.people.CustomerRepository;
//import ac.ca.cput.model.admin.*;
//import ac.ca.cput.model.people.Customer;
//import org.springframework.stereotype.Repository;
//import sun.awt.SunHints;
//
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//
//@Repository("OrderStatusInMemory")
//public class OrderStatusRepositoryImp implements OrderStatusRepository {
//    private static OrderStatusRepositoryImp repo = null;
//    private Set<OrderStatus> ord;
//
//    private OrderStatusRepositoryImp(){
//
//        this.ord = new HashSet<>();
//    }
//
//    public static OrderStatusRepositoryImp getRepo(){
//        if (repo == null){
//            repo = new OrderStatusRepositoryImp();
//        }
//        return repo;
//    }
//
//    @Override
//    public OrderStatus create(OrderStatus orderStatus) {
//        this.ord.add(orderStatus);
//        return orderStatus;
//    }
//
//    @Override
//    public OrderStatus update(OrderStatus orderStatus) {
//        OrderStatus inDB = read(orderStatus.getStatusId());
//
//        if(inDB != null){
//            ord.remove(inDB);
//            ord.add(orderStatus);
//            return orderStatus;
//        }
//        return null;
//    }
//
//
//    @Override
//    public void delete(String id) {
//        OrderStatus inDB = read(id);
//        ord.remove(inDB);
//    }
//
//    @Override
//    public OrderStatus read(String id) {
//        return ord.stream().filter( ord-> ord.getStatusId().equals(id)).findAny().orElse(null);
//    }
//
//    @Override
//    public Set <OrderStatus> getAll(){
//        return this.ord;
//    }
//}
