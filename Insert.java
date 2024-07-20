package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) throws Exception{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Srinivasa@1");
        Statement st = conn.createStatement();
        int result1 = st.executeUpdate("Insert into emp values (1, 'virat',1000);");
        int result2 = st.executeUpdate("Insert into emp values (4, 'virat',10000);");
        int result3 = st.executeUpdate("Insert into emp values (3, 'Sachin',100);");


        conn.close();

    }
}
