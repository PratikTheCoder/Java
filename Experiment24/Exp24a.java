package Experiment24;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Exp24a extends JFrame {

    JTextField idField, nameField, authorField, priceField;
    JButton addButton, viewButton;

    String url = "jdbc:mysql://localhost:3306/college";
    String user = "root";
    String password = "symbichor9807";

    Exp24a() {

        setTitle("Library Management System");
        setSize(500, 400);
        setLayout(new GridLayout(6, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Book ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Book Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Author:"));
        authorField = new JTextField();
        add(authorField);

        add(new JLabel("Price:"));
        priceField = new JTextField();
        add(priceField);

        addButton = new JButton("Add Book");
        viewButton = new JButton("View Books");

        add(addButton);
        add(viewButton);

        addButton.addActionListener(e -> addBook());
        viewButton.addActionListener(e -> viewBooks());

        setVisible(true);
    }

    void addBook() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, user, password);

            String sql = "INSERT INTO books VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, Integer.parseInt(idField.getText()));
            ps.setString(2, nameField.getText());
            ps.setString(3, authorField.getText());
            ps.setDouble(4, Double.parseDouble(priceField.getText()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this,
                    "Book Added Successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    void viewBooks() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, user, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM books");

            StringBuilder data = new StringBuilder();

            while (rs.next()) {
                data.append("ID: ")
                    .append(rs.getInt("book_id"))
                    .append("\n");

                data.append("Name: ")
                    .append(rs.getString("book_name"))
                    .append("\n");

                data.append("Author: ")
                    .append(rs.getString("author"))
                    .append("\n");

                data.append("Price: ")
                    .append(rs.getDouble("price"))
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

    public static void main(String[] args) {
        new Exp24a();
    }
}
