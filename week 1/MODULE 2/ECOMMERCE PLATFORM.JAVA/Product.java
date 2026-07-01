class Product {
    int productId;
    String productName;
    String Category;

    Product(int productId, String productName, String Category) {
        this.productId = productId;
        this.productName = productName;
        this.Category = Category;
    }

    void display() {
        System.out.println("product id :" + productId);
        System.out.println("product name :" + productName);
        System.out.println("Category :" + Category);
    }

}
