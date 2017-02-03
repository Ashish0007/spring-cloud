package spring.client.sentence.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-client-noun")
public interface  NounClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getWord() ;
}
