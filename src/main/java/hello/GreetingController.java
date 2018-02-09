package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/map")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name, @RequestParam(value="email", defaultValue="World") String email) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name,email));
    }
}