package ac.ca.cput.Controller.Admin;

import ac.ca.cput.factory.admin.PharmacyFactory;
import ac.ca.cput.model.admin.Pharmacy;
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
public class PharmacyControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/pharmacy";

    @Test
    public void testGetAllPharmacy() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }


    public void testGetPharmacy() {
        Pharmacy pharmacy = restTemplate.getForObject(baseURL + "/pharmacy/1",Pharmacy.class);
        System.out.println(pharmacy.getPharmacyId());
        assertNotNull(pharmacy);
    }

    public void testCreatePharmacy() {
        Pharmacy pharmacy = PharmacyFactory.getPharmacy("52","nk");

        ResponseEntity<Pharmacy> postResponse = restTemplate.postForEntity(baseURL + "/create", pharmacy, Pharmacy.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    public void testUpdatePharmacy() {
        int iD = 1;
        Pharmacy pharmacy = restTemplate.getForObject(baseURL + "/pharmacy/" + iD, Pharmacy.class);

        restTemplate.put(baseURL + "/pharmacy/" + iD,iD);
        Pharmacy updatedPharmacy = restTemplate.getForObject(baseURL + "/Pharmacy/" + iD, Pharmacy.class);
        assertNotNull(updatedPharmacy);
    }
}
