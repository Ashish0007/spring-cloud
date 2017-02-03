package spring.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

/*	@Value("${lucky-word}")
	private String luckWord;*/

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

/*	@RequestMapping("/lucky")
	public String getLuckWord(){
		return "this is lucky word "+ luckWord;
	}*/
}
