
class Order {
    // orderId, customerName, and totalPrice

    int orderId;
    int totalPrice;
    String customerName;

    Order(int orderId, int totalPrice,
            String customerName) {
        this.orderId = orderId;
        this.totalPrice = totalPrice;
        this.customerName = customerName;
    }

    void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("order Id : " + orderId);
        System.out.println("total Price : " + totalPrice);
    }

}
