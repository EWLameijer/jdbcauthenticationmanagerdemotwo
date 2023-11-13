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

    @OneToMany(mappedBy = "user")
    private Set<Authority> authorities = new HashSet<>();

    User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        enabled = true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
