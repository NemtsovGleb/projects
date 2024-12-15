import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Consumer {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> jsonToSend = new HashMap<String, String>();
        jsonToSend.put("name", "Jack");
        jsonToSend.put("job", "Test job");

        HttpEntity<Map<String,String>> request = new HttpEntity<>(jsonToSend);

        String url = "https://reqres.in/api/users/2";
        String url2 = "https://reqres.in/api/users/";
        String response = restTemplate.getForObject(url, String.class);
        String post = restTemplate.postForObject(url2, request, String.class);

        //System.out.println(response);
        System.out.println(post);
    }
}
