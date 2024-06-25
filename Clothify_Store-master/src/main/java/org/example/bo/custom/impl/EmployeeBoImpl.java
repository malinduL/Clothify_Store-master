package org.example.bo.custom.impl;

import org.example.bo.custom.EmployeeBo;
import org.example.entity.Employee;

public class EmployeeBoImpl implements EmployeeBo {

    @Override
    public boolean saveEmployee(Employee dto) {
        return false;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }
}


