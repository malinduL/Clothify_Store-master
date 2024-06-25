package org.example.dao;

import org.example.Util.DaoType;
import org.example.dao.custom.SalesReturnDetailsDao;
import org.example.dao.custom.impl.*;

import static org.example.Util.BoType.*;

public class DaoFactory {

    private static DaoFactory instance;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return instance != null ? instance : (instance = new DaoFactory());
    }

    public <T extends SuperDao> T getDao(DaoType type) {
        switch (type) {
            case EMPLOYEE: return (T) new EmployeeDaoImpl();
            case ITEM: return (T) new ItemDaoImpl();
            case ORDER: return (T) new OrderDaoImpl();
            case ORDERDETAIL: return (T) new OrderDetailDaoImpl();
            case SALESRETURN:return (T) new SalesReturnDaoImpl();
            case SALESRETURNDETAILS: return (T) new SalesReturnDetailsDaoImpl();
            case SUPPLIER: return (T) new SupplierDaoImpl();
            case USER: return (T) new UserDaoImpl();

        }
        return null;
    }
}