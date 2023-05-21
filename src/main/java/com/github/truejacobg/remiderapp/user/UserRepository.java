package com.github.truejacobg.remiderapp.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsUserByEmailAndName(String email, String name);
}
