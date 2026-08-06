class Exp6a {

    // Inner class
    class Details {
        void display() {
            System.out.println("Vehicle: Car");
            System.out.println("Brand: Honda");
            System.out.println("Model: City");
        }
    }

    interface Action {
        void start();
    }

    public static void main(String[] args) {
        Exp6a obj = new Exp6a();

        // Inner class object
        Details d = obj.new Details();
        d.display();

        // Anonymous class
        Action a = new Action() {
            public void start() {
                System.out.println("Vehicle Started");
            }
        };

        a.start();
    }
}