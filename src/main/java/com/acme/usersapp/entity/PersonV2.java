package com.acme.usersapp.entity;

import lombok.Getter;

@Getter
public class PersonV2 {
    private String name;

    public PersonV2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonV2{" +
                "name='" + name + '\'' +
                '}';
    }
}
