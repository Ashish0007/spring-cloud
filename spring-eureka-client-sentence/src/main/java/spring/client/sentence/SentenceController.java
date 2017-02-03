/*
package spring.client.sentence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class SentenceController {

    @Autowired
    private LoadBalancerClient client;

  //  @RequestMapping("/sentence")
    public @ResponseBody String getSentence() {
        return  getWord("eureka-client-subject") + " "
                        + getWord("eureka-client-verb") + " "
                        + getWord("eureka-client-article") + " "
                        + getWord("eureka-client-adjective") + " "
                        + getWord("eureka-client-noun") + "."                ;
    }

    public String getWord(String service) {

        ServiceInstance  serviceInstance = client.choose(service);
        if (serviceInstance != null  ) {
            URI uri = URI.create(String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort()));
            if (uri !=null ) {
                return (new RestTemplate()).getForObject(uri,String.class);
            }
        }
        return null;
    }

}
*/
