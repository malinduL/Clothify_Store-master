package org.example.bo;

import org.example.Util.BoType;
import org.example.bo.custom.impl.EmployeeBoImpl;
import org.example.dao.custom.impl.*;

public class BoFactory {
    private static BoFactory instance;

    private BoFactory() {
    }

    public static BoFactory getInstance() {
        return instance != null ? instance : (instance = new BoFactory());
    }

    public <T extends SuperBo> T getBo(BoType type) {
        switch (type) {
            case EMPLOYEE:return (T)new EmployeeBoImpl();
            case ITEM:return (T)new ItemDaoImpl();
            case ORDER:return (T)new OrderDaoImpl();
            case ORDERDETAILS:return (T)new OrderDetailDaoImpl();
            case SALESRETURN:return (T)new SalesReturnDaoImpl();
            case SALESRETURNDETAILS:return (T)new SalesReturnDetailsDaoImpl();
            case SUPPLIER:return (T)new SupplierDaoImpl();
            case USER:return (T)new UserDaoImpl();
        }
        return null;
    }
}