package ac.ca.cput.Repository.admin.impl;

import ac.ca.cput.Repository.admin.OrderStatusRepository;
import ac.ca.cput.model.admin.OrderStatus;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OrderStatusRepositoryImp implements OrderStatusRepository {
    private static OrderStatusRepositoryImp repo = null;
    private Set<OrderStatus> ords;

    private OrderStatusRepositoryImp(){
        this.ords = new HashSet<>();
    }

    public static OrderStatusRepositoryImp getRepo(){
        if (repo == null){
            repo = new OrderStatusRepositoryImp();
        }
        return repo;
    }

    @Override
    public OrderStatus create(OrderStatus orderStatus) {
        this.ords.add(orderStatus);
        return orderStatus;
    }

    @Override
    public OrderStatus update(OrderStatus orderStatus) {
        if(!orderStatus.equals(null)){
            return orderStatus;
        }
        return null;
    }

    @Override
    public void delete(String t) {
        for(Iterator<OrderStatus> ite = ords.iterator(); ite.hasNext(); ){
            OrderStatus ordst = ite.next();
            if (ordst.equals(new OrderStatus.Builder().statusId(t))){
                this.ords.remove(ordst);
            }
        }

    }

    @Override
    public OrderStatus read(String id) {
        return null;
    }

    @Override
    public Set<OrderStatus> getAll() {
        return null;
    }
}
