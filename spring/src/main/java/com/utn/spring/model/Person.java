package com.utn.spring.model;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Integer idPerson;

    @NotNull
    private String name;
    @NotNull
    private String lastName;

 
    
}
