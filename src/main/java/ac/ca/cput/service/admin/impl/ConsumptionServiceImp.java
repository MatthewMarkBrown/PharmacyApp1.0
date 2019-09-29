package ac.ca.cput.service.admin.impl;

import ac.ca.cput.Repository.admin.ConsumptionRepository;
import ac.ca.cput.Repository.admin.impl.ConsumptionRepositoryImp;
import ac.ca.cput.Repository.people.CustomerRepository;
import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
import ac.ca.cput.model.admin.Consumption;
import ac.ca.cput.model.people.Customer;
import ac.ca.cput.service.admin.ConsumptionService;
import ac.ca.cput.service.people.CustomerService;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository("ConsumptionServiceImp")
public class ConsumptionServiceImp implements ConsumptionService {

    private ConsumptionServiceImp service = null;
    private ConsumptionRepository repository;

    public ConsumptionServiceImp() {
        repository = ConsumptionRepositoryImp.getRepo();
    }

    public ConsumptionServiceImp getService(){

        if(service == null){
            return new ConsumptionServiceImp();
        }
        return service;
    }

    @Override
    public Set<Consumption> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Consumption create(Consumption consumption) {
        return repository.create(consumption);
    }

    @Override
    public Consumption read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Consumption update(Consumption consumption) {
        return repository.update(consumption);
    }

    @Override
    public void delete(String integer) {
        repository.delete(integer);
    }
}