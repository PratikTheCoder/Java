package Experiment19;
import java.sql.*;

public class Exp19b {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "symbichor9807";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root","symbichor9807");


            Statement stmt = con.createStatement();

            String query = "SELECT * FROM products";

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Product Details:");
            System.out.println("-------------------------");

            while (rs.next()) {
                System.out.println("Product ID: " + rs.getInt("product_id"));
                System.out.println("Product Name: " + rs.getString("product_name"));
                System.out.println("Quantity: " + rs.getInt("quantity"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("-------------------------");
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}