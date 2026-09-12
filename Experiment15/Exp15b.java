package Experiment15;
import java.util.Scanner;

public class Exp15b {

    static void verifyPin(int pin) throws Exception {
        if (pin != 1234) {
            throw new Exception("Invalid PIN!");
        }

        System.out.println("PIN verified successfully.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter ATM PIN: ");
            int pin = scanner.nextInt();

            verifyPin(pin);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("PIN verification process completed.");
            scanner.close();
        }
    }
}