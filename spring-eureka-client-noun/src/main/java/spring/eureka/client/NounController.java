package spring.eureka.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NounController {

   // @Value("${words}")
    private String words = "icicle,refrigerator,blizzard,snowball";

    @RequestMapping("/")
    public String getWords(){

        String[] wordArray = words.split(",");
        int i = (int)Math.round(Math.random() * (wordArray.length - 1));
        return wordArray[i];
    }
}
