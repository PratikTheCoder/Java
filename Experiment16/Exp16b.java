package Experiment16;
import java.util.Scanner;

class UnderAgeException extends Exception {
    UnderAgeException(String message) {
        super(message);
    }
}

public class Exp16b {

    static void checkLicenseEligibility(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException(
                "Not eligible for a driving license. Age must be 18 or above."
            );
        }

        System.out.println("Eligible for a driving license.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            checkLicenseEligibility(age);
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
