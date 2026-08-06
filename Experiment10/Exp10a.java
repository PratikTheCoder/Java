package Experiment10;
abstract class Payment {
    abstract void pay(double amount);
}

class CreditCard extends Payment {
    void pay(double amount) {
        System.out.println("Credit Card Payment: " + amount);
    }
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

public class Exp10a {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        p1.pay(5000);
        p2.pay(1200);
    }
}