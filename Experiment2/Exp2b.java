package Experiment2;
class Exp2b {

    String brand;
    String model;
    int price;

    Exp2b() {
        brand = "Samsung";
        model = "A15";
        price = 18000;
    }

    Exp2b(String b, String m, int p) {
        brand = b;
        model = m;
        price = p;
    }

    Exp2b(Exp2b m) {
        brand = m.brand;
        model = m.model;
        price = m.price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Exp2b m1 = new Exp2b();

        Exp2b m2 = new Exp2b("Apple", "iPhone 15", 79999);

        Exp2b m3 = new Exp2b(m2);

        System.out.println("Default Constructor:");
        m1.display();

        System.out.println();

        System.out.println("Parameterized Constructor:");
        m2.display();

        System.out.println();

        System.out.println("Duplicate Object (Copy Constructor):");
        m3.display();
    }
}