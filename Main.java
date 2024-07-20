package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception{
       // Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Srinivasa@1");
       Statement st = conn.createStatement();
        int result = st.executeUpdate("CREATE TABLE emp (id INT PRIMARY KEY, name VARCHAR(100), sal INT)");
        conn.close();




    }
}