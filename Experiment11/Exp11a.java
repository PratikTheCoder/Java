package Experiment11;
interface Printable {
    void print();
}

class Student implements Printable {
    public void print() {
        System.out.println("Student Details");
        System.out.println("Name: Pratik");
        System.out.println("Roll No: 101");
    }
}

class Employee implements Printable {
    public void print() {
        System.out.println("Employee Details");
        System.out.println("Name: Rahul");
        System.out.println("ID: 201");
    }
}

public class Exp11a {
    public static void main(String[] args) {
        Student s = new Student();
        Employee e = new Employee();

        s.print();
        e.print();
    }
}