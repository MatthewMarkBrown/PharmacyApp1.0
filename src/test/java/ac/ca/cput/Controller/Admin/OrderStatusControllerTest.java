package ac.ca.cput.Controller.Admin;

import ac.ca.cput.factory.admin.OrderStatusFactory;
import ac.ca.cput.model.admin.OrderStatus;
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
public class OrderStatusControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/orderStatus";

    @Test
    public void testGetAllOrderStatus() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }


    public void testGetOrderStatus() {
        OrderStatus orderStatus = restTemplate.getForObject(baseURL + "/orderStatus/1",OrderStatus.class);
        System.out.println(orderStatus.getStatusId());
        assertNotNull(orderStatus);
    }

    public void testCreateOrderStatus() {
        OrderStatus orderStatus = OrderStatusFactory.statusId("52");

        ResponseEntity<OrderStatus> postResponse = restTemplate.postForEntity(baseURL + "/create", orderStatus, OrderStatus.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    public void testUpdateOrderStatus() {
        int iD = 1;
        OrderStatus orderStatus = restTemplate.getForObject(baseURL + "/orderStatus/" + iD, OrderStatus.class);

        restTemplate.put(baseURL + "/orderLine/" + iD,iD);
        OrderStatus updatedOrderStatus = restTemplate.getForObject(baseURL + "/OrderStatus/" + iD, OrderStatus.class);
        assertNotNull(updatedOrderStatus);
    }

}
