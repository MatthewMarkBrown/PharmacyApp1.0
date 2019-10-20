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
//@Repository("OrderLineInMemory")
//public class OrderLineRepositoryImp implements OrderLineRepository {
//    private static OrderLineRepositoryImp repo = null;
//    private Set<OrderLine> ord;
//
//    private OrderLineRepositoryImp(){
//
//        this.ord = new HashSet<>();
//    }
//
//    public static OrderLineRepositoryImp getRepo(){
//        if (repo == null){
//            repo = new OrderLineRepositoryImp();
//        }
//        return repo;
//    }
//
//    @Override
//    public OrderLine create(OrderLine orderLine) {
//        this.ord.add(orderLine);
//        return orderLine;
//    }
//
//    @Override
//    public OrderLine update(OrderLine orderLine) {
//        OrderLine inDB = read(orderLine.getQuantity());
//
//        if(inDB != null){
//            ord.remove(inDB);
//            ord.add(orderLine);
//            return orderLine;
//        }
//        return null;
//    }
//
//
//    @Override
//    public void delete(String id) {
//        OrderLine inDB = read(id);
//        ord.remove(inDB);
//    }
//
//    @Override
//    public OrderLine read(String id) {
//        return ord.stream().filter( ord-> ord.getQuantity().equals(id)).findAny().orElse(null);
//    }
//
//    @Override
//    public Set <OrderLine> getAll(){
//        return this.ord;
//    }
//}
