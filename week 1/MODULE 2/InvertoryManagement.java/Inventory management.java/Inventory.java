import java.util.HashMap;

public class Inventory {

    HashMap<Integer, Product> products = new HashMap<>();

    // addproduct
    void addproduct(Product product) {
        products.put(product.productId, product);
        System.out.println("Product added");
        System.out.println();
    }

    // updateproduct
    void updateproduct(int productId, String productName, int quantity, Double price) {

        if (products.containsKey(productId)) {
            Product p = products.get(productId);
            p.productName = productName;
            p.quantity = quantity;
            p.price = price;
            System.out.println("Updated succesfully ");
            System.out.println();

        } else {
            System.out.println("product not found");
            System.out.println();

        }

    }

    // deleteproduct
    void deleteproduct(int productId) {
        products.remove(productId);
        System.out.println("product removed sucessfully ");
        System.out.println();

    }

    void display() {
        if (products.isEmpty()) {
            System.out.println("List is empty");
            System.out.println();

        } else {
            System.out.println("Displaying details :");
            System.out.println();

            for (Product p : products.values()) {
                p.display();

                System.out.println();
            }
        }
    }

}
