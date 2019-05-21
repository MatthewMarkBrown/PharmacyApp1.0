package ac.ca.cput.service.admin.impl;

import ac.ca.cput.Repository.admin.OrderStatusRepository;
import ac.ca.cput.Repository.admin.impl.OrderStatusRepositoryImp;
import ac.ca.cput.model.admin.OrderStatus;
import ac.ca.cput.service.admin.OrderStatusService;

import java.util.Set;

public class OrderStatusServiceImp implements OrderStatusService {
    private static OrderStatusServiceImp service = null;
    private OrderStatusRepository repo;

    private OrderStatusServiceImp() {
        this.repo = (OrderStatusRepository) OrderStatusRepositoryImp.getRepo();
    }

    public static OrderStatusServiceImp getService(){
        if(service == null) service = new OrderStatusServiceImp();
        return service;
    }



    @Override
    public Set<OrderStatus> getAll() {
        return this.repo.getAll();
    }

    @Override
    public OrderStatus create(OrderStatus orderStatus) {
        return this.repo.create(orderStatus);
    }

    @Override
    public OrderStatus update(OrderStatus orderStatus) {
        return this.repo.update(orderStatus);
    }

    @Override
    public void delete(String id) {
    this.repo.delete(id);
    }

    @Override
    public OrderStatus read(String id) {
        return this.repo.read(id);
    }
}
