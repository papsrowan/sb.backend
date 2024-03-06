package api.spring.sb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("api")

public class TestController {
    
    @GetMapping()
    public String getHelloMessage() {
        return "Hello World";
    }

    @GetMapping("users")
    public List<String> getMethodName() {
        return List.of("yann","blanche", "siegfried");
    }
    
}
