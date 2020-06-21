package com.utn.spring.service;

import com.utn.spring.model.Person;
import com.utn.spring.projections.PersonCant;
import com.utn.spring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void add(final Person newPerson) {
        personRepository.save(newPerson);
    }

    public Person getById(Integer id) {
        return personRepository.findById(id).get();
    }

    public List<Person> getPerson() {
        return personRepository.findAll();
    }

    public List<PersonCant> getPersonCant(){
        return personRepository.getPersonCant();
    }

    /*
    public List<Person> getPersonByAge(Integer age){

        return personRepository.findByAge(age);
        //todo
        //ver filter x edad. q metodo utilizar?
    }
*/

}
