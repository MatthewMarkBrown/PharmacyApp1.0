//package ac.ca.cput.service.admin.impl;
//
//import ac.ca.cput.Repository.admin.ReturnRepository;
//import ac.ca.cput.Repository.admin.impl.ReturnRepositoryImp;
//import ac.ca.cput.model.admin.Return;
//import ac.ca.cput.service.admin.ReturnService;
//
//import java.util.Set;
//
//public class ReturnServiceImp implements ReturnService {
//    private static ReturnServiceImp service = null;
//    private ReturnRepository repo;
//
//    private ReturnServiceImp() {
//        this.repo = (ReturnRepository) ReturnRepositoryImp.getRepo();
//    }
//
//    public static ReturnServiceImp getService(){
//        if(service == null) service = new ReturnServiceImp();
//        return service;
//    }
//    @Override
//    public Set<Return> getAll() {
//        return this.repo.getAll();
//    }
//
//    @Override
//    public Return create(Return return1) {
//        return this.repo.create(return1);
//    }
//
//    @Override
//    public Return update(Return return1) {
//        return this.repo.update(return1);
//    }
//
//    @Override
//    public void delete(String id) {
//    this.repo.delete(id);
//    }
//
//    @Override
//    public Return read(String id) {
//        return this.repo.read(id);
//    }
//}
