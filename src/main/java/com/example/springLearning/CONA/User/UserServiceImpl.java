package com.example.springLearning.CONA.User;

import com.example.springLearning.CONA.User.User;
import com.example.springLearning.CONA.User.UserRepository;
import com.example.springLearning.CONA.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        // 사용자 등록 로직을 구현합니다.
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        // 사용자 검색 로직을 구현합니다.
        Optional<User> userOptional = userRepository.findById(userId);
        return userOptional.orElse(null);
    }

    // 다른 검색 메서드나 기능을 추가할 수 있습니다.
}
