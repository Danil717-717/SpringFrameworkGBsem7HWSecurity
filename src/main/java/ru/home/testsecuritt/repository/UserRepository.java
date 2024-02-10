package ru.home.testsecuritt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.testsecuritt.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUsername(String username);
}
