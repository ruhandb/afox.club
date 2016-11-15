package afox.club;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan("afox.club")
public class SpringBootApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootApp.class, args);
    }

}
