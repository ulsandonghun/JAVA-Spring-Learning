package com.example.springLearning.CONA.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<User, Long> {
}
