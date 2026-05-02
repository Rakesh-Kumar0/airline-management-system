package airlinemanagementsystem;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection to the database
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagementsystem", "root", "8687rakesh@");// use your own database credentials
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}