//package ac.ca.cput.Controller.Admin;
//
//import ac.ca.cput.factory.admin.ConsumptionFactory;
//import ac.ca.cput.model.admin.Consumption;
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
//public class ConsumptionControllerTest {
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private String baseURL="http://localhost:8080/consumption";
//
//    @Test
//    public void testGetAllConsumption() {
//        HttpHeaders headers = new HttpHeaders();
//
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
//                HttpMethod.GET, entity, String.class);
//        assertNotNull(response.getBody());
//    }
//
//
//    public void testGetConsumptionById() {
//        Consumption consumption = restTemplate.getForObject(baseURL + "/consumption/1", Consumption.class);
//        System.out.println(consumption.getQuantity());
//        assertNotNull(consumption);
//    }
//
//    public void testCreateConsumption() {
//        Consumption consumption = ConsumptionFactory.getConsumption("23");
//
//        ResponseEntity<Consumption> postResponse = restTemplate.postForEntity(baseURL + "/create", consumption, Consumption.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
//    }
//
//    public void testUpdateConsumption() {
//        int quantity = 1;
//        Consumption consumption = restTemplate.getForObject(baseURL + "/consumption/" + quantity, Consumption.class);
//
//        restTemplate.put(baseURL + "/consumption/" + quantity, consumption);
//        Consumption updatedConsumption = restTemplate.getForObject(baseURL + "/Consumption/" + quantity, Consumption.class);
//        assertNotNull(updatedConsumption);
//    }
//
//
//}
