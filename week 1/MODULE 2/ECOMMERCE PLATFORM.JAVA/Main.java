public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Keyboard", "Input");
        Product p2 = new Product(102, "Mouse", "Input");
        Product p3 = new Product(103, "Scanner", "Input");
        Product p4 = new Product(104, "Microphone", "Input");
        Product p5 = new Product(105, "Webcam", "Input");

        Product p6 = new Product(106, "Monitor", "Output");
        Product p7 = new Product(107, "Printer", "Output");
        Product p8 = new Product(108, "Speaker", "Output");
        Product p9 = new Product(109, "Projector", "Output");
        Product p10 = new Product(110, "Headphones", "Output");

        Product products[] = new Product[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10 };

        Search sc = new Search();
        sc.linearSearch(products, 105);
        sc.binarySearch(products, 105);
        sc.linearSearch(products, 116);
        sc.binarySearch(products, 116);
    }
}

class Product {
    private int id;
    private String name;
    private String category;

    Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    String getCategory() {
        return category;
    }
}

class Search {
    void linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.getId() == targetId) {
                System.out
                        .println("Linear search: Product found - " + product.getName() + " (" + product.getId() + ")");
                return;
            }
        }
        System.out.println("Linear search: Product with id " + targetId + " not found.");
    }

    void binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int currentId = products[mid].getId();

            if (currentId == targetId) {
                System.out
                        .println("Binary search: Product found - " + products[mid].getName() + " (" + currentId + ")");
                return;
            }

            if (currentId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Binary search: Product with id " + targetId + " not found.");
    }
}
