package com.github.truejacobg.reminderapp;

import com.github.truejacobg.reminderapp.user.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Testcontainers
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ReminderAppStatusTest {
    @Autowired
    private UserRepository userRepository;

    @BeforeAll
    static void init() {
        new MySQLContainer("mysql")
                .withDatabaseName("reminder-app")
                .withUsername("root2")
                .withPassword("root2")
                .start();
    }

    @Test
    void checkStatus() {
        assertEquals(1, 1);
    }
}
