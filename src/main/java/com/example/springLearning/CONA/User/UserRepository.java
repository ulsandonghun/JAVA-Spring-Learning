package com.example.springLearning.CONA.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 추가적인 사용자 검색 메서드가 필요한 경우 여기에 정의할 수 있습니다.
}
