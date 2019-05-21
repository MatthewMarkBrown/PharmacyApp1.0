package ac.ca.cput.Controller.Admin;

import ac.ca.cput.factory.admin.PaymentFactory;
import ac.ca.cput.model.admin.Payment;
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
public class PaymentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/payment";

    @Test
    public void testGetAllPayment() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }


    public void testGetPayment() {
        Payment payment = restTemplate.getForObject(baseURL + "/payment/1",Payment.class);
        System.out.println(payment.getPaymentId());
        assertNotNull(payment);
    }

    public void testCreatePayment() {
        Payment payment = PaymentFactory.getPayment("52");

        ResponseEntity<Payment> postResponse = restTemplate.postForEntity(baseURL + "/create", payment, Payment.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    public void testUpdatePayment() {
        int iD = 1;
        Payment payment = restTemplate.getForObject(baseURL + "/payment/" + iD, Payment.class);

        restTemplate.put(baseURL + "/payment/" + iD,iD);
        Payment updatedPayment = restTemplate.getForObject(baseURL + "/Payment/" + iD, Payment.class);
        assertNotNull(updatedPayment);
    }


}
