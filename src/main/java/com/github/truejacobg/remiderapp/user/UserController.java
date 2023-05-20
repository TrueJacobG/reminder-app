package com.github.truejacobg.remiderapp.user;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    @GetMapping("/api/v1/status")
    @CrossOrigin(origins = "localhost:5173")
    public ResponseEntity<String> getStatus(){
        return ResponseEntity.ok(User.class.getSimpleName() + " controller works!");
    }
}
