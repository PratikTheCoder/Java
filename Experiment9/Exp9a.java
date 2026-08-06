package Experiment9;
class BankAccount {
    final int accountNumber;
    String name;
    double balance;

    BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Exp9a {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, "Pratik", 5000);

        b.display();
    }
}