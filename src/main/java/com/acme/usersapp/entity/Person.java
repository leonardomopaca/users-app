package com.acme.usersapp.entity;

public class Person {
    private Name name;
    private String fullname;

    public Person(Name name) {
        this.name = name;
    }

    public Person(String fullname) {
        this.fullname = fullname;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                '}';
    }
}
