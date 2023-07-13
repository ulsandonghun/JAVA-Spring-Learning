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

    public void signUp(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());


        userRepository.save(user);
    }

    public void login(UserDto userDto) {
        // 로그인 로직을 구현
    }
}
