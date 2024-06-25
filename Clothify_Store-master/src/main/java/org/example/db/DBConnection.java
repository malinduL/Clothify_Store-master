package org.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static  DBConnection instance;
    private final Connection connection;
    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost/clothifystore","root","6196508");
    }
    public static  DBConnection getInstance() throws SQLException, ClassNotFoundException {
        if (instance==null){
            instance=new DBConnection();
        }
        return instance;
    }
    public Connection getConnection(){
        return connection;
    }
}
