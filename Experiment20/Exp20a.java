package Experiment20;
import java.sql.*;
import java.util.Scanner;

public class Exp20a {

    static String url = "jdbc:mysql://localhost:3306/college";
    static String user = "root";
    static String password = "symbichor9807";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            while (true) {

                System.out.println("\n--- EMPLOYEE MANAGEMENT ---");
                System.out.println("1. Insert Employee");
                System.out.println("2. Display Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                if (choice == 1) {

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    String query = "INSERT INTO employees VALUES (?, ?, ?, ?)";

                    PreparedStatement ps = con.prepareStatement(query);

                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setString(3, dept);
                    ps.setDouble(4, salary);

                    ps.executeUpdate();

                    System.out.println("Employee inserted successfully.");

                    ps.close();

                } else if (choice == 2) {

                    String query = "SELECT * FROM employees";

                    Statement stmt = con.createStatement();

                    ResultSet rs = stmt.executeQuery(query);

                    System.out.println("\nEmployee Records:");

                    while (rs.next()) {
                        System.out.println(
                            rs.getInt("empid") + "  " +
                            rs.getString("name") + "  " +
                            rs.getString("department") + "  " +
                            rs.getDouble("salary")
                        );
                    }

                    rs.close();
                    stmt.close();

                } else if (choice == 3) {

                    System.out.print("Enter Employee ID to update: ");
                    int id = sc.nextInt();

                    System.out.print("Enter new salary: ");
                    double salary = sc.nextDouble();

                    String query = "UPDATE employees SET salary = ? WHERE empid = ?";

                    PreparedStatement ps = con.prepareStatement(query);

                    ps.setDouble(1, salary);
                    ps.setInt(2, id);

                    int rows = ps.executeUpdate();

                    if (rows > 0)
                        System.out.println("Employee updated successfully.");
                    else
                        System.out.println("Employee not found.");

                    ps.close();

                } else if (choice == 4) {

                    System.out.print("Enter Employee ID to delete: ");
                    int id = sc.nextInt();

                    String query = "DELETE FROM employees WHERE empid = ?";

                    PreparedStatement ps = con.prepareStatement(query);

                    ps.setInt(1, id);

                    int rows = ps.executeUpdate();

                    if (rows > 0)
                        System.out.println("Employee deleted successfully.");
                    else
                        System.out.println("Employee not found.");

                    ps.close();

                } else if (choice == 5) {

                    System.out.println("Program ended.");
                    con.close();
                    break;

                } else {
                    System.out.println("Invalid choice.");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}