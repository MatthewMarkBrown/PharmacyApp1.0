package ac.ca.cput.Repository.admin.impl;

import ac.ca.cput.Repository.admin.OrderRepository;
import ac.ca.cput.model.admin.Order;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OrderRepositoryImp implements OrderRepository {
    private static OrderRepositoryImp repo = null;
    private Set<Order> ord;

    private OrderRepositoryImp(){
        this.ord = new HashSet<>();
    }

    public static OrderRepositoryImp getRepo(){
        if (repo == null){
            repo = new OrderRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Order> getAll() {
        return this.ord;
    }

    @Override
    public Order create(Order order) {
        this.ord.add(order);
        return order;
    }

    @Override
    public Order update(Order order) {
            if(!order.equals(null)){
                return order;
            }
            return null;
    }

    @Override
    public void delete(String t) {
        for(Iterator<Order> ite = ord.iterator(); ite.hasNext(); ){
            Order or = ite.next();
            if (or.equals(new Order.Builder().orderId(t))){
                this.ord.remove(or);
            }
        }

    }

    @Override
    public Order read(String id) {
        return null;
    }


    /*



    public void delete(String s) {
        for(Iterator<Order> ite = ord.iterator(); ite.hasNext(); ){
            Order or = ite.next();
            if (or.equals(new Order.Builder().orderId(s))){
                this.ord.remove(or);
            }
        }
    }

    public Set <Order> getAll(){
        return this.ord;
    }
    */
}
