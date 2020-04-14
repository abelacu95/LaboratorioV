package com.utn.spring.model;

import com.utn.spring.model.interfaces.IGetSalaryForStudent;

public class GetSalaryForStudentImp implements IGetSalaryForStudent {


    @Override
    public Integer getSalary() {
        return new Integer(10 );
    }
}
