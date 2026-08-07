package Experiment11;
class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void printDetails() {
        System.out.println("Student Details");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}

class Employee {
    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void printDetails() {
        System.out.println("Employee Details");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
    }
}

public class Exp11a {
    public static void main(String[] args) {
        Student s = new Student(101, "Pratik");
        Employee e = new Employee(201, "Rahul");

        s.printDetails();
        System.out.println();
        e.printDetails();
    }
}