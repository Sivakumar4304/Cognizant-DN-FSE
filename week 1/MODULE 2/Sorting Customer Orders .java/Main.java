
public class Main {
    public static void main(String[] args) {

        Order o1 = new Order(101, 2500, "Rahul");
        Order o2 = new Order(102, 1200, "Priya");
        Order o3 = new Order(103, 3400, "Anjali");
        Order o4 = new Order(104, 1800, "Kiran");
        Order o5 = new Order(105, 2900, "Neha");
        Order o6 = new Order(106, 900, "Arjun");
        Order o7 = new Order(107, 4100, "Sneha");

        Order orders[] = new Order[] { o1, o2, o3, o4, o5, o6, o7 };

        Sorting s1 = new Sorting();
        s1.bubblesort(orders);

        Sorting s2 = new Sorting();
        s2.quicksort(orders, 0, orders.length - 1);

        System.out.println("After Quick Sort : ");

        for (int i = 0; i < orders.length; i++) {
            orders[i].display();
            System.out.println();
        }
    }
}