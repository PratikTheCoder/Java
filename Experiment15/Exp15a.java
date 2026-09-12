package Experiment15;
import java.util.Scanner;

public class Exp15a {

    static void login(String password) throws Exception {
        if (!password.equals("java123")) {
            throw new Exception("Invalid password!");
        }

        System.out.println("Login successful.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            login(password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Login process completed.");
            scanner.close();
        }
    }
}