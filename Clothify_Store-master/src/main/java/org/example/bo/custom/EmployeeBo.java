package org.example.bo.custom;

import org.example.bo.SuperBo;
import org.example.entity.Employee;

public interface EmployeeBo extends SuperBo {

    boolean saveEmployee(Employee dto);
    boolean deleteById(String id);
}
