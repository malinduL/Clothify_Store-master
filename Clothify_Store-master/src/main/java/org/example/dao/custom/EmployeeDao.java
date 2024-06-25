package org.example.dao.custom;

import org.example.bo.SuperBo;
import org.example.entity.Employee;
import org.modelmapper.ModelMapper;

public interface EmployeeDao extends SuperBo {

    boolean save(EmployeeDao entity);

    boolean saveEmployee(Employee dto);

    boolean save(Employee dto);

    boolean deleteById(String id);

    boolean save(ModelMapper modelMapper);

    boolean delete(String id);
}

