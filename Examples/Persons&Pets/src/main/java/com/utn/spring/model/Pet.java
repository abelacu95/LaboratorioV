package com.utn.spring.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "pets")
public class Pet{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet")
    private Integer idPet;

    @Column(name = "name_pet")
    private String name;

    @Column(name = "weight")
    private String kg;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_person")
    @JsonBackReference
    private Person person;



}
