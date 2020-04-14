package com.utn.spring.model;

import com.utn.spring.model.interfaces.IGetSalaryForEmployer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employer extends Person {

    IGetSalaryForEmployer iGetSalaryForEmployer;


}
