package ac.ca.cput.Repository.admin.impl;

import ac.ca.cput.Repository.admin.OrderLineRepository;
import ac.ca.cput.model.admin.OrderLine;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OrderLineRepositoryImp implements OrderLineRepository {
    private static OrderLineRepositoryImp repo = null;
    private Set<OrderLine> orderLine;

    private OrderLineRepositoryImp(){
        this.orderLine = new HashSet<>();
    }

    public static OrderLineRepositoryImp getRepo(){
        if (repo == null){
            repo = new OrderLineRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<OrderLine> getAll() {
        return this.orderLine;
    }

    @Override
    public OrderLine create(OrderLine orderLine) {
        this.orderLine.add(orderLine);
        return orderLine;
    }

    @Override
    public OrderLine update(OrderLine orderLine) {
        if (!orderLine.equals(null)) {
            return orderLine;
        }
        return orderLine;
    }

    @Override
    public void delete(String t) {
        for(Iterator<OrderLine> ite = orderLine.iterator(); ite.hasNext(); ){
            OrderLine ol = ite.next();
            if (ol.equals(new OrderLine.Builder().quantity(t))){
                this.orderLine.remove(ol);
            }
        }
    }

    @Override
    public OrderLine read(String id) {
        return null;
    }
}
