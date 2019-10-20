//package ac.ca.cput.service.admin.impl;
//
//import ac.ca.cput.Repository.admin.PharmacyRepository;
//import ac.ca.cput.Repository.admin.ReturnRepository;
//import ac.ca.cput.Repository.admin.impl.PharmacyRepositoryImp;
//import ac.ca.cput.Repository.admin.impl.ReturnRepositoryImp;
//import ac.ca.cput.Repository.people.CustomerRepository;
//import ac.ca.cput.Repository.people.PharmacyClerkRepository;
//import ac.ca.cput.Repository.people.impl.CustomerRepositoryImp;
//import ac.ca.cput.Repository.people.impl.PharmacyClerkRepositoryImp;
//import ac.ca.cput.model.admin.Pharmacy;
//import ac.ca.cput.model.admin.Return;
//import ac.ca.cput.model.people.Customer;
//import ac.ca.cput.model.people.PharmacyClerk;
//import ac.ca.cput.service.admin.PharmacyService;
//import ac.ca.cput.service.admin.ReturnService;
//import ac.ca.cput.service.people.CustomerService;
//import ac.ca.cput.service.people.PharmacyClerkService;
//import org.springframework.stereotype.Repository;
//
//import java.util.Set;
//
//@Repository("ReturnServiceImp")
//public class ReturnServiceImp implements ReturnService {
//
//    private ReturnServiceImp service = null;
//    private ReturnRepository repository;
//
//    public ReturnServiceImp() {
//        repository = ReturnRepositoryImp.getRepo();
//    }
//
//    public ReturnServiceImp getService(){
//
//        if(service == null){
//            return new ReturnServiceImp();
//        }
//        return service;
//    }
//
//    @Override
//    public Set<Return> getAll() {
//        return this.repository.getAll();
//    }
//
//    @Override
//    public Return create(Return return1) {
//        return repository.create(return1);
//    }
//
//    @Override
//    public Return read(String integer) {
//        return repository.read(integer);
//    }
//
//    @Override
//    public Return update(Return return1) {
//        return repository.update(return1);
//    }
//
//    @Override
//    public void delete(String integer) {
//
//        repository.delete(integer);
//    }
//}