package nl.itvitae.jdbcauthenticationmanagerdemotwo;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String password;

    private boolean enabled;

    User() {} // default constructors ARE necessary

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        enabled = true;
    }

    public String getUsername() {
        return username;
    }
}
