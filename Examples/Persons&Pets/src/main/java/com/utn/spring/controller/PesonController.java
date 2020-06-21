package com.utn.spring.controller;


import com.utn.spring.model.Person;
import com.utn.spring.projections.PersonCant;
import com.utn.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PesonController {

    private final PersonService personService;

    @Autowired
    public PesonController( final PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{personId}")
    public Person getPersonById(@PathVariable Integer personId){
        return personService.getById(personId);
    }

    @PostMapping("/")
    public void addPerson(@RequestBody Person newPerson){
        personService.add(newPerson);
    }

    @GetMapping("/")
    public List<Person> getAll(){
        return personService.getPerson();
    }

    @GetMapping("/projection")
    public List<PersonCant> getPersonCant(){
        return personService.getPersonCant();
    }

}
