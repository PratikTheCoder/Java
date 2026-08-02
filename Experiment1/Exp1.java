package Experiment1;
class Exp1 {

    // Variables
    String name;
    int age;

    // Constructor
    Exp1(String n, int a) {
        name = n;
        age = a;
    }

    // Method
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    // Main Method
    public static void main(String[] args) {

        // Creating object
        Exp1 s1 = new Exp1("Pratik", 19);

        // Calling method
        s1.display();
    }
}