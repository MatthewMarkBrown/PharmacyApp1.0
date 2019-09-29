package ac.ca.cput.service.admin.impl;

import ac.ca.cput.Repository.admin.PharmacyRepository;
import ac.ca.cput.Repository.admin.ShipmentRepository;
import ac.ca.cput.Repository.admin.impl.PharmacyRepositoryImp;
import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.Repository.people.PharmacyClerkRepository;
import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
import ac.ca.cput.Repository.people.impl.PharmacyClerkRepositoryImp;
import ac.ca.cput.Repository.people.impl.ShipmentRepositoryImp;
import ac.ca.cput.model.admin.Pharmacy;
import ac.ca.cput.model.admin.Shipment;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.model.people.PharmacyClerk;
import ac.ca.cput.service.admin.PharmacyService;
import ac.ca.cput.service.admin.ShipmentService;
import ac.ca.cput.service.people.CustomerService;
import ac.ca.cput.service.people.PharmacyClerkService;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository("ShipmentServiceImp")
public class ShipmentServiceImp implements ShipmentService {

    private ShipmentServiceImp service = null;
    private ShipmentRepository repository;

    public ShipmentServiceImp() {
        repository = ShipmentRepositoryImp.getRepo();
    }

    public ShipmentServiceImp getService(){

        if(service == null){
            return new ShipmentServiceImp();
        }
        return service;
    }

    @Override
    public Set<Shipment> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Shipment create(Shipment shipment) {
        return repository.create(shipment);
    }

    @Override
    public Shipment read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Shipment update(Shipment shipment) {
        return repository.update(shipment);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }
}