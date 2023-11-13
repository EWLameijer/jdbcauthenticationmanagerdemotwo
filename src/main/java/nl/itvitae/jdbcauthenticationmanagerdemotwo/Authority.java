package nl.itvitae.jdbcauthenticationmanagerdemotwo;

import jakarta.persistence.*;

@Entity
@Table(name="authorities")
public class Authority {
    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String authority;

    Authority() {}

    public Authority(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }
}
