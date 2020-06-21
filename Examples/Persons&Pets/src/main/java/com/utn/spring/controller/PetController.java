package com.utn.spring.controller;


import com.utn.spring.model.Pet;
import com.utn.spring.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(final PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/{petId}")
    public Pet getPetById(@PathVariable Integer petId){
        return petService.getById(petId);
    }

    @PostMapping("/")
    public void addPet(@RequestBody Pet newPet){
        petService.add(newPet);
    }

    @GetMapping("/")
    public List<Pet> getAll(){
        return petService.getPet();
    }



}
