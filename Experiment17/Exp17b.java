package Experiment17;
import java.awt.*;
import javax.swing.*;

class Exp17b {
    public static void main(String[] args) {
        JFrame f = new JFrame("Employee Registration Form");

        JLabel l1 = new JLabel("Employee ID:");
        JLabel l2 = new JLabel("Name:");
        JLabel l3 = new JLabel("Department:");
        JLabel l4 = new JLabel("Salary:");

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
                    "Employee Details\n" +
                    "Employee ID: " + t1.getText() + "\n" +
                    "Name: " + t2.getText() + "\n" +
                    "Department: " + t3.getText() + "\n" +
                    "Salary: " + t4.getText());
        });

        f.setSize(400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}