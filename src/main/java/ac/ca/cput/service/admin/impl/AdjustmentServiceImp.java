//package ac.ca.cput.service.admin.impl;
//
//import ac.ca.cput.Repository.admin.AdjustmentRepository;
//import ac.ca.cput.Repository.admin.impl.AdjustmentRepositoryImp;
//import ac.ca.cput.model.admin.Adjustment;
//import ac.ca.cput.service.admin.AdjustmentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//import java.util.Set;
//@Service("AdjustmentServiceImp")
//public class AdjustmentServiceImp implements AdjustmentService {
//@Autowired
//@Qualifier("InMemory")
//    private static AdjustmentServiceImp service = null;
//    private AdjustmentRepository repo;
//
//    private AdjustmentServiceImp()
//    {
//        this.repo = AdjustmentRepositoryImp.getRepo();
//    }
//
//    public static AdjustmentServiceImp getService(){
//        if(service == null) service = new AdjustmentServiceImp();
//        return service;
//    }
//
//    @Override
//    public Set<Adjustment> getAll() {
//        return this.repo.getAll();
//    }
//
//    @Override
//    public Adjustment create(Adjustment adjustment) {
//        return this.repo.create(adjustment);
//    }
//
//    @Override
//    public Adjustment update(Adjustment adjustment) {
//        return this.repo.update(adjustment);
//    }
//
//    @Override
//    public void delete(String s) {
//        this.repo.delete(s);
//    }
//
//    @Override
//    public Adjustment read(String id) {
//        return this.repo.read(id);
//    }
//}
