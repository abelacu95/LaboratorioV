package com.utn.spring.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "persons")
public class Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Integer idPerson;

    private String firstname;

    private String lastname;

    @OneToMany(mappedBy = "person")
    List<Pet> pets = new ArrayList<Pet>();


}
