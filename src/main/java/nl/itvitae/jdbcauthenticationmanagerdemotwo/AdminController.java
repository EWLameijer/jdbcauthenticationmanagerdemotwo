package nl.itvitae.jdbcauthenticationmanagerdemotwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/admin")
    public String hello() {
        return "Hello admin 0923!";
    }
}
