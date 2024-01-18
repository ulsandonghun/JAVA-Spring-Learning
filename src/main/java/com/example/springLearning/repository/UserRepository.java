package com.example.springLearning.repository;

import com.example.springLearning.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}
