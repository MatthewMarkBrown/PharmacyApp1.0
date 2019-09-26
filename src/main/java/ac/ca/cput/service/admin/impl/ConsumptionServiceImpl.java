//package ac.ca.cput.service.admin.impl;
//
//import ac.ca.cput.Repository.admin.ConsumptionRepository;
//import ac.ca.cput.Repository.admin.impl.ConsumptionRepositoryImp;
//import ac.ca.cput.model.admin.Consumption;
//import ac.ca.cput.service.admin.ConsumptionService;
//
//import java.util.Set;
//
//public class ConsumptionServiceImpl implements ConsumptionService {
//    private static ConsumptionServiceImpl service = null;
//    private ConsumptionRepository repo;
//
//    private ConsumptionServiceImpl() {
//        this.repo = ConsumptionRepositoryImp.getRepo();
//    }
//
//    public static ConsumptionServiceImpl getService(){
//        if(service == null) service = new ConsumptionServiceImpl();
//        return service;
//    }
//
//    @Override
//    public Set<Consumption> getAll() {
//        return this.repo.getAll();
//    }
//
//    @Override
//    public Consumption create(Consumption consumption) {
//        return this.repo.create(consumption);
//    }
//
//    @Override
//    public Consumption update(Consumption consumption) {
//        return this.repo.update(consumption);
//    }
//
//    @Override
//    public void delete(String s) {
//    this.repo.delete(s);
//    }
//
//    @Override
//    public Consumption read(String id) {
//        return this.repo.read(id);
//    }
//}
