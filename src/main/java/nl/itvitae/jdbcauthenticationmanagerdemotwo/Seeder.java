package nl.itvitae.jdbcauthenticationmanagerdemotwo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Seeder implements CommandLineRunner {

    private final UserRepository userRepository;

    private final AuthorityRepository authorityRepository;

    private final PasswordEncoder passwordEncoder;

    public Seeder(UserRepository userRepository, AuthorityRepository authorityRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        authorityRepository.deleteAll();
        userRepository.deleteAll();

        if (userRepository.count() == 0) {
            User bill = new User("bill", passwordEncoder.encode("secret"));
            userRepository.save(bill);
            Authority billsRole = new Authority(bill.getUsername(), "ROLE_ADMIN");
            authorityRepository.save(billsRole);
            User jane= new User("jane", passwordEncoder.encode("password"));
            userRepository.save(jane);
            Authority janesRole = new Authority(jane.getUsername(), "ROLE_USER");
            authorityRepository.save(janesRole);
        }
    }
}
