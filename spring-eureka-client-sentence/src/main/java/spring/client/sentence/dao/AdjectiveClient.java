package spring.client.sentence.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-client-adjective")
public interface AdjectiveClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getWord() ;
}
