package com.jspiders.esm.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeDAO {
    private final String dburl="jdbc:mysql://localhost:3306/emp";
    private final String user="root";
    private final String password="Root@123";

    public void save(EmployeeDTO empDto){
        String insertsql="insert into newdb.emp values(0,?,?,?,?,?,?,?);";

        try{
            Connection con= DriverManager.getConnection(dburl,user,password);
            PreparedStatement psm1=con.prepareStatement(insertsql);

            
            psm1.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
