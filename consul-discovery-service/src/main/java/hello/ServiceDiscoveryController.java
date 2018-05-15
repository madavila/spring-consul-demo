package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceDiscoveryController {

    @GetMapping("/register")
    public String register() {
        return "Hello, Now you are registered";
    }

    @GetMapping("/my-health-check")
    public ResponseEntity<String> myCustomCheck() {
    	return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}
