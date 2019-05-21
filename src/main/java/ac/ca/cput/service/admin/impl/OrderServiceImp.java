package ac.ca.cput.service.admin.impl;

import ac.ca.cput.Repository.admin.OrderRepository;
import ac.ca.cput.Repository.admin.impl.OrderRepositoryImp;
import ac.ca.cput.model.admin.Order;
import ac.ca.cput.service.admin.OrderService;

import java.util.Set;

public class OrderServiceImp implements OrderService {
    private static OrderServiceImp service = null;
    private OrderRepository repo;

    private OrderServiceImp() {
        this.repo = (OrderRepository) OrderRepositoryImp.getRepo();
    }

    public static OrderServiceImp getService(){
        if(service == null) service = new OrderServiceImp();
        return service;
    }
    @Override
    public Set<Order> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Order create(Order order) {
        return this.create(order);
    }

    @Override
    public Order update(Order order) {
        return this.update(order);
    }

    @Override
    public void delete(String id) {
        this.repo.delete(id);
    }

    @Override
    public Order read(String id) {
        return this.read(id);
    }
}
