package Experiment20;

import java.sql.*;
import java.util.Scanner;

public class Exp20b {

    static String url = "jdbc:mysql://localhost:3306/college";
    static String user = "root";
    static String password = "symbichor9807";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            while (true) {

                System.out.println("\n--- STUDENT MANAGEMENT ---");
                System.out.println("1. Insert Student");
                System.out.println("2. Display Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                if (choice == 1) {

                    System.out.print("Enter Roll No: ");
                    int rollno = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    String query =
                        "INSERT INTO students VALUES (?, ?, ?, ?)";

                    PreparedStatement ps = con.prepareStatement(query);

                    ps.setInt(1, rollno);
                    ps.setString(2, name);
                    ps.setString(3, course);
                    ps.setInt(4, marks);

                    ps.executeUpdate();

                    System.out.println("Student inserted successfully.");

                    ps.close();

                } else if (choice == 2) {

                    String query = "SELECT * FROM students";

                    Statement stmt = con.createStatement();

                    ResultSet rs = stmt.executeQuery(query);

                    System.out.println("\nStudent Records:");

                    while (rs.next()) {

                        System.out.println(
                            rs.getInt("rollno") + "  " +
                            rs.getString("name") + "  " +
                            rs.getString("course") + "  " +
                            rs.getInt("marks")
                        );
                    }

                    rs.close();
                    stmt.close();

                } else if (choice == 3) {

                    System.out.print("Enter Roll No to update: ");
                    int rollno = sc.nextInt();

                    System.out.print("Enter new marks: ");
                    int marks = sc.nextInt();

                    String query =
                        "UPDATE students SET marks = ? WHERE rollno = ?";

                    PreparedStatement ps = con.prepareStatement(query);

                    ps.setInt(1, marks);
                    ps.setInt(2, rollno);

                    int rows = ps.executeUpdate();

                    if (rows > 0)
                        System.out.println("Student updated successfully.");
                    else
                        System.out.println("Student not found.");

                    ps.close();

                } else if (choice == 4) {

                    System.out.print("Enter Roll No to delete: ");
                    int rollno = sc.nextInt();

                    String query =
                        "DELETE FROM students WHERE rollno = ?";

                    PreparedStatement ps = con.prepareStatement(query);

                    ps.setInt(1, rollno);

                    int rows = ps.executeUpdate();

                    if (rows > 0)
                        System.out.println("Student deleted successfully.");
                    else
                        System.out.println("Student not found.");

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
