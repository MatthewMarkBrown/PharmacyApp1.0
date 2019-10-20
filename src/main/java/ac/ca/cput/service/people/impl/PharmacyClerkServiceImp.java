//package ac.ca.cput.service.people.impl;
//
//import ac.ca.cput.Repository.people.CustomerRepository;
//import ac.ca.cput.Repository.people.PharmacyClerkRepository;
//import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
//import ac.ca.cput.Repository.people.impl.PharmacyClerkRepositoryImp;
//import ac.ca.cput.model.admin.Pharmacy;
//import ac.ca.cput.model.people.Customer;
//import ac.ca.cput.model.people.PharmacyClerk;
//import ac.ca.cput.service.admin.PharmacyService;
//import ac.ca.cput.service.people.CustomerService;
//import ac.ca.cput.service.people.PharmacyClerkService;
//import org.springframework.stereotype.Repository;
//
//import java.util.Set;
//
//@Repository("PharmacyClerkServiceImp")
//public class PharmacyClerkServiceImp implements PharmacyClerkService {
//
//    private PharmacyClerkServiceImp service = null;
//    private PharmacyClerkRepository repository;
//
//    public PharmacyClerkServiceImp() {
//        repository = PharmacyClerkRepositoryImp.getRepo();
//    }
//
//    public PharmacyClerkServiceImp getService(){
//
//        if(service == null){
//            return new PharmacyClerkServiceImp();
//        }
//        return service;
//    }
//
//    @Override
//    public Set<PharmacyClerk> getAll() {
//        return this.repository.getAll();
//    }
//
//    @Override
//    public PharmacyClerk create(PharmacyClerk pharmacyClerk) {
//        return repository.create(pharmacyClerk);
//    }
//
//    @Override
//    public PharmacyClerk read(String integer) {
//        return repository.read(integer);
//    }
//
//    @Override
//    public PharmacyClerk update(PharmacyClerk pharmacyClerk) {
//        return repository.update(pharmacyClerk);
//    }
//
//    @Override
//    public void delete(String integer) {
//
//        repository.delete(integer);
//    }
//}