package Experiment18;
import java.awt.*;
import javax.swing.*;

class Exp18b {
    public static void main(String[] args) {
        JFrame f = new JFrame("Bank Balance Calculator");

        JLabel l1 = new JLabel("Initial Balance:");
        JLabel l2 = new JLabel("Transaction Amount:");
        JLabel l3 = new JLabel("Updated Balance:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton deposit = new JButton("Deposit");
        JButton withdraw = new JButton("Withdraw");

        f.setLayout(new GridLayout(4, 3, 10, 10));

        f.add(l1);
        f.add(t1);
        f.add(new JLabel(""));

        f.add(l2);
        f.add(t2);
        f.add(new JLabel(""));

        f.add(l3);
        f.add(t3);
        f.add(new JLabel(""));

        f.add(deposit);
        f.add(withdraw);

        deposit.addActionListener(e -> {
            double balance = Double.parseDouble(t1.getText());
            double amount = Double.parseDouble(t2.getText());
            double result = balance + amount;
            t3.setText(String.valueOf(result));
        });

        withdraw.addActionListener(e -> {
            double balance = Double.parseDouble(t1.getText());
            double amount = Double.parseDouble(t2.getText());
            double result = balance - amount;
            t3.setText(String.valueOf(result));
        });

        f.setSize(500, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
