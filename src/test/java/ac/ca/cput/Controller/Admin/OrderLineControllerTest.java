package ac.ca.cput.Controller.Admin;

import ac.ca.cput.factory.admin.OrderLineFactory;
import ac.ca.cput.model.admin.OrderLine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class OrderLineControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/orderLine";

    @Test
    public void testGetAllOrderLine() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }


    public void testGetOrderLine() {
        OrderLine orderLine = restTemplate.getForObject(baseURL + "/orderLine/1",OrderLine.class);
        System.out.println(orderLine.getQuantity());
        assertNotNull(orderLine);
    }

    public void testCreateOrderLine() {
        OrderLine orderLine = OrderLineFactory.getOrderLine("52");

        ResponseEntity<OrderLine> postResponse = restTemplate.postForEntity(baseURL + "/create", orderLine, OrderLine.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    public void testUpdateOrderLine() {
        int quantity = 1;
        OrderLine orderLine = restTemplate.getForObject(baseURL + "/orderLine/" + quantity, OrderLine.class);

        restTemplate.put(baseURL + "/orderLine/" + quantity,quantity);
        OrderLine updatedOrderLine = restTemplate.getForObject(baseURL + "/OrderLine/" + quantity, OrderLine.class);
        assertNotNull(updatedOrderLine);
    }


}
