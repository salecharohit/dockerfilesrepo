import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
 
@RestController
@EnableAutoConfiguration
public class SpringBootHelloWorld {
 
    @RequestMapping("/")
    String home() {
        return "Hello World From Spring Boot Build Using Maven on Alpine OS!";
    }
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootHelloWorld.class, args);
    }
 
}