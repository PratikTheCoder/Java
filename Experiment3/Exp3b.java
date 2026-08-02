
class Exp3b {

    static int totalOrders = 0;

    void bill(int amount) {
        totalOrders++;
        System.out.println("Dine-in Bill: Rs. " + amount);
    }

    void bill(int amount, int packingCharge) {
        totalOrders++;
        System.out.println("Takeaway Bill: Rs. " + (amount + packingCharge));
    }

    void bill(int amount, int packingCharge, int deliveryCharge) {
        totalOrders++;
        System.out.println("Delivery Bill: Rs. " + (amount + packingCharge + deliveryCharge));
    }

    public static void main(String[] args) {

        Exp3b r = new Exp3b();

        r.bill(500);
        r.bill(500, 20);
        r.bill(500, 20, 50);

        System.out.println("Total Orders: " + totalOrders);
    }
}