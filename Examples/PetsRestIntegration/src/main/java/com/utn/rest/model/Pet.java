package com.utn.rest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pet {

    private Integer id;
    private String name;
    private Integer kg;

}
