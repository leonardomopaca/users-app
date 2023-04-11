package com.acme.usersapp.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -953015880193846586L;
    private Integer id;
    private String name;
    private LocalDate birthDate;
}
