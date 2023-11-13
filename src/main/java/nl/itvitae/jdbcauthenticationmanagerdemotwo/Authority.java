package nl.itvitae.jdbcauthenticationmanagerdemotwo;

import jakarta.persistence.*;

@Entity
@Table(name="authorities")
public class Authority {
    @Id
    private String username;

    private String authority;

    Authority() {}

    public Authority(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }
}
