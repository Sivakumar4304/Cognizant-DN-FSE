public class Search {
    // int[] array;

    void linearSearch(Product products[], int productId) {
        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == productId) {
                System.out.println("----- Linear Search -----");
                products[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product Not found");
        }
    }

    void binarySearch(Product products[], int productId) {
        int low = 0;
        int high = (products.length) - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (products[mid].productId == productId) {
                System.out.println("\n----- Binary Search -----");
                products[mid].display();
                return;
            } else if (products[mid].productId < productId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Product Not Found ");
    }
}
