package Experiment7;
class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(id + " " + name + " " + price);
    }
}

class Electronic extends Product {
    Electronic(int id, String name, double price) {
        super(id, name, price);
    }
}

class Clothing extends Product {
    Clothing(int id, String name, double price) {
        super(id, name, price);
    }
}

class Grocery extends Product {
    Grocery(int id, String name, double price) {
        super(id, name, price);
    }
}

public class Exp7b {
    public static void main(String[] args) {
        Electronic e = new Electronic(101, "Laptop", 55000);
        Clothing c = new Clothing(102, "Shirt", 1200);
        Grocery g = new Grocery(103, "Rice", 800);

        System.out.println("Electronic Product:");
        e.display();

        System.out.println("Clothing Product:");
        c.display();

        System.out.println("Grocery Product:");
        g.display();
    }
}