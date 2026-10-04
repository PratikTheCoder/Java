package Experiment22;
import java.sql.*;
import java.util.Scanner;

public class Exp22a {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "symbichor9807";

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            String query = "SELECT * FROM login WHERE username = ? AND password = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Invalid Username or Password!");
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