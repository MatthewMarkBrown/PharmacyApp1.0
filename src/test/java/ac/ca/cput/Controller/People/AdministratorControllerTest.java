//package ac.ca.cput.Controller.People;
//
//import ac.ca.cput.factory.people.AdministratorFactory;
//import ac.ca.cput.model.people.Administrator;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.MethodSorters;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.*;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.client.HttpClientErrorException;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class AdministratorControllerTest {
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private String baseURL = "http://localhost:8080/administrator";
//
//    @Test
//    public void a_create() {
//
//        Administrator administrator = AdministratorFactory.getAdministrator("216011671", "Matthew", "Brown", "b@brown.com");
//        administrator.setUserID("216011671");
//        ResponseEntity<Administrator> postResponse = restTemplate.postForEntity(baseURL + "/new", administrator, Administrator.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
//        System.out.println(postResponse.getBody());
//
//    }
//
//    @Test
//    public void b_findById() {
//
//        Administrator administrator = restTemplate.getForObject(baseURL + "/find/" + "216011671", Administrator.class);
//        assertNotNull(administrator);
//        System.out.println(administrator.getFirstName());
//
//    }
//
//    @Test
//    public void c_update() {
//
//        Administrator administrator = restTemplate.getForObject(baseURL + "/find/" + "216011671", Administrator.class);
//        administrator.setFirstName("Matt");
//        restTemplate.put(baseURL + "/update/" + "216011671", administrator);
//        Administrator updatedAdministrator = restTemplate.getForObject(baseURL + "/update/" + "216011671", Administrator.class);
//        assertNotNull(administrator);
//        System.out.println(administrator);
//
//    }
//
//    @Test
//    public void e_delete() {
//
//        Administrator administrator = restTemplate.getForObject(baseURL + "/find/" + "216011671", Administrator.class);
//        assertNotNull(administrator);
//        restTemplate.delete(baseURL + "/delete/" + "216011671");
//
//        try {
//            administrator = restTemplate.getForObject(baseURL + "/find/" + "216011671", Administrator.class);
//        } catch (final HttpClientErrorException e) {
//            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
//        }
//
//    }
//
//    @Test
//    public void d_getAll() {
//
//        HttpHeaders headers = new HttpHeaders();
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//        ResponseEntity<String> response = restTemplate.withBasicAuth("admin", "admin").exchange(baseURL + "/getall", HttpMethod.GET, entity, String.class);
//        assertNotNull(response.getBody());
//        System.out.println(response.getBody());
//
//    }
//
//}
