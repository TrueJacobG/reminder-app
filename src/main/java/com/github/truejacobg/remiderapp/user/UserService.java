package com.github.truejacobg.remiderapp.user;

import com.github.truejacobg.remiderapp.exception.UserAlreadyRegisteredException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    UserRepository userRepository;

    public User addUser(User user) {
        if (userRepository.existsUserByEmailAndName(user.getEmail(), user.getName())) {
            throw new UserAlreadyRegisteredException();
        }

        return userRepository.save(user);
    }
}
