package com.utn.spring.repository;

import com.utn.spring.model.Person;
import com.utn.spring.projections.PersonCant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository <Person, Integer > {


    //@Query(value = "select * from persons firstname = ?1", nativeQuery = true)
    //public List<Person> findByName(String name);


    @Query(value= " select p.firstname , count(pets.id_pet) as cant from persons p " +
            "inner join pets on p.id_person = pets.id_person" +
            " group by (p.id_person) ", nativeQuery = true)
    List<PersonCant> getPersonCant();


}
