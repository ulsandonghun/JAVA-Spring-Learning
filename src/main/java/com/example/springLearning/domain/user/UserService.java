package com.example.springLearning.domain.user;


import com.example.springLearning.domain.squid.Squid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;

    }

    public void signup(User user) {
        // 회원가입 로직 구현
        userRepository.save(user);
    }

}
