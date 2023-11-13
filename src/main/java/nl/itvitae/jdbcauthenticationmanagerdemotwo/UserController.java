package nl.itvitae.jdbcauthenticationmanagerdemotwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public String hello() {
        return "Hello user 0922!";
    }
}
