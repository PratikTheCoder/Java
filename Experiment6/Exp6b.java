class Exp6b {

    String food = "Pizza";
    int quantity = 2;

    // Inner class
    class OrderDetails {
        void display() {
            System.out.println("Food Item : " + food);
            System.out.println("Quantity  : " + quantity);
        }
    }

    // Interface
    interface Delivery {
        void updateStatus();
    }

    public static void main(String[] args) {
        Exp6b obj = new Exp6b();

        // Inner class object
        OrderDetails order = obj.new OrderDetails();
        order.display();

        // Anonymous class
        Delivery d = new Delivery() {
            public void updateStatus() {
                System.out.println("Delivery Status: Order Delivered");
            }
        };

        d.updateStatus();
    }
}
