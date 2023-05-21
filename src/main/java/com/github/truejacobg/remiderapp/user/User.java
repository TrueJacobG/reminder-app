package com.github.truejacobg.remiderapp.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private long id;

    private String name;
    private String email;

    @Column(name = "auth_data")
    @JsonProperty("auth_data")
    private String authData;
}
