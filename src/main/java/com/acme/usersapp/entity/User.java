package com.acme.usersapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "user_details")
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -953015880193846586L;

    @Id
    @GeneratedValue
    private Integer id;

    @Size(min=2, message = "Name should have at least 2 characters")
    @JsonProperty("user_name")
    private String name;

    @Past(message = "Date of Birth cannot be in the future")
    @JsonProperty("birth_date")
    private LocalDate birthDate;
}
