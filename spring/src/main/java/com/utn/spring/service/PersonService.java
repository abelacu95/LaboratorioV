package com.utn.spring.service;

import com.utn.spring.model.Person;
import com.utn.spring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void add(final Person person) {
        personRepository.save(person);
    }

    public List<Person> getPerson() {
        return personRepository.findAll();
    }

    public Person getById(Integer id) {
        return personRepository.findById(id).get();
    }

    @Query
    public List<Person> getPersonByAge(Integer age){

        return personRepository.findByAge(age);
        //todo
        //ver filter x edad. q metodo utilizar?
    }

}
