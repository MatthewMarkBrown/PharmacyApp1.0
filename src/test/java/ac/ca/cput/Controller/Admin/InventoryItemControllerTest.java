package ac.ca.cput.Controller.Admin;

import ac.ca.cput.factory.admin.InventoryItemFactory;
import ac.ca.cput.model.admin.InventoryItem;
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
public class InventoryItemControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/inventoryItem";

    @Test
    public void testGetAllInventoryItem() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }


    public void testGetInventoryItem() {
        InventoryItem inventoryItem = restTemplate.getForObject(baseURL + "/inventoryItem/1", InventoryItem.class);
        System.out.println(inventoryItem.getItemCode());
        assertNotNull(inventoryItem);
    }

    public void testCreateInventoryItem() {
        InventoryItem inventoryItem = InventoryItemFactory.getInventoryItem("52");

        ResponseEntity<InventoryItem> postResponse = restTemplate.postForEntity(baseURL + "/create", inventoryItem, InventoryItem.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    public void testUpdateInventory() {
        int code = 1;
        InventoryItem inventoryItem = restTemplate.getForObject(baseURL + "/inventoryItem/" + code, InventoryItem.class);

        restTemplate.put(baseURL + "/inventoryItem/" + code,code);
        InventoryItem updatedInventoryItem = restTemplate.getForObject(baseURL + "/InventoryItem/" + code, InventoryItem.class);
        assertNotNull(updatedInventoryItem);
    }

}
