package api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {
    @RequestMapping("/")
    public String helloWorld() {
        return "hello world!";
    }

    public void init() {}
}
