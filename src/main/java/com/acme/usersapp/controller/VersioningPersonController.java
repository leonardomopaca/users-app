package com.acme.usersapp.controller;

import com.acme.usersapp.entity.Name;
import com.acme.usersapp.entity.Person;
import com.acme.usersapp.entity.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping("/v1/person")
    public Person getFirstVisionOfPerson(){
        return new Person(new Name("John", "Smith"));
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVisionOfPerson(){
        return new PersonV2("John Smith");
    }

    @GetMapping(value = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonRequestParameter(){
        return new PersonV2("John Smith");
    }

    @GetMapping(value = "/person", params = "version=1")
    public Person getFirstVersionOfPersonRequestParameter(){
        return new Person(new Name("John", "Smith"));
    }

}
