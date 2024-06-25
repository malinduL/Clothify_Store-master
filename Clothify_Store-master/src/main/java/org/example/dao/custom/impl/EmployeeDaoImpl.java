package org.example.dao.custom.impl;

import org.example.dao.custom.EmployeeDao;
import org.example.entity.Employee;
import org.hibernate.Session;
import org.modelmapper.ModelMapper;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public boolean save(EmployeeDao entity) {

        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.persist(entity);
        session.getTransaction().commit();
        session.close();
        return true;

//        try {
//            String SQL = "INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?)";
//            CrudUtil.execute(
//                    SQL,
//                    entity.getId(),
//                    entity.getCustomerTitle(),
//                    entity.getCustomerName(),
//                    entity.getDob(),
//                    entity.getSalary(),
//                    entity.getAddress(),
//                    entity.getCity(),
//                    entity.getProvince(),
//                    entity.getPostalCode()
//            );
//
//        } catch (SQLException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        return false;
    }

    @Override
    public boolean saveEmployee(Employee dto) {
        return false;
    }

    @Override
    public boolean save(Employee dto) {
        return false;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public boolean save(ModelMapper modelMapper) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    private static class HibernateUtil {
        public static Session getSession() {
            return null;
        }
    }
}
