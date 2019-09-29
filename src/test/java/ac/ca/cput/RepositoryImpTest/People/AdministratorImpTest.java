package ac.ca.cput.RepositoryImpTest.People;

import ac.ca.cput.Repository.people.impl.AdministratorRepositoryImp;
import ac.ca.cput.factory.people.AdministratorFactory;
import ac.ca.cput.model.people.Administrator;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AdministratorImpTest {
    @Autowired
    private AdministratorRepositoryImp administratorRepository;
    Administrator administrator = AdministratorFactory.getAdministrator("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {

        administratorRepository.create(administrator);
        assertNotNull(administratorRepository.getAll());
        System.out.println(administratorRepository.getAll());

    }

    @Test
    public void b_read() {

        Administrator fromSet = administratorRepository.read(administrator.getUserID());
        assertEquals(administrator, fromSet);
        System.out.println(administratorRepository.getAll());
    }

    @Test
    public void c_update() {


        Administrator updatedAdministrator  = AdministratorFactory.getAdministrator("TestID", "TestName2", "TestLastName", "TestEmail");
        administratorRepository.update(updatedAdministrator);
        Assert.assertNotEquals(administrator.getFirstName(), updatedAdministrator.getFirstName());
        System.out.println(administratorRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(administratorRepository.getAll());
        administratorRepository.delete(administrator.getUserID());
        Administrator administratorTor = administratorRepository.read(administrator.getUserID());
        assertNull(administratorTor);
        System.out.println(administratorRepository.getAll());

    }
}
