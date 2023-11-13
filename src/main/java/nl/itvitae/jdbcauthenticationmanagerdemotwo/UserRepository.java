package nl.itvitae.jdbcauthenticationmanagerdemotwo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
