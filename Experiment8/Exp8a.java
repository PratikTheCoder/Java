package Experiment8;
class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee {
    String department;

    Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    void display() {
        System.out.println("ID: " + super.id);
        System.out.println("Name: " + super.name);
        System.out.println("Salary: " + super.salary);
        System.out.println("Department: " + department);
    }
}

public class Exp8a {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Pratik", 50000, "IT");
        m.display();
    }
}