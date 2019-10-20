//package ac.ca.cput.Controller.People;
//
//import ac.ca.cput.factory.people.PharmacyClerkFactory;
//import ac.ca.cput.model.people.PharmacyClerk;
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
//public class PharmacyClerkControllerTest {
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private String baseURL="http://localhost:8080/pharmacyClerk";
//
//    @Test
//    public void testGetAllPharmacyClerk() {
//        HttpHeaders headers = new HttpHeaders();
//
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
//                HttpMethod.GET, entity, String.class);
//        assertNotNull(response.getBody());
//    }
//
//
//    public void testGetPharmacyClerk() {
//        PharmacyClerk pharmacyClerk = restTemplate.getForObject(baseURL + "/pharmacyClerk/1",PharmacyClerk.class);
//        System.out.println(pharmacyClerk.getClerkId());
//        assertNotNull(pharmacyClerk);
//    }
//
//    public void testCreatePharmacyClerk() {
//        PharmacyClerk pharmacyClerk = PharmacyClerkFactory.getPharmacyClerk("52","nk","lop");
//
//        ResponseEntity<PharmacyClerk> postResponse = restTemplate.postForEntity(baseURL + "/create", pharmacyClerk, PharmacyClerk.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
//    }
//
//    public void testUpdatePharmacyClerk() {
//        int iD = 1;
//        PharmacyClerk pharmacyClerk = restTemplate.getForObject(baseURL + "/pharmacyClerk/" + iD, PharmacyClerk.class);
//
//        restTemplate.put(baseURL + "/pharmacyClerk/" + iD,iD);
//        PharmacyClerk updatedPharmacyClerk = restTemplate.getForObject(baseURL + "/PharmacyClerk/" + iD, PharmacyClerk.class);
//        assertNotNull(updatedPharmacyClerk);
//    }
//}
