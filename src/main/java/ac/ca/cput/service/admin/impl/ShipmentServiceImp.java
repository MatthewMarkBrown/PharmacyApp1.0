package ac.ca.cput.service.admin.impl;

import ac.ca.cput.Repository.admin.ShipmentRepository;
import ac.ca.cput.Repository.admin.impl.ShipmentRepositoryImp;
import ac.ca.cput.model.admin.Shipment;
import ac.ca.cput.service.admin.ShipmentService;

import java.util.Set;

public class ShipmentServiceImp implements ShipmentService {
    private static ShipmentServiceImp service = null;
    private ShipmentRepository repo;

    private ShipmentServiceImp() {
        this.repo = (ShipmentRepository) ShipmentRepositoryImp.getRepo();
    }

    public static ShipmentServiceImp getService(){
        if(service == null) service = new ShipmentServiceImp();
        return service;
    }

    @Override
    public Set<Shipment> getAll() {
        return this.repo.getAll();
    }

    @Override
    public Shipment create(Shipment shipment) {
        return this.repo.create(shipment);
    }

    @Override
    public Shipment update(Shipment shipment) {
        return this.repo.update(shipment);
    }

    @Override
    public void delete(String id) {
    this.repo.delete(id);
    }

    @Override
    public Shipment read(String id) {
        return this.repo.read(id);
    }
}
