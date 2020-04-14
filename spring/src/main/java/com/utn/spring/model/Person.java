package com.utn.spring.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Person {

    @Id
    @GeneratedValue
    private Integer idPerson;

    @NotNull
    private String name;
    @NotNull
    private String lastName;
    @NotNull
    private Integer age;



    public Person setName (String name){
        this.name = name;
        return this;
    }


}
