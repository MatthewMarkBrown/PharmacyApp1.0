//package ac.ca.cput.service.people.impl;
//
//import ac.ca.cput.Repository.people.AdministratorRepository;
//import ac.ca.cput.Repository.people.impl.AdministratorRepositoryImp;
//import ac.ca.cput.model.people.Administrator;
//import ac.ca.cput.service.people.AdministratorService;
//import org.springframework.stereotype.Repository;
//
//import java.util.Set;
//
//@Repository("AdministratorServiceImp")
//public class AdministratorServiceImp implements AdministratorService {
//    private AdministratorServiceImp service = null;
//    private AdministratorRepository repository;
//
//    public AdministratorServiceImp() {
//        repository = AdministratorRepositoryImp.getRepository();
//    }
//
//    public AdministratorServiceImp getService(){
//
//        if(service == null){
//            return new AdministratorServiceImp();
//        }
//        return service;
//    }
//
//    @Override
//    public Set<Administrator> getAll() {
//        return this.repository.getAll();
//    }
//
//    @Override
//    public Administrator create(Administrator administrator) {
//        return repository.create(administrator);
//    }
//
//    @Override
//    public Administrator read(String integer) {
//        return repository.read(integer);
//    }
//
//    @Override
//    public Administrator update(Administrator administrator) {
//        return repository.update(administrator);
//    }
//
//    @Override
//    public void delete(String integer) {
//
//        repository.delete(integer);
//    }
//
//
//}
