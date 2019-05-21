package ac.ca.cput.Controller.People;

import ac.ca.cput.factory.people.OwnerFactory;
import ac.ca.cput.model.people.Owner;
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
public class OwnerControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/owner";

    @Test
    public void testGetAllOwner() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }


    public void testGetOwner() {
        Owner owner =  restTemplate.getForObject(baseURL + "/owner/1",Owner.class);
        System.out.println(owner.getOwnerId());
        assertNotNull(owner);
    }

    public void testCreateOwner() {
        Owner owner = OwnerFactory.getOwner("52","Tibus","Vader");

        ResponseEntity<Owner> postResponse = restTemplate.postForEntity(baseURL + "/create",owner, Owner.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    public void testUpdateOwner() {
        int iD = 1;
        Owner owner = restTemplate.getForObject(baseURL + "/owner" + iD, Owner.class);

        restTemplate.put(baseURL + "/owner/" + iD,iD);
        Owner updatedOwner= restTemplate.getForObject(baseURL + "/Owner/" + iD, Owner.class);
        assertNotNull(updatedOwner);
    }
}
