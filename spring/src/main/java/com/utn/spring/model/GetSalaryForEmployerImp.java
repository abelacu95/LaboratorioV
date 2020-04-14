package com.utn.spring.model;

import com.utn.spring.model.interfaces.IGetSalaryForStudent;

public class GetSalaryForEmployerImp implements IGetSalaryForStudent {


    @Override
    public Integer getSalary() {
        return new Integer(100 );
    }
}
