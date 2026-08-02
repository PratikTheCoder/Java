class Exp3a {

    static int count = 0;

    int add(int a, int b) {
        count++;
        return a + b;
    }

    double add(double a, double b) {
        count++;
        return a + b;
    }

    public static void main(String[] args) {

        Exp3a c = new Exp3a();

        System.out.println("Addition of Integers: " + c.add(10, 20));
        System.out.println("Addition of Decimals: " + c.add(10.5, 20.5));
        System.out.println("Total Calculations: " + count);
    }
}