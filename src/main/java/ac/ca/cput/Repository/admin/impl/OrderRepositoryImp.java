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
//@Repository("OrderInMemory")
//public class OrderRepositoryImp implements OrderRepository {
//    private static OrderRepositoryImp repo = null;
//    private Set<Order> ord;
//
//    private OrderRepositoryImp(){
//
//        this.ord = new HashSet<>();
//    }
//
//    public static OrderRepositoryImp getRepo(){
//        if (repo == null){
//            repo = new OrderRepositoryImp();
//        }
//        return repo;
//    }
//
//    @Override
//    public Order create(Order order) {
//        this.ord.add(order);
//        return order;
//    }
//
//    @Override
//    public Order update(Order order) {
//        Order inDB = read(order.getOrderId());
//
//        if(inDB != null){
//            ord.remove(inDB);
//            ord.add(order);
//            return order;
//        }
//        return null;
//    }
//
//
//    @Override
//    public void delete(String id) {
//        Order inDB = read(id);
//        ord.remove(inDB);
//    }
//
//    @Override
//    public Order read(String id) {
//        return ord.stream().filter( ord-> ord.getOrderId().equals(id)).findAny().orElse(null);
//    }
//
//    @Override
//    public Set <Order> getAll(){
//        return this.ord;
//    }
//}
