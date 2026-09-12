package Experiment18;
import java.awt.*;
import javax.swing.*;

class Exp18a {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");

        JLabel l1 = new JLabel("Number 1:");
        JLabel l2 = new JLabel("Number 2:");
        JLabel l3 = new JLabel("Result:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton add = new JButton("Add");
        JButton sub = new JButton("Subtract");

        f.setLayout(new GridLayout(4, 3, 10, 10));

        f.add(l1);
        f.add(t1);
        f.add(add);

        f.add(l2);
        f.add(t2);
        f.add(sub);

        f.add(l3);
        f.add(t3);

        add.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(a + b));
        });

        sub.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(a - b));
        });

        f.setSize(450, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}