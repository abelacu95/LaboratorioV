package com.utn.spring.service;


import com.utn.spring.model.Pet;
import com.utn.spring.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PetService {

    private PetRepository petRepository;

    @Autowired
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }


    public void add(final Pet newPet) {
        petRepository.save(newPet);
    }

    public Pet getById(Integer id) {
        return petRepository.findById(id).get();
    }

    public List<Pet> getPet() {
        return petRepository.findAll();
    }

}
