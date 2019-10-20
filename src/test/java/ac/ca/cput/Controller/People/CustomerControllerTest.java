//package ac.ca.cput.Controller.People;
//
//import ac.ca.cput.factory.people.CustomerFactory;
//import ac.ca.cput.model.people.Customer;
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
//public class CustomerControllerTest {
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private String baseURL="http://localhost:8080/customer";
//
//    @Test
//    public void testGetAllCustomer() {
//        HttpHeaders headers = new HttpHeaders();
//
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
//                HttpMethod.GET, entity, String.class);
//        assertNotNull(response.getBody());
//    }
//
//
//    public void testGetCustomer() {
//        Customer customer =  restTemplate.getForObject(baseURL + "/customer/1",Customer.class);
//        System.out.println(customer.getCustId());
//        assertNotNull(customer);
//    }
//
//    public void testCreateCustomer() {
//        Customer customer = CustomerFactory.getCustomer("52","Tibus","Vader");
//
//        ResponseEntity<Customer> postResponse = restTemplate.postForEntity(baseURL + "/create", customer, Customer.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
//    }
//
//    public void testUpdateCustomer() {
//        int iD = 1;
//        Customer customer = restTemplate.getForObject(baseURL + "/customer/" + iD, Customer.class);
//
//        restTemplate.put(baseURL + "/customer/" + iD,iD);
//        Customer updatedCustomer = restTemplate.getForObject(baseURL + "/Customer/" + iD, Customer.class);
//        assertNotNull(updatedCustomer);
//    }
//
//}
