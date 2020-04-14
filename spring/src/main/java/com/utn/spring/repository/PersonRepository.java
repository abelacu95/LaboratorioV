package com.utn.spring.repository;

import com.utn.spring.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository <Person, Integer > {

    public List<Person> findByAge(int age);

}
