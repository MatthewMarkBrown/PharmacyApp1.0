package ac.ca.cput.Controller.Admin;

import ac.ca.cput.factory.admin.ReturnFactory;
import ac.ca.cput.model.admin.Return;
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

public class ReturnControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/return";

    @Test
    public void testGetAllReturn() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }


    public void testGetReturn() {
        Return aReturn= restTemplate.getForObject(baseURL + "/return/1",Return.class);
        System.out.println(aReturn.getQuantity());
        assertNotNull(aReturn);
    }

    public void testCreateReturn() {
        Return aReturn = ReturnFactory.getReturn("52");

        ResponseEntity<Return> postResponse = restTemplate.postForEntity(baseURL + "/create", aReturn, Return.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    public void testUpdateReturn() {
        int iD = 1;
        Return aReturn = restTemplate.getForObject(baseURL + "/return/" + iD, Return.class);

        restTemplate.put(baseURL + "/return/" + iD,iD);
        Return updatedReturn = restTemplate.getForObject(baseURL + "/Return/" + iD, Return.class);
        assertNotNull(updatedReturn);
    }

}
