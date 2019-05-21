package ac.ca.cput.Controller.Admin;

import ac.ca.cput.factory.admin.OrderFactory;
import ac.ca.cput.model.admin.Order;
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
public class OrderControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/order";

    @Test
    public void testGetAllOrder() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }


    public void testGetOrder() {
        Order order = restTemplate.getForObject(baseURL + "/order/1",Order.class);
        System.out.println(order.getOrderId());
        assertNotNull(order);
    }

    public void testCreateOrder() {
        Order order = OrderFactory.getOrder("52","lol","lop");

        ResponseEntity<Order> postResponse = restTemplate.postForEntity(baseURL + "/create", order, Order.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    public void testUpdateOrder() {
        int iD = 1;
        Order order = restTemplate.getForObject(baseURL + "/order/" + iD, Order.class);

        restTemplate.put(baseURL + "/order/" + iD,iD);
        Order updatedOrder = restTemplate.getForObject(baseURL + "/Order/" + iD, Order.class);
        assertNotNull(updatedOrder);
    }


}
