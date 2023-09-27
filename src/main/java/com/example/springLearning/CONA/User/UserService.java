package com.example.springLearning.CONA.User;

import com.example.springLearning.CONA.User.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    User registerUser(User user);
    User getUserById(Long userId);
    // 필요에 따라 다른 사용자 검색 메서드를 추가할 수 있습니다.
}
