package Experiment21;

import java.sql.*;

public class Exp21a {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "symbichor9807";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                url, user, password
            );

            System.out.println("Database connected successfully.");

            Statement stmt = con.createStatement();

            System.out.println("Connection Status: ACTIVE");

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Connection Failed!");
            System.out.println(e);
        }
    }
}