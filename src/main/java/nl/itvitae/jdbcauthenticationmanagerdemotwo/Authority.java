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

    @ManyToOne
    private User user;

    Authority() {}

    public Authority(User user, String authority) {
        this.username = user.getUsername();
        this.user = user;
        this.authority = authority;
    }
}
