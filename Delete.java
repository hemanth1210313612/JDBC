package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Srinivasa@1");
        Statement st = conn.createStatement();
        int result = st.executeUpdate("DELETE FROM emp WHERE sal = 1000;");
        System.out.println(result+" "+ "deleted successfully");
        conn.close();

    }
}
