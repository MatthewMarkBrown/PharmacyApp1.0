package ac.ca.cput.service.admin.impl;

import ac.ca.cput.Repository.admin.OrderLineRepository;
import ac.ca.cput.Repository.admin.impl.OrderLineRepositoryImp;
import ac.ca.cput.model.admin.OrderLine;
import ac.ca.cput.service.admin.OrderLineService;

import java.util.Set;

public class OrderLineServiceImp implements OrderLineService {
    private static OrderLineServiceImp service = null;
    private OrderLineRepository repo;

    private OrderLineServiceImp() {
        this.repo = (OrderLineRepository) OrderLineRepositoryImp.getRepo();
    }

    public static OrderLineServiceImp getService(){
        if(service == null) service = new OrderLineServiceImp();
        return service;
    }


    @Override
    public Set<OrderLine> gerAll() {
        return this.repo.getAll();
    }

    @Override
    public OrderLine create(OrderLine orderLine) {
        return this.repo.create(orderLine);
    }

    @Override
    public OrderLine update(OrderLine orderLine) {
        return this.repo.update(orderLine);
    }

    @Override
    public void delete(String id) {
    this.repo.delete(id);
    }

    @Override
    public OrderLine read(String id) {
        return this.repo.read(id);
    }

}
