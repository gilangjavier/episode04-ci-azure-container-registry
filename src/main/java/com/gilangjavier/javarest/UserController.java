package main.java.com.gilangjavier.javarest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/read/one")
    public String readUser(){
        User user = new User("John","doe","John@javadev.com");
        return user.toString();
    }
}