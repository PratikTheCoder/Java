package Experiment22;
import java.sql.*;
import java.util.Scanner;

public class Exp22b {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "symbichor9807";

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            System.out.print("Enter Login ID: ");
            String loginId = sc.nextLine();

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            String query = "SELECT role FROM hospital_staff " +
                           "WHERE login_id = ? AND password = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, loginId);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                String role = rs.getString("role");

                System.out.println("Login Successful!");

                if (role.equals("Doctor")) {
                    System.out.println("Doctor Access Granted.");
                } 
                else if (role.equals("Nurse")) {
                    System.out.println("Nurse Access Granted.");
                }

            } else {
                System.out.println("Invalid Login ID or Password!");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}