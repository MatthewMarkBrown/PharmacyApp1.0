//package ac.ca.cput.Controller.People;
//
//import ac.ca.cput.factory.people.SupplierFactory;
//import ac.ca.cput.model.people.Supplier;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static junit.framework.TestCase.assertNotNull;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@RunWith(SpringRunner.class)
//public class SupplierControllerTest {
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private String baseURL="http://localhost:8080/supplier";
//
//    @Test
//    public void testGetAllSupplier() {
//        HttpHeaders headers = new HttpHeaders();
//
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
//                HttpMethod.GET, entity, String.class);
//        assertNotNull(response.getBody());
//    }
//
//
//    public void testGetSupplier() {
//        Supplier supplier = restTemplate.getForObject(baseURL + "/supplier/1",Supplier.class);
//        System.out.println(supplier.getSupplierId());
//        assertNotNull(supplier);
//    }
//
//    public void testCreateSupplier() {
//        Supplier supplier = SupplierFactory.getSupplier("52","nk");
//
//        ResponseEntity<Supplier> postResponse = restTemplate.postForEntity(baseURL + "/create", supplier, Supplier.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
//    }
//
//    public void testUpdateSupplier() {
//        int iD = 1;
//        Supplier supplier = restTemplate.getForObject(baseURL + "/supplier/" + iD, Supplier.class);
//
//        restTemplate.put(baseURL + "/supplier/" + iD,iD);
//        Supplier updatedSupplier= restTemplate.getForObject(baseURL + "/Supplier/" + iD, Supplier.class);
//        assertNotNull(supplier);
//    }
//
//}
