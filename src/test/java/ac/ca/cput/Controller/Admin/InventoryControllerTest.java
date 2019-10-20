//package ac.ca.cput.Controller.Admin;
//
//import ac.ca.cput.factory.admin.InventoryFactory;
//import ac.ca.cput.model.admin.Inventory;
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
//public class InventoryControllerTest {
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private String baseURL="http://localhost:8080/inventory";
//
//    @Test
//    public void testGetAllInventory() {
//        HttpHeaders headers = new HttpHeaders();
//
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
//                HttpMethod.GET, entity, String.class);
//        assertNotNull(response.getBody());
//    }
//
//
//    public void testGetInventoryBylocation() {
//        Inventory inventory = restTemplate.getForObject(baseURL + "/inventory/1", Inventory.class);
//        System.out.println(inventory.getLocation());
//        assertNotNull(inventory);
//    }
//
//    public void testCreateInventory() {
//        Inventory inventory = InventoryFactory.getInventory("SouthAfrica","7500");
//
//        ResponseEntity<Inventory> postResponse = restTemplate.postForEntity(baseURL + "/create", inventory, Inventory.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
//    }
//
//    public void testUpdateInventory() {
//        int location = 1;
//        Inventory inventory = restTemplate.getForObject(baseURL + "/inventory/" + location, Inventory.class);
//
//        restTemplate.put(baseURL + "/inventory/" + location,location);
//        Inventory updatedInventory = restTemplate.getForObject(baseURL + "/Inventory/" + location, Inventory.class);
//        assertNotNull(updatedInventory);
//    }
//
//}
