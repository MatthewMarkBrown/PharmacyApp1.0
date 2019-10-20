//package ac.ca.cput.Service.People;
//
//import ac.ca.cput.factory.people.AdministratorFactory;
//import ac.ca.cput.model.people.Administrator;
//import ac.ca.cput.service.people.impl.AdministratorServiceImp;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.MethodSorters;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.Assert.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class AdministratorServiceTesting {
//    @Autowired
//    private AdministratorServiceImp administratorService;
//    Administrator administrator = AdministratorFactory.getAdministrator("TestID", "TestName", "TestLastName", "TestEmail");
//
//    @Test
//    public void a_create() {
//
//
//        administratorService.create(administrator);
//
//        assertNotNull(administratorService.getAll());
//        System.out.println(administratorService.getAll());
//    }
//
//    @Test
//    public void b_read() {
//
//
//        assertNotNull(administratorService.getAll());
//
//        Administrator administrator1 = administratorService.read(administrator.getUserID());
//
//        assertEquals(administrator, administrator1);
//        System.out.println(administratorService.getAll());
//
//
//    }
//
//    @Test
//    public void c_update() {
//
//
//
//        assertNotNull(administratorService.getAll());
//
//        Administrator administrator1 = AdministratorFactory.getAdministrator("TestID", "TestName2", "TestLastName", "TestEmail");
//        administrator1.setUserID(administrator.getUserID());
//        administratorService.update(administrator1);
//
//        Administrator administrator2 = administratorService.read(administrator1.getUserID());
//
//        assertEquals(administrator1, administrator2);
//        System.out.println(administratorService.getAll());
//
//    }
//
//    @Test
//    public void d_delete() {
//
//
//
//        assertNotNull(administratorService.getAll());
//
//        administratorService.delete(administrator.getUserID());
//
//        Administrator notInSet = administratorService.read(administrator.getUserID());
//
//        assertNull(notInSet);
//        System.out.println(administratorService.getAll());
//
//
//
//
//
//    }
//
//
//}
