package ac.ca.cput.service.people.impl;

import ac.ca.cput.Repository.admin.AdjustmentRepository;
import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.Repository.people.impl.AdjustmentRepositoryImp;
import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
import ac.ca.cput.model.admin.Adjustment;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.service.admin.AdjustmentService;
import ac.ca.cput.service.people.CustomerService;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository("AdjustmentServiceImp")
public class AdjustmentServiceImp implements AdjustmentService {

    private AdjustmentServiceImp service = null;
    private AdjustmentRepository repository;

    public AdjustmentServiceImp() {
        repository = AdjustmentRepositoryImp.getRepo();
    }

    public AdjustmentServiceImp getService(){

        if(service == null){
            return new AdjustmentServiceImp();
        }
        return service;
    }

    @Override
    public Set<Adjustment> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Adjustment create(Adjustment adjustment) {
        return repository.create(adjustment);
    }

    @Override
    public Adjustment read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Adjustment update(Adjustment adjustment) {
        return repository.update(adjustment);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }
}