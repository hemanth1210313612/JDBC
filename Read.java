package org.example;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Read  {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Srinivasa@1");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from emp");

        while(rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int sal = rs.getInt("sal");
            System.out.println(id + " " + name + " " + sal);

        }
        rs.close();
        st.close();
        conn.close();
    }
}
