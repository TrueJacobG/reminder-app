package com.github.truejacobg.reminderapp.user;

import com.github.truejacobg.reminderapp.exception.UserAlreadyRegisteredException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
