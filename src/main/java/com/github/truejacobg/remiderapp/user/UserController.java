package com.github.truejacobg.remiderapp.user;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {
    UserService userService;

    @GetMapping("/status")
    @CrossOrigin(origins = "localhost:5173")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.ok(User.class.getSimpleName() + " controller works!");
    }

    @PostMapping("")
    @CrossOrigin(origins = "localhost:5173")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User newUser = userService.addUser(user);
        return ResponseEntity.ok(newUser);
    }
}
