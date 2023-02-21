package testswagger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testswagger.models.persistence.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

