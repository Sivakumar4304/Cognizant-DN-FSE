
class Sorting {

    void bubblesort(Order orders[]) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
        System.out.println("After Bubble Sort : ");
        for (int i = 0; i < n; i++) {
            orders[i].display();
            System.out.println();
        }

    }

    void quicksort(Order orders[], int low, int high) {
        if (low < high) {

            int pivot = orders[high].totalPrice;
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (orders[j].totalPrice < pivot) {
                    i++;
                    Order temp = orders[i];
                    orders[i] = orders[j];
                    orders[j] = temp;
                }
            }

            Order temp = orders[i + 1];
            orders[i + 1] = orders[high];
            orders[high] = temp;

            int pivotIndex = i + 1;
            quicksort(orders, low, pivotIndex - 1);
            quicksort(orders, pivotIndex + 1, high);

        }

    }
}