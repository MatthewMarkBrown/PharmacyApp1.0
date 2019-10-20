//package ac.ca.cput.Controller.Admin;
//
//import ac.ca.cput.factory.admin.ShipmentFactory;
//import ac.ca.cput.model.admin.Shipment;
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
//public class ShipmentControllerTest {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private String baseURL="http://localhost:8080/shipment";
//
//    @Test
//    public void testGetAllShipment() {
//        HttpHeaders headers = new HttpHeaders();
//
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
//                HttpMethod.GET, entity, String.class);
//        assertNotNull(response.getBody());
//    }
//
//
//    public void testGetShipment() {
//        Shipment shipment =  restTemplate.getForObject(baseURL + "/shipment/1",Shipment.class);
//        System.out.println(shipment.getShipmentId());
//        assertNotNull(shipment);
//    }
//
//    public void testCreateShipment() {
//        Shipment shipment = ShipmentFactory.getShipment("52");
//
//        ResponseEntity<Shipment> postResponse = restTemplate.postForEntity(baseURL + "/create", shipment, Shipment.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
//    }
//
//    public void testUpdateShipment() {
//        int iD = 1;
//        Shipment shipment = restTemplate.getForObject(baseURL + "/shipment/" + iD, Shipment.class);
//
//        restTemplate.put(baseURL + "/shipment/" + iD,iD);
//        Shipment updatedShipment = restTemplate.getForObject(baseURL + "/Shipment/" + iD, Shipment.class);
//        assertNotNull(updatedShipment);
//    }
//}
