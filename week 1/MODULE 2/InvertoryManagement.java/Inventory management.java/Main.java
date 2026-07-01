
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Product p1 = new Product(101, "Laptop", 100, 65000.50);
        Product p2 = new Product(102, "KeyBoard", 150, 1420.80);
        Product p3 = new Product(103, "Mouse", 66, 150.50);

        inventory.addproduct(p1);
        inventory.addproduct(p2);
        inventory.addproduct(p3);
        System.out.println("\nInventory :");
        inventory.display();

        inventory.updateproduct(103, "Wireless Mouse", 60, 150.50);
        System.out.println("Updated successfully");
        System.out.println("\nInventory :");
        inventory.display();

        inventory.deleteproduct(102);
        inventory.display();

    }
}
