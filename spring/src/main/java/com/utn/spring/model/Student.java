package com.utn.spring.model;

import com.utn.spring.model.interfaces.IGetSalaryForStudent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student extends Person {


    IGetSalaryForStudent iGetSalaryForStudent;

    public Integer getSalary(){
        return iGetSalaryForStudent.getSalary();
    }

}
