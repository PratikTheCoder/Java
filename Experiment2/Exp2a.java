package Experiment2; 
class Exp2a {

    String name;
    int rollNo;

    Exp2a() {
        name = "Unknown";
        rollNo = 0;
    }

    Exp2a(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {

        Exp2a s1 = new Exp2a();

        Exp2a s2 = new Exp2a("Pratik", 101);

        System.out.println("Default Constructor:");
        s1.display();

        System.out.println();

        System.out.println("Parameterized Constructor:");
        s2.display();
    }
}