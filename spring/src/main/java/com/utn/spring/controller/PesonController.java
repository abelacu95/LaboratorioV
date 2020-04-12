package com.utn.spring.controller;


import com.utn.spring.model.Person;
import com.utn.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PesonController {

    private final PersonService personService;

    @Autowired
    public PesonController( final PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public List<Person> getPerson(){
        return personService.getPerson();

    }


    @PostMapping("/")
    public void addPersona( @RequestBody @Valid Person person){
        personService.add(person);
    }


}
