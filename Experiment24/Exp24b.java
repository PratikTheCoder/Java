package Experiment24;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Exp24b extends JFrame {

    JTextField bookId, studentName, issueDate, returnDate;
    JButton addButton, viewButton, deleteButton;

    String url = "jdbc:mysql://localhost:3306/college";
    String user = "root";
    String password = "symbichor9807";

    Exp24b() {

        setTitle("Book Issue Tracking System");
        setSize(500, 400);
        setLayout(new GridLayout(7, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Book ID:"));
        bookId = new JTextField();
        add(bookId);

        add(new JLabel("Student Name:"));
        studentName = new JTextField();
        add(studentName);

        add(new JLabel("Issue Date (YYYY-MM-DD):"));
        issueDate = new JTextField();
        add(issueDate);

        add(new JLabel("Return Date (YYYY-MM-DD):"));
        returnDate = new JTextField();
        add(returnDate);

        addButton = new JButton("Issue Book");
        viewButton = new JButton("View Records");
        deleteButton = new JButton("Delete Record");

        add(addButton);
        add(viewButton);
        add(deleteButton);

        addButton.addActionListener(e -> addRecord());
        viewButton.addActionListener(e -> viewRecords());
        deleteButton.addActionListener(e -> deleteRecord());

        setVisible(true);
    }

    void addRecord() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, user, password);

            String sql = "INSERT INTO book_issue VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, Integer.parseInt(bookId.getText()));
            ps.setString(2, studentName.getText());
            ps.setDate(3, Date.valueOf(issueDate.getText()));
            ps.setDate(4, Date.valueOf(returnDate.getText()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this,
                    "Book Issue Record Added!");

            ps.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    void viewRecords() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, user, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM book_issue");

            StringBuilder data = new StringBuilder();

            while (rs.next()) {

                data.append("Book ID: ")
                    .append(rs.getInt("book_id"))
                    .append("\n");

                data.append("Student: ")
                    .append(rs.getString("student_name"))
                    .append("\n");

                data.append("Issue Date: ")
                    .append(rs.getDate("issue_date"))
                    .append("\n");

                data.append("Return Date: ")
                    .append(rs.getDate("return_date"))
                    .append("\n");

                data.append("----------------------\n");
            }

            JOptionPane.showMessageDialog(this, data.toString());

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    void deleteRecord() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, user, password);

            String sql = "DELETE FROM book_issue WHERE book_id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, Integer.parseInt(bookId.getText()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this,
                    "Record Deleted Successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Exp24b();
    }
}
