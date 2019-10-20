//package ac.ca.cput.Repository.people.impl;
//
//import ac.ca.cput.Repository.people.AdministratorRepository;
//import ac.ca.cput.model.people.Administrator;
//import org.springframework.stereotype.Repository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Repository("AdministratorInMemory")
//public class AdministratorRepositoryImp implements AdministratorRepository {
//    private static AdministratorRepositoryImp repository = null;
//    private Set<Administrator> administrators;
//
//    public AdministratorRepositoryImp(){
//        administrators = new HashSet<>();
//    }
//    public static AdministratorRepositoryImp getRepository() {
//
//        if(repository == null){
//            return new AdministratorRepositoryImp();
//        }
//        return repository;
//    }
//
//    @Override
//    public Administrator create(Administrator administrator) {
//        administrators.add(administrator);
//        return administrator;
//    }
//
//    @Override
//    public Administrator read(String id) {
//        return administrators.stream().filter(administrator -> administrator.getUserID().equals(id)).findAny().orElse(null);
//    }
//
//    @Override
//    public Administrator update(Administrator administrator) {
//
//        Administrator inDB = read(administrator.getUserID());
//
//        if(inDB != null){
//            administrators.remove(inDB);
//            administrators.add(administrator);
//            return administrator;
//        }
//
//        return null;
//    }
//
//    @Override
//    public void delete(String id) {
//        Administrator inDB = read(id);
//        administrators.remove(inDB);
//
//    }
//
//    @Override
//    public Set<Administrator> getAll() {
//        return administrators;
//    }
//
//}
