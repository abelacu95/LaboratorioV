package com.utn.rest.controller;

import com.utn.rest.model.Pet;
import com.utn.rest.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    IntegrationService integrationService;

    @GetMapping("/pet")
    public Pet getPet() {
        return integrationService.getPet();
    }
}
