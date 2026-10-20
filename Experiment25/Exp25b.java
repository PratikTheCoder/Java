package Experiment25;
class Bank {
    int balance = 1000;

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + "  Balance: $" + balance);
    }

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + "  Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class Deposit extends Thread {
    Bank b;

    Deposit(Bank b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.deposit(500);
        }
    }
}

class Withdraw extends Thread {
    Bank b;

    Withdraw(Bank b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.withdraw(300);
        }
    }
}

public class Exp25b {
    public static void main(String[] args) {
        Bank b = new Bank();

        Deposit t1 = new Deposit(b);
        Withdraw t2 = new Withdraw(b);

        t1.start();
        t2.start();
    }
}
