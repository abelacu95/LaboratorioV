package com.utn.rest.service;

import com.utn.rest.model.Pet;
import com.utn.rest.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;

    public Pet getPet() {
        return integrationComponent.getPetsFromApi();
    }
}
