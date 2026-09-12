package Experiment17;
import java.awt.*;
import javax.swing.*;

class Exp17a {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Registration Form");

        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Roll No:");
        JLabel l3 = new JLabel("Course:");
        JLabel l4 = new JLabel("Email:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JTextField t4 = new JTextField();

        JButton b = new JButton("Register");

        f.setLayout(new GridLayout(5, 2, 10, 10));

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(b);

        b.addActionListener(e -> {
            JOptionPane.showMessageDialog(f,
                    "Student Registered Successfully!\n" +
                    "Name: " + t1.getText() + "\n" +
                    "Roll No: " + t2.getText() + "\n" +
                    "Course: " + t3.getText() + "\n" +
                    "Email: " + t4.getText());
        });

        f.setSize(400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
