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
    public List<Person> getAll(){
        return personService.getPerson();
    }

    @GetMapping("/{personId}")
    public Person getPersonById(@PathVariable Integer personId){
        return personService.getById(personId);
    }


    @GetMapping("/")
    public List<Person> getPersonByAge(@RequestParam Integer age){
        return personService.getPersonByAge(age);
    }

    @PostMapping("/")
    public void addPersona( @RequestBody @Valid Person person){

        Person p = new Person();
        p.setLastName("nombre");

        Person p2 = Person.builder().name("nombre").lastName("apellido").build();

        personService.add(person);
    }

}
