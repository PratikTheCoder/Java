package Experiment8;
class Vehicle {
    String vehicleNo;
    String ownerName;

    Vehicle(String vehicleNo, String ownerName) {
        this.vehicleNo = vehicleNo;
        this.ownerName = ownerName;
    }
}

class Insurance extends Vehicle {
    double premium;

    Insurance(String vehicleNo, String ownerName, double premium) {
        super(vehicleNo, ownerName);
        this.premium = premium;
    }

    void display() {
        System.out.println("Vehicle No: " + super.vehicleNo);
        System.out.println("Owner Name: " + super.ownerName);
        System.out.println("Premium: " + premium);
    }
}

public class Exp8b {
    public static void main(String[] args) {
        Insurance i = new Insurance("MH12AB1234", "Pratik", 5000);

        i.display();
    }
}