package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Srinivasa@1");
        Statement st = conn.createStatement();
        int result = st.executeUpdate("update emp set name='Tendulkar' where id=3");
        System.out.println(result + " " + "records updated successfully");

        conn.close();
    }
}
