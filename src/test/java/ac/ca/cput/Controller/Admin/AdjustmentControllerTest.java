package ac.ca.cput.Controller.Admin;

import ac.ca.cput.factory.admin.AdjustmentFactory;
import ac.ca.cput.model.admin.Adjustment;
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
public class AdjustmentControllerTest {
@Autowired
private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/adjustment";

    @Test
    public void testGetAllAdjustment() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }


    public void testGetStudentById() {
        Adjustment adjustment = restTemplate.getForObject(baseURL + "/adjustment/1", Adjustment.class);
        System.out.println(adjustment.getExpectedCount());
        assertNotNull(adjustment);
    }

    public void testCreateStudent() {
        Adjustment adjustment = AdjustmentFactory.getExpectedCount("John");

        ResponseEntity<Adjustment> postResponse = restTemplate.postForEntity(baseURL + "/create", adjustment, Adjustment.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    public void testUpdateStudent() {
        int id = 1;
        Adjustment adjustment = restTemplate.getForObject(baseURL + "/adjustment/" + id, Adjustment.class);

        restTemplate.put(baseURL + "/adjustments/" + id, adjustment);
        Adjustment updatedAdjustment = restTemplate.getForObject(baseURL + "/Adjustment/" + id, Adjustment.class);
        assertNotNull(updatedAdjustment);
    }

/*
    public void testDeleteEmployee() {
        int exp = 2;
        Adjustment adjustment = restTemplate.getForObject(baseURL + "/adjustment/" + exp, Adjustment.class);
        assertNotNull(adjustment);
        restTemplate.delete(baseURL + "/adjustment/" + exp);
        try {
            adjustment = restTemplate.getForObject(baseURL + "/adjustment/" + exp, Adjustment.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
*/

}
