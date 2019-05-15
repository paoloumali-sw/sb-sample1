package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {

        // get a logger instance named com.foo.Bar
        Logger barlogger = Logger.getLogger(HelloController.class);
        barlogger.warn("Low fuel level.");
        barlogger.debug("Starting search for nearest gas station.");

        return "Greetings from Spring Boot!";
    }
    
}
