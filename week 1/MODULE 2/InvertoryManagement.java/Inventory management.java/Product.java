class Product {
    int productId;
    String productName;
    int quantity;
    Double price;

    Product(int productId, String productName, int quantity, Double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID :" + productId);
        System.out.println("product Name :" + productName);
        System.out.println("quantity :" + quantity);
        System.out.println("price : " + price);
    }
}
